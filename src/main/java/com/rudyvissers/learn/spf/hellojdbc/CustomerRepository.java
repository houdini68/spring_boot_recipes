package com.rudyvissers.learn.spf.hellojdbc;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
    Customer findById(long id);
    Customer save(Customer customer);
}
