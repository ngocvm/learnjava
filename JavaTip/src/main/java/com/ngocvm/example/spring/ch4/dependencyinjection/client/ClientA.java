package com.ngocvm.example.spring.ch4.dependencyinjection.client;

import com.ngocvm.example.spring.ch4.dependencyinjection.service.Service;

public class ClientA implements Client {

    Service service;

    public ClientA(Service service) {
        this.service = service;
    }

    @Override
    public void doSomeThing() {
        String info = service.getInfo();
        System.out.println("Info: " + info);
    }

    public void setService(Service service) {
        this.service = service;
    }

}
