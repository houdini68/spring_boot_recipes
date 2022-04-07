package com.rudyvissers.learn.spf.hellojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.rudyvissers.learn.spf.hellojpa", "com.rudyvissers.learn.spf.hellojpa.order"})
public class HelloJpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloJpaApplication.class, args);
    }
}

