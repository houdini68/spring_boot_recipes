package com.rudyvissers.learn.spf.hibernate.tips;

import com.rudyvissers.learn.spf.hibernate.tips.model.Author;
import com.rudyvissers.learn.spf.hibernate.tips.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HibernateTipsRepoLister implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final HibernateTipsRepo hibernateTipsRepo;

    public HibernateTipsRepoLister(HibernateTipsRepo hibernateTipsRepo) {
        this.hibernateTipsRepo = hibernateTipsRepo;
    }

    @Override
    public void run(ApplicationArguments args) {

        Author author = hibernateTipsRepo.createAuthor();
        logger.info("From HibernateTipsRepository - createAuthor - {}", author);

        Customer customer = hibernateTipsRepo.findCustomer();
        logger.info("From HibernateTipsRepository - findCustomer - {}", customer);
    }
}
