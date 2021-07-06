package bankingservice.service.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "account")
@NamedQueries({
        @NamedQuery(name = "getAmount", query = "select a from AccountEntity a where a.accountNumber = :accountNumber")})

                public class AccountEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

    @Column(name = "account_number", length = 64, nullable = false)
    private String accountNumber;

    @Column(name = "account_type")
    private Type accountType;

    @Column(name = "balance")
    private Integer balance;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pid")
    private PersonEntity personEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Type getAccountType() {
        return accountType;
    }

    public void setAccountType(Type accountType) {
        this.accountType = accountType;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }

    public void setPersonEntity(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }
}
