package banking.api.controller;

import banking.api.model.StatementList;
import banking.api.model.StatementResponse;
import bankingservice.service.business.CustomerService;
import bankingservice.service.business.StatementService;
import bankingservice.service.entity.PersonEntity;
import bankingservice.service.entity.StatementsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StatementController {

    @Autowired
    StatementService statementService;
    @Autowired
    CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET, path = "/statement", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<StatementResponse> getStatement(@RequestParam(required = true) String accountNumber, @RequestHeader("authorization") final String authorization) throws Exception{
        String access_token = authorization.split("Bearer ")[1];
        PersonEntity customerEntity = customerService.getCustomer(access_token);

        List<StatementsEntity> list = new ArrayList<>();
        list = statementService.getStatement(accountNumber);
        StatementResponse statementResponse= new StatementResponse();
        ArrayList<StatementList> list1 = new ArrayList<>();
       for(StatementsEntity s : list) {
           StatementList statementList = new StatementList();
           statementList.setBalance(s.getBalance());
           statementList.setStatus("Success");
           statementList.setCredit(s.getCredit());
           statementList.setDate(s.getDate().toString());
           statementList.setDebit(s.getDebit());
           statementList.setReferenceNumber(s.getReferenceNumber());
           list1.add(statementList);
       }
       statementResponse.setStatement(list1);
       return new ResponseEntity<>(statementResponse, HttpStatus.OK);

    }
}
