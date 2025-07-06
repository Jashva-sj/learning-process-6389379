package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
    private MyService myService;

    @Autowired
    public Client(MyService myService) {
        this.myService = myService;
    }

    public void doWork() {
        System.out.println("Client is working...");
        myService.serve();
    }
}
