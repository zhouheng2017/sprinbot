package com.mytest.sprinbot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.mytest.sprinbot.mapper")
public class SprinbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinbotApplication.class, args);
    }

}
