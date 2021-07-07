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
 * StatementList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-07T14:19:20.800+05:30")

public class StatementList   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("reference_number")
  private String referenceNumber = null;

  @JsonProperty("debit")
  private Integer debit = null;

  @JsonProperty("credit")
  private Integer credit = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("balance")
  private Integer balance = null;

  @JsonProperty("status")
  private String status = null;

  public StatementList id(String id) {
    this.id = id;
    return this;
  }

  /**
   * uuid of the signed up customer
   * @return id
  **/
  @ApiModelProperty(required = true, value = "uuid of the signed up customer")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StatementList referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * message showing the status of the signed up customer
   * @return referenceNumber
  **/
  @ApiModelProperty(value = "message showing the status of the signed up customer")


  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public StatementList debit(Integer debit) {
    this.debit = debit;
    return this;
  }

  /**
   * message showing the status of the signed up customer
   * @return debit
  **/
  @ApiModelProperty(value = "message showing the status of the signed up customer")


  public Integer getDebit() {
    return debit;
  }

  public void setDebit(Integer debit) {
    this.debit = debit;
  }

  public StatementList credit(Integer credit) {
    this.credit = credit;
    return this;
  }

  /**
   * message showing the status of the signed up customer
   * @return credit
  **/
  @ApiModelProperty(value = "message showing the status of the signed up customer")


  public Integer getCredit() {
    return credit;
  }

  public void setCredit(Integer credit) {
    this.credit = credit;
  }

  public StatementList date(String date) {
    this.date = date;
    return this;
  }

  /**
   * message showing the status of the signed up customer
   * @return date
  **/
  @ApiModelProperty(value = "message showing the status of the signed up customer")


  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public StatementList balance(Integer balance) {
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

  public StatementList status(String status) {
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
    StatementList statementList = (StatementList) o;
    return Objects.equals(this.id, statementList.id) &&
        Objects.equals(this.referenceNumber, statementList.referenceNumber) &&
        Objects.equals(this.debit, statementList.debit) &&
        Objects.equals(this.credit, statementList.credit) &&
        Objects.equals(this.date, statementList.date) &&
        Objects.equals(this.balance, statementList.balance) &&
        Objects.equals(this.status, statementList.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, referenceNumber, debit, credit, date, balance, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatementList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

