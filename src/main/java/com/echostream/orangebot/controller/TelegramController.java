package com.echostream.orangebot.controller;

import com.echostream.orangebot.dto.telegram.MessageDto;
import com.echostream.orangebot.dto.telegram.UpdateDto;
import com.echostream.orangebot.enums.TgCmdEnum;
import com.echostream.orangebot.exception.ForbiddenException;
import com.echostream.orangebot.service.SchedulerSrv;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.io.IOException;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/telegram")
public class TelegramController {
    @Value("${telegram.bot.token}")
    private String botToken;

    @Resource
    SchedulerSrv schedulerSrv;

    @ApiOperation("telegram消息监听")
    @PostMapping("listener/{token}")
    public String listener(@PathVariable("token") String token,
                           @Valid @RequestBody UpdateDto update) throws IOException {
        log.info("telegram update: {}", update);
        ForbiddenException.isTrue(botToken.equals(token), "路径错误");
        if (update.getMessage() != null) {
            Integer chatId = update.getMessage().getChat().getId();
            Optional<MessageDto.Command> optCommand = update.getMessage().extractCommand();
            if (!optCommand.isPresent() || !optCommand.get().validateCommand()) {
                return "ok";
            }
            switch (TgCmdEnum.fromCommand(optCommand.get().getCommand())) {
                case CLOCK:
                    schedulerSrv.clock(chatId);
                    break;
                case SCHEDULER:
                    break;
                default:
            }
        }
        return "ok";
    }

}
