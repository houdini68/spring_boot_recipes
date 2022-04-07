package com.rudyvissers.learn.spf.hellojpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringDataRepoLister implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final SpringDataCustomerRepository customers;
    private final SpringDataOrderRepository orders;

    SpringDataRepoLister(SpringDataCustomerRepository customers, SpringDataOrderRepository orders) {
        this.customers = customers;
        this.orders = orders;
    }

    @Override
    public void run(ApplicationArguments args) {
        logger.info("all customers:");
        customers.findAll()
                .forEach(customer -> logger.info("Customer from Spring Data Repo - {}", customer));
        logger.info("all orders:");
        orders.findAll()
                .forEach(order -> logger.info("Order from Spring Data Repo - {}", order));
    }
}
