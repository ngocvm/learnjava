package com.ngocvm.example.spring.ch4.diannotations.service;

import org.springframework.stereotype.Component;

@Component("service2")
public class MyServiceImpl2 implements MyService {

    @Override
    public String getInfo() {
        return "service 2's info";
    }

}
