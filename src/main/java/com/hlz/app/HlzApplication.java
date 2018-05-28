package com.hlz.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hlz.app.demo.dao")
public class HlzApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlzApplication.class, args);
    }
}
