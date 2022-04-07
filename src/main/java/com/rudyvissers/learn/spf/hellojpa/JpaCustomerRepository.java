package com.rudyvissers.learn.spf.hellojpa;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
class JpaCustomerRepository implements CustomerRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        var query = em.createQuery("SELECT c FROM Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(long id) {
        return em.find(Customer.class, id);
    }

    @Override
    public Customer save(Customer customer) {
        em.persist(customer);
        return customer;
    }
}
