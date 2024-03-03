package com.example.chinesemedicinesalessystem.entity;

public class ProductImages {
    private Long id;

    private Long proid;

    private String normal;

    private String bigger;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProid() {
        return proid;
    }

    public void setProid(Long proid) {
        this.proid = proid;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal == null ? null : normal.trim();
    }

    public String getBigger() {
        return bigger;
    }

    public void setBigger(String bigger) {
        this.bigger = bigger == null ? null : bigger.trim();
    }
}