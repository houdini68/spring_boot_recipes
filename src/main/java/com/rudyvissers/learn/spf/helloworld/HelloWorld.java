package com.rudyvissers.learn.spf.helloworld;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloWorld {
    public String sayHello() {
        return "Hello World!";
    }
}
