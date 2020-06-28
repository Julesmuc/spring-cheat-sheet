package com.schroeter.spring.showcase.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectionGreetingService implements GreetingService{
    @Override
    public String hello() {
        return "HELLO WORLD ---- SETTER INJECTION";
    }
}
