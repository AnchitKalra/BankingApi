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

    @Column(name = "UUID", length = 64, nullable = false)
    private String uuid;

    @Column(name = "account_type")
    private Type accountType;

    @Column(name = "balance")
    private Integer balance;

    @Column(name = "account_number")
    private Integer accountNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pid")
    private PersonEntity personEntity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public PersonEntity getPersonEntity() {
        return personEntity;
    }

    public void setPersonEntity(PersonEntity personEntity) {
        this.personEntity = personEntity;
    }
}
