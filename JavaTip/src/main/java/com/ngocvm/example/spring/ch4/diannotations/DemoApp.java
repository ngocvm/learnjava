package com.ngocvm.example.spring.ch4.diannotations;

import com.ngocvm.example.spring.ch4.diannotations.client.MyClient;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.ngocvm.example.spring.ch4.diannotations");
        context.refresh();

        MyClient client = (MyClient) context.getBean("client1");
        client.doSomething();
    }
}
