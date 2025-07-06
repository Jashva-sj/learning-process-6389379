package com.example;

import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl implements MyService {
    @Override
    public void serve() {
        System.out.println("Service is serving...");
    }
}
