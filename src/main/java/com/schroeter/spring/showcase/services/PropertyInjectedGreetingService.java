package com.schroeter.spring.showcase.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String hello() {
        return "HELLO WORLD ---- PROPERTY INJECTION";
    }
}
