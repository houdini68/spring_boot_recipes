package com.rudyvissers.learn.spf.hellojpa;

import org.springframework.data.repository.CrudRepository;

public interface SpringDataCustomerRepository extends CrudRepository<Customer, Long> { }
