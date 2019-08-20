package com.echostream.orangebot.api;

import com.echostream.orangebot.dto.telegram.MessageDto;
import com.echostream.orangebot.dto.telegram.request.SentMessageDto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface TelegramApi {

    @POST("sendMessage")
    Call<MessageDto> sendMessage(@Body SentMessageDto message);

}
