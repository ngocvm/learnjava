package com.ngocvm.example.spring.ch4.diannotations.service;

import org.springframework.stereotype.Component;

@Component("service")
public class MyServiceImpl1 implements MyService {
    @Override
    public String getInfo() {
        return "Service 1's info";
    }
}
