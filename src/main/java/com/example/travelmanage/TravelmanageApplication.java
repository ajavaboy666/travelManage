package com.example.travelmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.travelmanage.dao")
public class TravelmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelmanageApplication.class, args);
    }

}
