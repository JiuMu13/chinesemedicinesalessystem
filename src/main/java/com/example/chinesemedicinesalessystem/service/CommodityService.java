package com.example.chinesemedicinesalessystem.service;

import com.example.chinesemedicinesalessystem.Imapper.ProductMapper;
import com.example.chinesemedicinesalessystem.Imapper.ProductSpecificationMapper;
import com.example.chinesemedicinesalessystem.common.Products;
import com.example.chinesemedicinesalessystem.entity.Product;
import com.example.chinesemedicinesalessystem.entity.ProductExample;
import com.example.chinesemedicinesalessystem.entity.ProductSpecification;
import com.example.chinesemedicinesalessystem.entity.ProductSpecificationExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommodityService {

    @Autowired
    ProductMapper productMapper;
    @Autowired
    ProductSpecificationMapper productSpecificationMapper;

    public List<Products> getList(){
        ProductExample example=new ProductExample();
        ProductExample.Criteria criteria=example.createCriteria();
        //todo 根据页码修改

        List<Products> result = new ArrayList<>();
        List<Product> productList = productMapper.selectByExample(example);

        return result;
    }
}
