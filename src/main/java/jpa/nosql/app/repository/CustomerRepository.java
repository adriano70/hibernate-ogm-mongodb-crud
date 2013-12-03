package jpa.nosql.app.repository;

import jpa.nosql.entity.Customer;

/**
 *
 * @author rafal
 */

public interface CustomerRepository {
    
    public Customer getCustomer(String id);
    
    public void save(Customer customer);
    
    public void remove(Customer customer);
    
    public void update(Customer customer);
    
}
