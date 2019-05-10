package com.example.demo;


import org.springframework.beans.factory.annotation.Value;

public class HelloModel {

    private String message;


    private String parameter;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public HelloModel(String message, String parameter) {
        this.message = message;
        this.parameter = parameter;
    }

    public HelloModel() {
    }
}
