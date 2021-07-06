package bankingservice.service.dao;

import bankingservice.service.entity.AccountEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class AccountDao {
    @PersistenceContext
    private EntityManager entityManager;
    public AccountEntity getAmount(String account) {
        AccountEntity accountEntity =  entityManager.createNamedQuery("getAmount", AccountEntity.class).setParameter("accountNumber", account).getSingleResult();
       return accountEntity;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void creditAmount(AccountEntity entity) {
        entityManager.merge(entity);
    }

    public void createAccount(AccountEntity entity) {
        entityManager.persist(entity);
    }
}
