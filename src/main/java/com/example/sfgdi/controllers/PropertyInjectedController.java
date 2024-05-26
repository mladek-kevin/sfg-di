package com.example.sfgdi.controllers;

import com.example.sfgdi.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        System.out.println("Property");
        return greetingService.sayGreeting();
    }

}
