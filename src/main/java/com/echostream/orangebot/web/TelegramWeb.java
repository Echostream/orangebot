package com.echostream.orangebot.web;

import com.echostream.orangebot.api.TelegramApi;
import com.echostream.orangebot.dto.telegram.MessageDto;
import com.echostream.orangebot.dto.telegram.UpdateDto;
import com.echostream.orangebot.dto.telegram.request.SentMessageDto;
import com.echostream.orangebot.enums.TgCmdEnum;
import com.echostream.orangebot.exception.ForbiddenException;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/telegram")
public class TelegramWeb {
    @Value("${telegram.bot.token}")
    private String botToken;
    @Value("${telegram.bot.name}")
    private String botName;

    @Autowired
    private TelegramApi telegramApi;

    @ApiOperation("telegram消息监听")
    @PostMapping("listener/{token}")
    public String listener(@PathVariable("token") String token,
                           @Valid @RequestBody UpdateDto update) {
        ForbiddenException.isTrue(botToken.equals(token), "路径错误");
        if (update.getMessage() != null) {
            Integer chatId = update.getMessage().getChat().getId();
            Optional<MessageDto.Command> optCommand = update.getMessage().extractCommand();
            if (!optCommand.isPresent()) {
                return "ok";
            }
            MessageDto.Command command = optCommand.get();
            if (StringUtils.isEmpty(command.getCommand())) {
                return "ok";
            }
            if (!StringUtils.isEmpty(command.getCommandOwner()) && !botName.equals(command.getCommandOwner())) {
                return "ok";
            }
            switch (TgCmdEnum.fromCommand(command.getCommand())) {
                case CLOCK:
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    SentMessageDto sentMessage = new SentMessageDto();
                    sentMessage.setChatId(chatId);
                    sentMessage.setText(sdf.format(new Date()));
                    telegramApi.sendMessage(sentMessage);
                    break;
                case SCHEDULER:
                    break;
                default:
            }
        }
        return "ok";
    }
}
