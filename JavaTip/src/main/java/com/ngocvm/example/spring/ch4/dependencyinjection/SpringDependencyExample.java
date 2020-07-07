package com.ngocvm.example.spring.ch4.dependencyinjection;

import com.ngocvm.example.spring.ch4.dependencyinjection.client.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyExample {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:appContext.xml");
        Client client = (Client) context.getBean("client1");
        client.doSomeThing();
    }
}
