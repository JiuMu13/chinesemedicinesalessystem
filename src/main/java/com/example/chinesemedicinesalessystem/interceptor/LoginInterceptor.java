package com.example.chinesemedicinesalessystem.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String sessionId = (String)session.getAttribute("sessionId");
        if (sessionId!=null){
            session.setAttribute("sessionId",sessionId);
            return true;
        }else {
            response.sendRedirect("/loginpart/main");
            return false;
        }
    }
}
