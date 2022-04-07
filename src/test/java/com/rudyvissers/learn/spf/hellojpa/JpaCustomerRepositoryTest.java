package com.rudyvissers.learn.spf.hellojpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class JpaCustomerRepositoryTest {
    @Autowired
    private SpringDataCustomerRepository repository;

    @Test
    public void insertNewCustomer() {
        assertThat(repository.findAll()).isEmpty();
        Customer customer = repository.save(new Customer("T. Testing", "t.testing@test123.tst"));
        assertThat(customer.getId()).isGreaterThan(-1L);
        assertThat(customer.getName()).isEqualTo("T. Testing");
        assertThat(customer.getEmail()).isEqualTo("t.testing@test123.tst");
        assertThat(repository.findById(customer.getId()).get()).isEqualTo(customer);
    }

    @Test
    public void findAllCustomers() {
        assertThat(repository.findAll()).isEmpty();
        repository.save(new Customer("T. Testing1", "t.testing@test123.tst"));
        repository.save(new Customer("T. Testing2", "t.testing@test123.tst"));
        assertThat(repository.findAll()).hasSize(2);
    }
}
