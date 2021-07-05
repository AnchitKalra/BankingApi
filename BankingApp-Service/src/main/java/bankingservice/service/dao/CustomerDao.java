package bankingservice.service.dao;

import bankingservice.service.entity.PersonEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerDao {
    @PersistenceContext
    private EntityManager entityManager;
    public PersonEntity saveCustomer(PersonEntity customer) {
        entityManager.persist(customer);
        return customer;
    }
}
