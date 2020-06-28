package com.schroeter.spring.showcase.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"de","default"})
public class I18nGermanGreetingService implements GreetingService {
    @Override
    public String hello() {
        return "Hallo Welt";
    }
}
