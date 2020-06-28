package com.schroeter.spring.showcase;

import com.schroeter.spring.showcase.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Application.class, args);
        var controller = (PrimaryController) ctx.getBean("primaryController");
        System.out.println(controller.getGreeting());

        System.out.println("---Property injection---");
        var propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("---Setter injection---");
        var setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
        System.out.println("---Constructor injection---");
        var constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        var i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.greeting());
    }

}
