package com.rudyvissers.learn.spf.hellojdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

//@Component
class CustomerListerPlainJdbc implements ApplicationRunner {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final DataSource dataSource;

    CustomerListerPlainJdbc(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var query = "SELECT id, name, email FROM customer";
        try (var con = dataSource.getConnection();
             var stmt = con.createStatement();
             var rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                logger.info("Customer [id={}, name={}, email={}]",
                        rs.getLong(1), rs.getString(2), rs.getString(3));
            }
        }
    }
}
