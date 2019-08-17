package com.echostream.orangebot.http;

import com.echostream.orangebot.dto.telegram.GetUpdateDto;
import com.echostream.orangebot.dto.telegram.UpdateDto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.List;

public interface TelegramInterface {
    @POST("/getUpdate")
    Call<List<UpdateDto>> getUpdate(@Body GetUpdateDto getUpdateDto);
}
