package com.ngocvm.example.spring.ch4.dependencyinjection.service;

public class ServiceB implements Service {

    @Override
    public String getInfo() {
        return "serviceB's info";
    }

}
