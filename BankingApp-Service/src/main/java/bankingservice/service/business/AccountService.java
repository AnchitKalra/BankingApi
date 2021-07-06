package bankingservice.service.business;

import bankingservice.service.dao.AccountDao;
import bankingservice.service.entity.AccountsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    @Autowired
    AccountDao accountDao;
    @Transactional(propagation = Propagation.REQUIRED)
    public AccountsEntity getAmount(String account) {
        return accountDao.getAmount(account);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void creditAmount(AccountsEntity entity) {
        accountDao.creditAmount(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void createAccount(AccountsEntity entity) {
        accountDao.createAccount(entity);
    }
}
