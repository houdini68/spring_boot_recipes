package com.rudyvissers.learn.spf.hellojdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloJdbcApplication {

    private static final Logger logger = LoggerFactory.getLogger(HelloJdbcApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloJdbcApplication.class, args);
    }
}
