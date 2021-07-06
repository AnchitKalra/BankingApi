package bankingservice.service.dao;

import bankingservice.service.entity.StatementsEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class StatementDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addStatement(StatementsEntity statementEntity) {
        entityManager.persist(statementEntity);
    }
}
