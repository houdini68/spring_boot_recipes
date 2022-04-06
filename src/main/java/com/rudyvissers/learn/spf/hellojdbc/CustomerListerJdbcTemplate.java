package com.rudyvissers.learn.spf.hellojdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

//@Component
public class CustomerListerJdbcTemplate implements ApplicationRunner {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final JdbcTemplate jdbc;

    CustomerListerJdbcTemplate(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public void run(ApplicationArguments args) {
        var query = "SELECT id, name, email FROM customer";
        jdbc.query(query, rs -> {
            logger.info("Customer [id={}, name={}, email={}]",
                    rs.getLong(1), rs.getString(2), rs.getString(3));
        });
    }
}
