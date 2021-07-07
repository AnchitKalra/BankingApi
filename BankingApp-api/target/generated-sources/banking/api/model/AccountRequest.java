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
 * AccountRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-07T23:18:28.448+05:30")

public class AccountRequest   {
  @JsonProperty("account_number")
  private String accountNumber = null;

  @JsonProperty("amount")
  private Integer amount = null;

  public AccountRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * First name of the new customer
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "First name of the new customer")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountRequest amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Last name of the new customer
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Last name of the new customer")
  @NotNull


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRequest accountRequest = (AccountRequest) o;
    return Objects.equals(this.accountNumber, accountRequest.accountNumber) &&
        Objects.equals(this.amount, accountRequest.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequest {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

