package bankingservice.service.business;

import bankingservice.service.dao.AccountDao;
import bankingservice.service.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    @Autowired
    AccountDao accountDao;
    @Transactional(propagation = Propagation.REQUIRED)
    public AccountEntity getAmount(Integer account) {
        return accountDao.getAmount(account);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void creditAmount(AccountEntity entity) {
        accountDao.creditAmount(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void createAccount(AccountEntity entity) {
        accountDao.createAccount(entity);
    }
}
