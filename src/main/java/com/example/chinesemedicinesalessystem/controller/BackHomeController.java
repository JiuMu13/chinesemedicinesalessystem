package com.example.chinesemedicinesalessystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/backhome")
public class BackHomeController {

    @RequestMapping
    public String homepage(){
        return "backend/list1";
    }
}
