package com.example.chinesemedicinesalessystem.Imapper;

import com.example.chinesemedicinesalessystem.entity.Shop;
import com.example.chinesemedicinesalessystem.entity.ShopExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    int countByExample(ShopExample example);

    int deleteByExample(ShopExample example);

    int deleteByPrimaryKey(Long shopid);

    int insert(Shop record);

    int insertSelective(Shop record);

    List<Shop> selectByExample(ShopExample example);

    Shop selectByPrimaryKey(Long shopid);

    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}