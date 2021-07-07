package banking.api.model;

import java.util.Objects;
import banking.api.model.AccountList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetAccountResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-07T23:18:28.448+05:30")

public class GetAccountResponse   {
  @JsonProperty("accountList")
  @Valid
  private List<AccountList> accountList = null;

  public GetAccountResponse accountList(List<AccountList> accountList) {
    this.accountList = accountList;
    return this;
  }

  public GetAccountResponse addAccountListItem(AccountList accountListItem) {
    if (this.accountList == null) {
      this.accountList = new ArrayList<>();
    }
    this.accountList.add(accountListItem);
    return this;
  }

  /**
   * Get accountList
   * @return accountList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountList> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<AccountList> accountList) {
    this.accountList = accountList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountResponse getAccountResponse = (GetAccountResponse) o;
    return Objects.equals(this.accountList, getAccountResponse.accountList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountResponse {\n");
    
    sb.append("    accountList: ").append(toIndentedString(accountList)).append("\n");
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

