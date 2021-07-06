package bankingservice.service.business;

import bankingservice.service.dao.StatementDao;
import bankingservice.service.entity.StatementsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StatementService {

    @Autowired
    StatementDao statementDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public void addStatement(StatementsEntity entity) {
        statementDao.addStatement(entity);
    }
}
