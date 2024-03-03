package com.example.chinesemedicinesalessystem.entity;

import java.math.BigDecimal;

public class Product {
    private Long proid;

    private Integer cateid;

    private Long shopid;

    private String name;

    private String detail;

    private Integer sales;

    private Integer monthsales;

    private BigDecimal commentgrade;

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public Integer getCateid() {
        return cateid;
    }

    public void setCateid(Integer cateid) {
        this.cateid = cateid;
    }

    public Long getShopid() {
        return shopid;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getMonthsales() {
        return monthsales;
    }

    public void setMonthsales(Integer monthsales) {
        this.monthsales = monthsales;
    }

    public BigDecimal getCommentgrade() {
        return commentgrade;
    }

    public void setCommentgrade(BigDecimal commentgrade) {
        this.commentgrade = commentgrade;
    }
}