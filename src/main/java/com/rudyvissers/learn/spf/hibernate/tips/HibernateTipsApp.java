package com.rudyvissers.learn.spf.hibernate.tips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.rudyvissers.learn.spf.hibernate.tips.model"})
public class HibernateTipsApp {
    public static void main(String[] args) {
        SpringApplication.run(HibernateTipsApp.class, args);
    }
}
