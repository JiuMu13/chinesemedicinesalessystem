package com.example.chinesemedicinesalessystem.common;

public class Result {
    private boolean yes;
    private String message;

    public boolean isYes() {
        return yes;
    }
    public void setYes(boolean yes) {
        this.yes = yes;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Result(boolean yes) {
        this.yes = yes;
    }
    public Result(boolean yes, String message) {
        this.yes = yes;
        this.message = message;
    }
}
