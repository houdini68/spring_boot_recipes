package com.rudyvissers.learn.spf.helloworld;

import com.rudyvissers.learn.spf.calculator.CalculatorApplication;
import com.rudyvissers.learn.spf.helloworldweb.HelloWorldWebApplication;
import com.rudyvissers.learn.spf.library.Book;
import com.rudyvissers.learn.spf.library.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldApplication {

private static Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

     @Bean
     ApplicationRunner booksInitializer(HelloWorld helloWorld) {
        return args -> {
            logger.info(helloWorld.sayHello());
        };
    }
}
