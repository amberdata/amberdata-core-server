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
 * Address1
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class Address1   {
  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("type")
  private BigDecimal type = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("balanceIn")
  private BigDecimal balanceIn = null;

  @JsonProperty("balanceOut")
  private BigDecimal balanceOut = null;

  @JsonProperty("creator")
  private String creator = null;

  @JsonProperty("firstBlockNumber")
  private BigDecimal firstBlockNumber = null;

  @JsonProperty("firstTransactionHash")
  private String firstTransactionHash = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("timestampNanoseconds")
  private BigDecimal timestampNanoseconds = null;

  @JsonProperty("meta")
  private String meta = null;

  public Address1 hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(example = "0xe853c56864a2ebe4576a807d26fdc4a0ada51919", required = true, value = "")
  @NotNull


  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Address1 type(BigDecimal type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "0.0", value = "")

  @Valid

  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public Address1 balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(example = "0.0", value = "")

  @Valid

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Address1 balanceIn(BigDecimal balanceIn) {
    this.balanceIn = balanceIn;
    return this;
  }

  /**
   * Get balanceIn
   * @return balanceIn
  **/
  @ApiModelProperty(example = "3.201918846795979E20", value = "")

  @Valid

  public BigDecimal getBalanceIn() {
    return balanceIn;
  }

  public void setBalanceIn(BigDecimal balanceIn) {
    this.balanceIn = balanceIn;
  }

  public Address1 balanceOut(BigDecimal balanceOut) {
    this.balanceOut = balanceOut;
    return this;
  }

  /**
   * Get balanceOut
   * @return balanceOut
  **/
  @ApiModelProperty(example = "3.201918846795979E20", value = "")

  @Valid

  public BigDecimal getBalanceOut() {
    return balanceOut;
  }

  public void setBalanceOut(BigDecimal balanceOut) {
    this.balanceOut = balanceOut;
  }

  public Address1 creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(example = "0x0008ec9f540ceb20cda44ec8503981ff58a3361b", value = "")


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public Address1 firstBlockNumber(BigDecimal firstBlockNumber) {
    this.firstBlockNumber = firstBlockNumber;
    return this;
  }

  /**
   * Get firstBlockNumber
   * @return firstBlockNumber
  **/
  @ApiModelProperty(example = "3456.0", value = "")

  @Valid

  public BigDecimal getFirstBlockNumber() {
    return firstBlockNumber;
  }

  public void setFirstBlockNumber(BigDecimal firstBlockNumber) {
    this.firstBlockNumber = firstBlockNumber;
  }

  public Address1 firstTransactionHash(String firstTransactionHash) {
    this.firstTransactionHash = firstTransactionHash;
    return this;
  }

  /**
   * Get firstTransactionHash
   * @return firstTransactionHash
  **/
  @ApiModelProperty(example = "0x0008ec9f540ceb20cda44ec8503981ff58a3361b", value = "")


  public String getFirstTransactionHash() {
    return firstTransactionHash;
  }

  public void setFirstTransactionHash(String firstTransactionHash) {
    this.firstTransactionHash = firstTransactionHash;
  }

  public Address1 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "OmiseGo", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address1 symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(example = "OMG", value = "")


  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Address1 timestamp(String timestamp) {
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

  public Address1 timestampNanoseconds(BigDecimal timestampNanoseconds) {
    this.timestampNanoseconds = timestampNanoseconds;
    return this;
  }

  /**
   * Get timestampNanoseconds
   * @return timestampNanoseconds
  **/
  @ApiModelProperty(example = "100.0", value = "")

  @Valid

  public BigDecimal getTimestampNanoseconds() {
    return timestampNanoseconds;
  }

  public void setTimestampNanoseconds(BigDecimal timestampNanoseconds) {
    this.timestampNanoseconds = timestampNanoseconds;
  }

  public Address1 meta(String meta) {
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
    Address1 address1 = (Address1) o;
    return Objects.equals(this.hash, address1.hash) &&
        Objects.equals(this.type, address1.type) &&
        Objects.equals(this.balance, address1.balance) &&
        Objects.equals(this.balanceIn, address1.balanceIn) &&
        Objects.equals(this.balanceOut, address1.balanceOut) &&
        Objects.equals(this.creator, address1.creator) &&
        Objects.equals(this.firstBlockNumber, address1.firstBlockNumber) &&
        Objects.equals(this.firstTransactionHash, address1.firstTransactionHash) &&
        Objects.equals(this.name, address1.name) &&
        Objects.equals(this.symbol, address1.symbol) &&
        Objects.equals(this.timestamp, address1.timestamp) &&
        Objects.equals(this.timestampNanoseconds, address1.timestampNanoseconds) &&
        Objects.equals(this.meta, address1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, type, balance, balanceIn, balanceOut, creator, firstBlockNumber, firstTransactionHash, name, symbol, timestamp, timestampNanoseconds, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address1 {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceIn: ").append(toIndentedString(balanceIn)).append("\n");
    sb.append("    balanceOut: ").append(toIndentedString(balanceOut)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    firstBlockNumber: ").append(toIndentedString(firstBlockNumber)).append("\n");
    sb.append("    firstTransactionHash: ").append(toIndentedString(firstTransactionHash)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timestampNanoseconds: ").append(toIndentedString(timestampNanoseconds)).append("\n");
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

