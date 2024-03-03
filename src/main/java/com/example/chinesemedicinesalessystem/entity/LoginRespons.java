package com.example.chinesemedicinesalessystem.entity;

public class LoginRespons {
    private String status;
    private String address;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LoginRespons(String status, String address) {
        this.status = status;
        this.address = address;
    }
}
