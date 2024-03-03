package com.example.chinesemedicinesalessystem.service;

import com.example.chinesemedicinesalessystem.Imapper.UserMapper;
import com.example.chinesemedicinesalessystem.common.Result;
import com.example.chinesemedicinesalessystem.entity.User;
import com.example.chinesemedicinesalessystem.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    UserMapper userMapper;

    public Result login(String id,String password){
        UserExample example=new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(id);
        List<User> users = userMapper.selectByExample(example);
        if (users.size()==0){
            return new Result(false,"当前手机号未注册");
        }
        criteria.andPasswordEqualTo(password);
        users=userMapper.selectByExample(example);
        if (users.size()==0){
            return new Result(false,"密码错误");
        }else
            return new Result(true);
    }
}
