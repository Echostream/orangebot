package com.echostream.orangebot;

import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class OrangebotApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void jasypt() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("j^z756Pm7e");
        //要加密的数据（数据库的用户名或密码）
        String password = textEncryptor.encrypt("123456");
        System.out.println("password:"+password);
    }

}
