package jpa.nosql.app.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import jpa.nosql.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rafal
 */

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @Autowired
    private EntityManager em;
    
    public Customer getCustomer(String id) {
        return em.find(Customer.class, id);
    }

    public void save(Customer customer) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(customer);
        tx.commit();
    }
    
    public void remove(Customer customer) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.remove(customer);
        tx.commit();
    }

    public void update(Customer customer) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.merge(customer);
        tx.commit();
    }
    
}
