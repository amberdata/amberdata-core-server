package io.amberdata.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Example data object contains sample asset data. Actual asset data may include more fields than example data below.
 */
@ApiModel(description = "Example data object contains sample asset data. Actual asset data may include more fields than example data below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class Asset1   {
  @JsonProperty("issuerAccount")
  private String issuerAccount = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("transactionHash")
  private String transactionHash = null;

  @JsonProperty("functionCallHash")
  private String functionCallHash = null;

  @JsonProperty("meta")
  private String meta = null;

  public Asset1 issuerAccount(String issuerAccount) {
    this.issuerAccount = issuerAccount;
    return this;
  }

  /**
   * Get issuerAccount
   * @return issuerAccount
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", required = true, value = "")
  @NotNull


  public String getIssuerAccount() {
    return issuerAccount;
  }

  public void setIssuerAccount(String issuerAccount) {
    this.issuerAccount = issuerAccount;
  }

  public Asset1 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "SYM", required = true, value = "")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Asset1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "native", required = true, value = "")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Asset1 amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "42.0", value = "")

  @Valid

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Asset1 timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "2018-01-05T05:09:31.000Z", required = true, value = "")
  @NotNull


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Asset1 transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

  /**
   * Get transactionHash
   * @return transactionHash
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", value = "")


  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public Asset1 functionCallHash(String functionCallHash) {
    this.functionCallHash = functionCallHash;
    return this;
  }

  /**
   * Get functionCallHash
   * @return functionCallHash
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", value = "")


  public String getFunctionCallHash() {
    return functionCallHash;
  }

  public void setFunctionCallHash(String functionCallHash) {
    this.functionCallHash = functionCallHash;
  }

  public Asset1 meta(String meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(example = "(Optional) This field can contain any additional data, in any structure", value = "")


  public String getMeta() {
    return meta;
  }

  public void setMeta(String meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asset1 asset1 = (Asset1) o;
    return Objects.equals(this.issuerAccount, asset1.issuerAccount) &&
        Objects.equals(this.code, asset1.code) &&
        Objects.equals(this.type, asset1.type) &&
        Objects.equals(this.amount, asset1.amount) &&
        Objects.equals(this.timestamp, asset1.timestamp) &&
        Objects.equals(this.transactionHash, asset1.transactionHash) &&
        Objects.equals(this.functionCallHash, asset1.functionCallHash) &&
        Objects.equals(this.meta, asset1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuerAccount, code, type, amount, timestamp, transactionHash, functionCallHash, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asset1 {\n");
    
    sb.append("    issuerAccount: ").append(toIndentedString(issuerAccount)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    functionCallHash: ").append(toIndentedString(functionCallHash)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

