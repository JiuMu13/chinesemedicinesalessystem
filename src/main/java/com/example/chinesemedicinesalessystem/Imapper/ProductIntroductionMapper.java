package com.example.chinesemedicinesalessystem.Imapper;

import com.example.chinesemedicinesalessystem.entity.ProductIntroduction;
import com.example.chinesemedicinesalessystem.entity.ProductIntroductionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductIntroductionMapper {
    int countByExample(ProductIntroductionExample example);

    int deleteByExample(ProductIntroductionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductIntroduction record);

    int insertSelective(ProductIntroduction record);

    List<ProductIntroduction> selectByExample(ProductIntroductionExample example);

    ProductIntroduction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductIntroduction record, @Param("example") ProductIntroductionExample example);

    int updateByExample(@Param("record") ProductIntroduction record, @Param("example") ProductIntroductionExample example);

    int updateByPrimaryKeySelective(ProductIntroduction record);

    int updateByPrimaryKey(ProductIntroduction record);
}