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
 * AmountRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-07T23:18:28.448+05:30")

public class AmountRequest   {
  @JsonProperty("from_account_number")
  private String fromAccountNumber = null;

  @JsonProperty("to_account_number")
  private String toAccountNumber = null;

  @JsonProperty("amount")
  private Integer amount = null;

  public AmountRequest fromAccountNumber(String fromAccountNumber) {
    this.fromAccountNumber = fromAccountNumber;
    return this;
  }

  /**
   * First name of the new customer
   * @return fromAccountNumber
  **/
  @ApiModelProperty(required = true, value = "First name of the new customer")
  @NotNull


  public String getFromAccountNumber() {
    return fromAccountNumber;
  }

  public void setFromAccountNumber(String fromAccountNumber) {
    this.fromAccountNumber = fromAccountNumber;
  }

  public AmountRequest toAccountNumber(String toAccountNumber) {
    this.toAccountNumber = toAccountNumber;
    return this;
  }

  /**
   * First name of the new customer
   * @return toAccountNumber
  **/
  @ApiModelProperty(required = true, value = "First name of the new customer")
  @NotNull


  public String getToAccountNumber() {
    return toAccountNumber;
  }

  public void setToAccountNumber(String toAccountNumber) {
    this.toAccountNumber = toAccountNumber;
  }

  public AmountRequest amount(Integer amount) {
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
    AmountRequest amountRequest = (AmountRequest) o;
    return Objects.equals(this.fromAccountNumber, amountRequest.fromAccountNumber) &&
        Objects.equals(this.toAccountNumber, amountRequest.toAccountNumber) &&
        Objects.equals(this.amount, amountRequest.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccountNumber, toAccountNumber, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmountRequest {\n");
    
    sb.append("    fromAccountNumber: ").append(toIndentedString(fromAccountNumber)).append("\n");
    sb.append("    toAccountNumber: ").append(toIndentedString(toAccountNumber)).append("\n");
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

