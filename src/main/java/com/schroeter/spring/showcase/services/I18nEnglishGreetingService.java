package com.schroeter.spring.showcase.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("en")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String hello() {
        return "Hello World";
    }
}
