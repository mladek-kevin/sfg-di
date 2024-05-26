package com.example.sfgdi.services;

import com.example.sfgdi.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    public PropertyGreetingService() {
        System.out.printf("\n%s\n", "Property Object Created");
    }

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
