package banking.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-07T23:18:28.448+05:30")

public class AccountList   {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("balance")
  private Integer balance = null;

  @JsonProperty("status")
  private String status = null;

  public AccountList accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * message showing the status of the signed up customer
   * @return accountNumber
  **/
  @ApiModelProperty(value = "message showing the status of the signed up customer")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountList balance(Integer balance) {
    this.balance = balance;
    return this;
  }

  /**
   * message showing the status of the signed up customer
   * @return balance
  **/
  @ApiModelProperty(value = "message showing the status of the signed up customer")


  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public AccountList status(String status) {
    this.status = status;
    return this;
  }

  /**
   * message showing the status of the signed up customer
   * @return status
  **/
  @ApiModelProperty(required = true, value = "message showing the status of the signed up customer")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountList accountList = (AccountList) o;
    return Objects.equals(this.accountNumber, accountList.accountNumber) &&
        Objects.equals(this.balance, accountList.balance) &&
        Objects.equals(this.status, accountList.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, balance, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountList {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

