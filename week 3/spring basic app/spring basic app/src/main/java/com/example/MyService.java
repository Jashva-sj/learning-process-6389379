package com.example;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public void sayHello() {
        System.out.println("Hello from Spring!");
    }
}
