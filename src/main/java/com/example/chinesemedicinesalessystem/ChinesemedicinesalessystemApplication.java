package com.example.chinesemedicinesalessystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.chinesemedicinesalessystem.Imapper")
public class ChinesemedicinesalessystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChinesemedicinesalessystemApplication.class, args);
    }

}
