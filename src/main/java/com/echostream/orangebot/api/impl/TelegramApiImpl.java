package com.echostream.orangebot.api.impl;

import com.echostream.orangebot.api.TelegramApi;
import com.echostream.orangebot.dto.telegram.MessageDto;
import com.echostream.orangebot.dto.telegram.request.SentMessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class TelegramApiImpl implements TelegramApi {

    @Autowired
    RestTemplate restTemplate;

    private final static String telegramApiUrl = "https://api.telegram.org/bot901710054:AAEU580y4y5N3OxZIP3OC2rWLCH9JILmrqA";

    @Override
    public MessageDto sendMessage(SentMessageDto message) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        HttpEntity<SentMessageDto> request = new HttpEntity(message, headers);
        ResponseEntity<MessageDto> response = restTemplate.exchange(telegramApiUrl+"/sendMessage", HttpMethod.POST, request,
                MessageDto.class);
        return response.getBody();
    }


}
