package jpa.nosql.app.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author rafal
 */
@Configuration
@ComponentScan("jpa.nosql.app")
public class Config {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("NOSQLPU");
    
    @Bean
    public EntityManager entityManager() {
        return emf.createEntityManager();
    }
}
