package com.jk.background;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.jk.background.mapper")
@SpringBootApplication
@EnableDiscoveryClient
public class BackgroundApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackgroundApplication.class, args);
    }

}
