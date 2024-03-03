package com.example.chinesemedicinesalessystem.Imapper;

import com.example.chinesemedicinesalessystem.entity.ProductImages;
import com.example.chinesemedicinesalessystem.entity.ProductImagesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductImagesMapper {
    int countByExample(ProductImagesExample example);

    int deleteByExample(ProductImagesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductImages record);

    int insertSelective(ProductImages record);

    List<ProductImages> selectByExample(ProductImagesExample example);

    ProductImages selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductImages record, @Param("example") ProductImagesExample example);

    int updateByExample(@Param("record") ProductImages record, @Param("example") ProductImagesExample example);

    int updateByPrimaryKeySelective(ProductImages record);

    int updateByPrimaryKey(ProductImages record);
}