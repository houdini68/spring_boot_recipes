package com.rudyvissers.learn.spf.hellojdbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@JdbcTest(includeFilters =
@ComponentScan.Filter(
        type = FilterType.REGEX,
        pattern = "com.rudyvissers.learn.spf.hellojdbc.*Repository"))
@TestPropertySource(properties = "spring.flyway.enabled=false")
public class JdbcCustomerRepositoryTest {
    @Autowired
    private JdbcCustomerRepository repository;

    @Test
    public void insertNewCustomer() {
        assertThat(repository.findAll()).isEmpty();
        Customer customer = repository.save(new Customer(-1, "T. Testing", "t.testing@test123.tst"));
        assertThat(customer.getId()).isGreaterThan(-1L);
        assertThat(customer.getName()).isEqualTo("T. Testing");
        assertThat(customer.getEmail()).isEqualTo("t.testing@test123.tst");
        assertThat(repository.findById(customer.getId())).isEqualTo(customer);
    }
}
