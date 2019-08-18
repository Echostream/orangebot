package com.echostream.orangebot;

import com.echostream.orangebot.dto.common.IResponse;
import lombok.ToString;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommanTests {

    @Test
    public void testRex() {
        // 按指定模式在字符串查找
        String line = "/}hello";
        String pattern = "^(/[a-z0-9_]*)?(@[a-z0-9_]+)?(.*)$";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void testIResponse() {
        IResponse response = IResponse.success("ok");
        System.out.println(response);

    }

    @Test
    public void testJasypt() {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("123");
        String password = textEncryptor.encrypt("123");
        System.out.println("password: "+password);
    }

}
