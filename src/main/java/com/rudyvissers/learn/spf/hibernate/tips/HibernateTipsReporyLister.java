package com.rudyvissers.learn.spf.hibernate.tips;

import com.rudyvissers.learn.spf.hibernate.tips.model.Author;
import com.rudyvissers.learn.spf.hibernate.tips.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HibernateTipsReporyLister implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final HibernateTipsRepository hibernateTipsRepository;

    public HibernateTipsReporyLister(HibernateTipsRepository hibernateTipsRepository) {
        this.hibernateTipsRepository = hibernateTipsRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        Author author = hibernateTipsRepository.createAuthor();
        logger.info("From HibernateTipsRepository - createAuthor - {}", author);
        Customer customer = hibernateTipsRepository.findCustomer();
        logger.info("From HibernateTipsRepository - findCustomer - {}", customer);
    }
}
