package bankingservice.service.business;

import bankingservice.service.dao.CustomerDao;
import bankingservice.service.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;
    @Transactional(propagation = Propagation.REQUIRED)
    public PersonEntity saveCustomer(PersonEntity customerEntity) {
        return customerDao.saveCustomer(customerEntity);
    }
}
