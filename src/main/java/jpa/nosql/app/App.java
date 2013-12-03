package jpa.nosql.app;

import jpa.nosql.app.config.Config;
import jpa.nosql.app.service.CustomerService;
import jpa.nosql.entity.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new  AnnotationConfigApplicationContext(Config.class);
        CustomerService service = ctx.getBean(CustomerService.class);
        
        Customer customer = new Customer();
        customer.setFirstName("Jozef");
        customer.setLastName("Kowalski");
        customer.setEmail("jozef.kowalski@gmail.com");
        
        service.save(customer);
        
        Customer customer2 = service.getCustomer("325c5190-f3a4-4d73-8667-02b8deaa5648");
        service.remove(customer2);
        
        Customer customer3 = service.getCustomer("45d39179-5dfb-457b-8192-a4f4b9c81e4c");
        customer3.setFirstName("Marian");
        service.update(customer);
        
    }
}
