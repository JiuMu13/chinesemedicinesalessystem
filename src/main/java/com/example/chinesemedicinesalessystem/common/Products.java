package com.example.chinesemedicinesalessystem.common;

import com.example.chinesemedicinesalessystem.entity.Product;
import com.example.chinesemedicinesalessystem.entity.ProductSpecification;

import java.math.BigDecimal;
import java.util.List;

public class Products {
    private Long proid;

    private Integer cateid;

    private Long shopid;

    private String name;

    private String detail;

    private Integer sales;

    private Integer monthsales;

    private BigDecimal commentgrade;
    private List<ProductSpecification> specification;

    public void setProduct(Product product) {
        this.proid=product.getProid();
        this.cateid= product.getCateid();
        this.shopid=product.getShopid();
        this.name= product.getName();
        this.detail= product.getDetail();
        sales= product.getSales();
        monthsales= product.getMonthsales();
        commentgrade=product.getCommentgrade();
    }

    public Long getProid() {
        return proid;
    }

    public Integer getCateid() {
        return cateid;
    }

    public Long getShopid() {
        return shopid;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public Integer getSales() {
        return sales;
    }

    public Integer getMonthsales() {
        return monthsales;
    }

    public BigDecimal getCommentgrade() {
        return commentgrade;
    }

    public List<ProductSpecification> getSpecification() {
        return specification;
    }

    public void setSpecification(List<ProductSpecification> specification) {
        this.specification = specification;
    }
}
