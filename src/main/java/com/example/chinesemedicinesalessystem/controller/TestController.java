package com.example.chinesemedicinesalessystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/main")
    public String page(){
        return "/test";
    }

    @RequestMapping("/t1")
    @ResponseBody
    public String login() throws IOException {
        return "测试";
    }
}
