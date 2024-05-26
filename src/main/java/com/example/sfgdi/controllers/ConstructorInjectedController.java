package com.example.sfgdi.controllers;

import com.example.sfgdi.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //     Optional = @Autowired
//    public ConstructorInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        System.out.println("Constructor");
        return greetingService.sayGreeting();
    }
}
