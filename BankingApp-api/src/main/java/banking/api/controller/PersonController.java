package banking.api.controller;

import banking.api.model.SignupCustomerRequest;
import banking.api.model.SignupCustomerResponse;
import bankingservice.service.business.AccountService;
import bankingservice.service.business.CustomerService;
import bankingservice.service.entity.AccountEntity;
import bankingservice.service.entity.PersonEntity;
import bankingservice.service.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.UUID;

@Controller
public class PersonController {
static int accountNumber = 200;
    @Autowired
    CustomerService customerService;

    @Autowired
    AccountService accountService;

    @RequestMapping(method = RequestMethod.POST, path = "/signup", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SignupCustomerResponse> signup(@RequestBody(required = false) final SignupCustomerRequest signupCustomerRequest) {
        final PersonEntity customerEntity = new PersonEntity();

        customerEntity.setUuid(UUID.randomUUID().toString());
        customerEntity.setFirstName(signupCustomerRequest.getFirstName());
        customerEntity.setLastName(signupCustomerRequest.getLastName());
        customerEntity.setContactNumber(signupCustomerRequest.getContactNumber());
        customerEntity.setEmail(signupCustomerRequest.getEmailAddress());
        customerEntity.setPassword(signupCustomerRequest.getPassword());

        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setBalance(0);
        accountEntity.setAccountType(Type.SAVING);
        accountEntity.setUuid(UUID.randomUUID().toString());
        accountEntity.setAccountNumber(accountNumber++);

        final PersonEntity createdCustomerEntity = customerService.saveCustomer(customerEntity);
        accountEntity.setPersonEntity(createdCustomerEntity);
        accountService.createAccount(accountEntity);
        SignupCustomerResponse customerResponse = new SignupCustomerResponse().id(createdCustomerEntity.getUuid()).status("CUSTOMER SUCCESSFULLY REGISTERED");
        return new ResponseEntity(customerResponse, HttpStatus.CREATED);
    }
}
