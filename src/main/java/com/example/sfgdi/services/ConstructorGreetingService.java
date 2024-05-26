package com.example.sfgdi.services;

import com.example.sfgdi.services.interfaces.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class ConstructorGreetingService implements GreetingService {

    public ConstructorGreetingService() {
        System.out.printf("\n%s\n", "Constructor Object Created");
    }

    @Override
    public String sayGreeting() {
        return "It is I, Hello World";
    }
}
