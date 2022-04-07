package com.rudyvissers.learn.spf.hellojpa;

import com.rudyvissers.learn.spf.hellojpa.order.Order;
import org.springframework.data.repository.CrudRepository;

public interface SpringDataOrderRepository extends CrudRepository<Order, Long> { }
