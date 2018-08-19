package com.playground.components;

import org.springframework.stereotype.Component;

@Component
public class ServiceDispatcher {

    public ServiceDispatcher() {
        System.out.println("=====Inside constructor 2");
    }

    public void doSomething() {
        System.out.println("=====Doing something...");
    }
}
