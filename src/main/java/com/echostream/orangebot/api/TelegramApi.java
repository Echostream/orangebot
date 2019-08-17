package com.echostream.orangebot.api;

import com.echostream.orangebot.dto.telegram.MessageDto;
import com.echostream.orangebot.dto.telegram.request.SentMessageDto;

public interface TelegramApi {
    MessageDto sendMessage(SentMessageDto message);
}
