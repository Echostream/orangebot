package com.echostream.orangebot.http;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class HttpServiceConfiguration {
    @Value("${telegram.bot.token}")
    private String botToken;

    @Bean
    public TelegramInterface getTelegramInterface() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.telegram.org/bot" + botToken + "/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(TelegramInterface.class);
    }
}
