package com.echostream.orangebot.service.impl;

import com.echostream.orangebot.api.TelegramApi;
import com.echostream.orangebot.dto.telegram.MessageDto;
import com.echostream.orangebot.dto.telegram.request.SentMessageDto;
import com.echostream.orangebot.exception.InternalErrorException;
import com.echostream.orangebot.service.SchedulerSrv;
import lombok.extern.slf4j.Slf4j;
import okhttp3.ResponseBody;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import javax.annotation.Resource;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Service
public class SchedulerImpl implements SchedulerSrv {

    @Resource
    private TelegramApi telegramApi;

    @Override
    public void clock(Integer chatId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SentMessageDto sentMessage = new SentMessageDto();
        sentMessage.setChatId(chatId);
        sentMessage.setText(sdf.format(new Date()));
        Call<MessageDto> messageDtoCall = telegramApi.sendMessage(sentMessage);
        Response<MessageDto> response;
        try {
            response = messageDtoCall.execute();
            ResponseBody reason = response.errorBody();
            InternalErrorException.isTrue(response.isSuccessful(), reason == null ? "" : reason.string());
        } catch (IOException e) {
            throw new InternalErrorException(e);
        }
    }

    @Override
    public void scheduleredMsg(Date trigger, String message) {

    }

}
