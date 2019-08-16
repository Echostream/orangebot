package com.echostream.orangebot.web;

import com.echostream.orangebot.dto.telegram.MessageDto;
import com.echostream.orangebot.dto.telegram.UpdateDto;
import com.echostream.orangebot.enums.TgCmdEnum;
import com.echostream.orangebot.exception.ForbiddenException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/telegram")
public class TelegramWeb {


    @Value("${telegram.bot.token}")
    private String botToken;
    @Value("${telegram.bot.name}")
    private String botName;

    @PostMapping("listener/{token}")
    public String listener(@PathVariable("token") String token,
                           @RequestBody UpdateDto update) {
        ForbiddenException.isTrue(!botToken.equals(token), "路径错误");
        if (update.getMessage() != null) {
            @NotNull Integer chatId = update.getMessage().getChat().getId();
            Optional<MessageDto.Command> optCommand = update.getMessage().extractCommand();
            if (!optCommand.isPresent()) {
                return "ok";
            }
            MessageDto.Command command = optCommand.get();
            if (!botName.equals(command.getCommandOwner())) {
                return "ok";
            }
            switch (TgCmdEnum.valueOf(command.getCommand())) {
                case CLOCK:
                    break;
                case SCHEDULER:
                    break;
                default:
            }
        }
        return "ok";
    }


}
