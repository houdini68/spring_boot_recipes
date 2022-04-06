package com.rudyvissers.learn.spf.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import java.util.Collection;

@PropertySource("classpath:your-external-but-inside-the-jar.properties")
@SpringBootApplication
public class CalculatorApplication {
    private static Logger logger = getLogger();

    private static Logger getLogger() {
        return LoggerFactory.getLogger(CalculatorApplication.class);
    }

    public static void main(String[] args) {
        var ctx = SpringApplication.run(CalculatorApplication.class, args);
        var calculator = ctx.getBean(Calculator.class);
        calculator.calculate(137, 21, '+');
        calculator.calculate(137, 21, '*');
        calculator.calculate(137, 21, '-');
    }

    @Bean
    Calculator calculator(Collection<Operation> operations) {
        return new Calculator(operations);
    }

//    @Bean
//    public ApplicationRunner calculationRunner(Calculator calculator) {
//        return args -> {
//            calculator.calculate(137, 21, '+');
//            calculator.calculate(137, 21, '*');
//            calculator.calculate(137, 21, '-');
//        };
//    }

    @Bean
    public ApplicationRunner calculationRunner(Calculator calculator,
                                               @Value("${lhs}") int lhs,
                                               @Value("${rhs}") int rhs,
                                               @Value("${op}") char op) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
        return args -> calculator.calculate(lhs, rhs, op);
    }
}
