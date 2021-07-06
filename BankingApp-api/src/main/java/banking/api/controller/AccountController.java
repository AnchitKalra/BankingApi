package banking.api.controller;

import banking.api.model.AccountRequest;
import banking.api.model.AccountResponse;
import bankingservice.service.business.AccountService;
import bankingservice.service.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping(method = RequestMethod.POST, path = "/credit", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AccountResponse> signup(@RequestBody(required = true) AccountRequest accountRequest) {
        int accountNumber = accountRequest.getAccountNumber();
        AccountEntity entity = accountService.getAmount(accountNumber);
        int totalAmount = accountRequest.getAmount() + entity.getBalance();
        entity.setBalance(totalAmount);
        accountService.creditAmount(entity);
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setId(entity.getUuid());
        accountResponse.setStatus("Amount credited");
       return new ResponseEntity<>(accountResponse, HttpStatus.OK);
    }
}
