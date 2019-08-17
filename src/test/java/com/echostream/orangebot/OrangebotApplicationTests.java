package com.echostream.orangebot;

import com.echostream.orangebot.dto.telegram.GetUpdateDto;
import com.echostream.orangebot.http.TelegramInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(value = "test")
public class OrangebotApplicationTests {
    @Autowired
    private TelegramInterface telegramInterface;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGetUpdate() throws IOException {
        System.out.println("telegramInterface = " + telegramInterface);
        GetUpdateDto getUpdateDto = new GetUpdateDto();
        getUpdateDto.setAllowedUpdates(Collections.emptyList());
        getUpdateDto.setLimit(1);
        getUpdateDto.setOffset(0);
        getUpdateDto.setTimeout(0);
//        List<UpdateDto> result = telegramInterface.getUpdate(getUpdateDto).execute().body();
//        System.out.println("result = " + result);
    }
}
