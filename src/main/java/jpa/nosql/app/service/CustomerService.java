package jpa.nosql.app.service;

import jpa.nosql.app.repository.CustomerRepository;
import jpa.nosql.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafal
 */

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;
    
    public Customer getCustomer(String id) {
        return repository.getCustomer(id);
    }
    
    public void save(Customer customer) {
        repository.save(customer);
    }
    
    public void remove(Customer customer) {
        repository.remove(customer);
    }
    
    public void update(Customer customer) {
        repository.update(customer);
    }
}
