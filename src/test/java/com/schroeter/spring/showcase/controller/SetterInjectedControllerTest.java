package com.schroeter.spring.showcase.controller;

import com.schroeter.spring.showcase.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }
    @Test
    void getGreeting() {
        assertEquals("HELLO WORLD", controller.getGreeting());
    }

}