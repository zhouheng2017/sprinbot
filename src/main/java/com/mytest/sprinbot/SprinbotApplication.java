package com.mytest.sprinbot;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCreateCacheAnnotation
@EnableMethodCache(basePackages = "com.mytest.sprinbot.service")
@MapperScan("com.mytest.sprinbot.mapper")
public class SprinbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinbotApplication.class, args);
    }

}
