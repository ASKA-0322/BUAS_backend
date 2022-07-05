package com.buas_team.buas_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.buas_team.buas_backend.mapper")
public class BuasBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuasBackendApplication.class, args);
    }

}
