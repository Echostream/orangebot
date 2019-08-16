package com.echostream.orangebot;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.echostream.orangebot.dao")
@EnableSwagger2
@EnableEncryptableProperties
@EnableTransactionManagement
public class OrangebotApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrangebotApplication.class, args);
    }

}
