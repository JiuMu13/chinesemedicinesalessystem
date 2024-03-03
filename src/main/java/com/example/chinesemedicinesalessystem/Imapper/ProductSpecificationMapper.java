package com.example.chinesemedicinesalessystem.Imapper;

import com.example.chinesemedicinesalessystem.entity.ProductSpecification;
import com.example.chinesemedicinesalessystem.entity.ProductSpecificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductSpecificationMapper {
    int countByExample(ProductSpecificationExample example);

    int deleteByExample(ProductSpecificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProductSpecification record);

    int insertSelective(ProductSpecification record);

    List<ProductSpecification> selectByExample(ProductSpecificationExample example);

    ProductSpecification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProductSpecification record, @Param("example") ProductSpecificationExample example);

    int updateByExample(@Param("record") ProductSpecification record, @Param("example") ProductSpecificationExample example);

    int updateByPrimaryKeySelective(ProductSpecification record);

    int updateByPrimaryKey(ProductSpecification record);
}