package bankingservice.service.dao;

import bankingservice.service.entity.AccountsEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class AccountDao {
    @PersistenceContext
    private EntityManager entityManager;
    public AccountsEntity getAmount(String account) {
        AccountsEntity accountEntity =  entityManager.createNamedQuery("getAmount", AccountsEntity.class).setParameter("accountNumber", account).getSingleResult();
       return accountEntity;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void creditAmount(AccountsEntity entity) {
        entityManager.merge(entity);
    }

    public void createAccount(AccountsEntity entity) {
        entityManager.persist(entity);
    }
}
