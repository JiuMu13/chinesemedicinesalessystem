package com.example.chinesemedicinesalessystem.controller;

import com.alibaba.fastjson.JSON;
import com.example.chinesemedicinesalessystem.common.Result;
import com.example.chinesemedicinesalessystem.entity.LoginForm;
import com.example.chinesemedicinesalessystem.entity.LoginRespons;
import com.example.chinesemedicinesalessystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/loginpart")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/main")
    public String loginAndRegister(){
        return "/LoginAndRegister";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody String datas, HttpServletRequest request) throws IOException {
        LoginForm form =JSON.parseObject(datas,LoginForm.class);
        Result result = loginService.login(form.getPhone(), form.getPassword());
        String r=null;
        if (result.isYes()){
            r=JSON.toJSONString(new LoginRespons("success","/home/main"));
            HttpSession session = request.getSession(true);
            session.setAttribute("sessionId",form.getPhone());
        }else {
            r="{'status':'fail'}";
        }
        return r;
    }

}
