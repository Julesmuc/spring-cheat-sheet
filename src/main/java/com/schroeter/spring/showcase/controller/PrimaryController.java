package com.schroeter.spring.showcase.controller;

import com.schroeter.spring.showcase.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryController {
    private final GreetingService greetingService;

    public PrimaryController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.hello();
    }
}
