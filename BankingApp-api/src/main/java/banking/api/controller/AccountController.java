package banking.api.controller;

import banking.api.model.AccountRequest;
import banking.api.model.AccountResponse;
import banking.api.model.AmountRequest;
import banking.api.model.AmountResponse;
import bankingservice.service.business.AccountService;
import bankingservice.service.entity.AccountsEntity;
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
    public ResponseEntity<AccountResponse> deposit(@RequestBody(required = true) AccountRequest accountRequest) throws Exception{

        String accountNumber = accountRequest.getAccountNumber();
        AccountsEntity entity = accountService.getAmount(accountNumber);
        if(accountRequest.getAmount() <= 0 ) {
            throw new Exception();
        }
        int totalAmount = accountRequest.getAmount() + entity.getBalance();
        entity.setBalance(totalAmount);
        accountService.creditAmount(entity);
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setId(entity.getId().toString());
        accountResponse.setStatus("Amount credited");
       return new ResponseEntity<>(accountResponse, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.POST, path = "/debit", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AccountResponse> withdraw(@RequestBody(required = true) AccountRequest accountRequest) throws Exception{

        String accountNumber = accountRequest.getAccountNumber();
        AccountsEntity entity = accountService.getAmount(accountNumber);
        if(accountRequest.getAmount() <= 0 ) {
            throw new Exception();
        }
        int totalAmount = entity.getBalance() - accountRequest.getAmount();
        if(totalAmount < 0) {
            throw new Exception();
        }
        entity.setBalance(totalAmount);
        accountService.creditAmount(entity);
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setId(entity.getId().toString());
        accountResponse.setStatus("Amount debited");
        return new ResponseEntity<>(accountResponse, HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.POST, path = "/transfer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AmountResponse> transfer(@RequestBody(required = true) AmountRequest amountRequest) throws Exception{

        AccountRequest accountRequest = new AccountRequest();
        accountRequest.setAccountNumber(amountRequest.getFromAccountNumber());
        accountRequest.setAmount(amountRequest.getAmount());
        withdraw(accountRequest);

        String accountNumber = amountRequest.getToAccountNumber();
        accountRequest.setAccountNumber(accountNumber);
        accountRequest.setAmount(amountRequest.getAmount());
        deposit(accountRequest);
        AmountResponse amountResponse = new AmountResponse();
        amountResponse.setId(amountRequest.getFromAccountNumber());
        amountResponse.setStatus("Amount Successfully transferred");
        return new ResponseEntity<>(amountResponse, HttpStatus.OK);
    }


}
