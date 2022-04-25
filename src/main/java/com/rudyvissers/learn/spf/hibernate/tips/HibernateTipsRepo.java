package com.rudyvissers.learn.spf.hibernate.tips;

import com.rudyvissers.learn.spf.hibernate.tips.model.Author;
import com.rudyvissers.learn.spf.hibernate.tips.model.AuthorStatus;
import com.rudyvissers.learn.spf.hibernate.tips.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
class HibernateTipsRepo {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Author createAuthor() {
        Author a = new Author();
        a.setFirstName("firstName");
        a.setLastName("lastName");
        a.setStatus(AuthorStatus.PUBLISHED); // how is enum Status persisted?
        em.persist(a);
        return em.createQuery("SELECT a FROM Author a WHERE a.firstName = 'firstName'", Author.class).getSingleResult();
    }

    public Customer findCustomer() {
        return em.createQuery("SELECT c FROM Customer c WHERE c.name = 'RV'", Customer.class)
                .getSingleResult();
    }
}
