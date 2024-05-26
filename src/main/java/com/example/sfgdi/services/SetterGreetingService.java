package com.example.sfgdi.services;

import com.example.sfgdi.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    public SetterGreetingService() {
        System.out.printf("\n%s\n", "Setter Object Created");
    }

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
