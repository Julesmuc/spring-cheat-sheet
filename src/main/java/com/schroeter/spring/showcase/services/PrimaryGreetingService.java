package com.schroeter.spring.showcase.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String hello() {
        return "HELLO WORLD --- PRIMARY SERVICE";
    }
}
