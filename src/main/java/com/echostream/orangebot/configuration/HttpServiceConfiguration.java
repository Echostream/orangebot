package com.echostream.orangebot.configuration;

import com.echostream.orangebot.api.TelegramApi;
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
    public TelegramApi getTelegramInterface() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(String.format("https://api.telegram.org/bot%s/", botToken))
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(TelegramApi.class);
    }
}
