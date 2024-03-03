package com.example.chinesemedicinesalessystem.entity;

import java.math.BigDecimal;

public class OrderDetail {
    private String id;

    private String orderid;

    private Long proid;

    private Long prodetailid;

    private BigDecimal currprice;

    private Integer quantity;

    private BigDecimal totalprice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public Long getProdetailid() {
        return prodetailid;
    }

    public void setProdetailid(Long prodetailid) {
        this.prodetailid = prodetailid;
    }

    public BigDecimal getCurrprice() {
        return currprice;
    }

    public void setCurrprice(BigDecimal currprice) {
        this.currprice = currprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }
}