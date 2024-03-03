package com.example.chinesemedicinesalessystem.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String orderid;

    private Long userid;

    private Long receiveid;

    private BigDecimal payment;

    private BigDecimal freight;

    private String expressid;

    private Integer status;

    private Date patmenttime;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getReceiveid() {
        return receiveid;
    }

    public void setReceiveid(Long receiveid) {
        this.receiveid = receiveid;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getExpressid() {
        return expressid;
    }

    public void setExpressid(String expressid) {
        this.expressid = expressid == null ? null : expressid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPatmenttime() {
        return patmenttime;
    }

    public void setPatmenttime(Date patmenttime) {
        this.patmenttime = patmenttime;
    }
}