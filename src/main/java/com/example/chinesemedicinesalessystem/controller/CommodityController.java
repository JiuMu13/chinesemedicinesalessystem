package com.example.chinesemedicinesalessystem.controller;

import com.alibaba.fastjson.JSON;
import com.example.chinesemedicinesalessystem.common.Products;
import com.example.chinesemedicinesalessystem.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    CommodityService commodityService;

    @GetMapping("/list")
    public String getList(){
        List<Products> list = commodityService.getList();
        String r = JSON.toJSONString(list);
        System.out.println(r);
        r="[{\"cateid\":1,\"detail\":\"测试\",\"mainimage\":\"测试\",\"name\":\"药材1\",\"proid\":1,\"shopid\":1,\"specification\":[{\"id\":1,\"mainimage\":\"测试\",\"price\":100.00,\"proid\":1,\"saleprice\":80.00,\"specification\":\"规格1\",\"status\":1,\"stock\":200},{\"id\":2,\"mainimage\":\"测试\",\"price\":160.00,\"proid\":1,\"saleprice\":140.00,\"specification\":\"规格2\",\"status\":1,\"stock\":100}]}]";
        return r;
    }
}
