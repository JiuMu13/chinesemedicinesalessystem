package com.example.chinesemedicinesalessystem.Imapper;

import com.example.chinesemedicinesalessystem.entity.Receive;
import com.example.chinesemedicinesalessystem.entity.ReceiveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReceiveMapper {
    int countByExample(ReceiveExample example);

    int deleteByExample(ReceiveExample example);

    int deleteByPrimaryKey(Long receiveid);

    int insert(Receive record);

    int insertSelective(Receive record);

    List<Receive> selectByExampleWithBLOBs(ReceiveExample example);

    List<Receive> selectByExample(ReceiveExample example);

    Receive selectByPrimaryKey(Long receiveid);

    int updateByExampleSelective(@Param("record") Receive record, @Param("example") ReceiveExample example);

    int updateByExampleWithBLOBs(@Param("record") Receive record, @Param("example") ReceiveExample example);

    int updateByExample(@Param("record") Receive record, @Param("example") ReceiveExample example);

    int updateByPrimaryKeySelective(Receive record);

    int updateByPrimaryKeyWithBLOBs(Receive record);

    int updateByPrimaryKey(Receive record);
}