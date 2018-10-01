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
 * Example data object contains sample block data, block data submitted may vary. Actual block data may include more fields than example data below. Example data is from Ethereum blockchain.
 */
@ApiModel(description = "Example data object contains sample block data, block data submitted may vary. Actual block data may include more fields than example data below. Example data is from Ethereum blockchain.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class Transaction   {
  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("blockNumber")
  private BigDecimal blockNumber = null;

  @JsonProperty("contractAddress")
  private String contractAddress = null;

  @JsonProperty("cumulativeGasUsed")
  private BigDecimal cumulativeGasUsed = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("fee")
  private BigDecimal fee = null;

  @JsonProperty("gasPrice")
  private BigDecimal gasPrice = null;

  @JsonProperty("gasLimit")
  private BigDecimal gasLimit = null;

  @JsonProperty("gasUsed")
  private BigDecimal gasUsed = null;

  @JsonProperty("transactionIndex")
  private BigDecimal transactionIndex = null;

  @JsonProperty("input")
  private String input = null;

  @JsonProperty("nonce")
  private BigDecimal nonce = null;

  @JsonProperty("status")
  private BigDecimal status = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  @JsonProperty("meta")
  private String meta = null;

  public Transaction hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", required = true, value = "")
  @NotNull


  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Transaction blockNumber(BigDecimal blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

  /**
   * Get blockNumber
   * @return blockNumber
  **/
  @ApiModelProperty(example = "4842891.0", value = "")

  @Valid

  public BigDecimal getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(BigDecimal blockNumber) {
    this.blockNumber = blockNumber;
  }

  public Transaction contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

  /**
   * Get contractAddress
   * @return contractAddress
  **/
  @ApiModelProperty(example = "0x0a62f2c835e131a536678c0a55d042713434e4c0", value = "")


  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }

  public Transaction cumulativeGasUsed(BigDecimal cumulativeGasUsed) {
    this.cumulativeGasUsed = cumulativeGasUsed;
    return this;
  }

  /**
   * Get cumulativeGasUsed
   * @return cumulativeGasUsed
  **/
  @ApiModelProperty(example = "1772128.0", value = "")

  @Valid

  public BigDecimal getCumulativeGasUsed() {
    return cumulativeGasUsed;
  }

  public void setCumulativeGasUsed(BigDecimal cumulativeGasUsed) {
    this.cumulativeGasUsed = cumulativeGasUsed;
  }

  public Transaction from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "0x0a62f2c835e131a536678c0a55d042713434e4c0", value = "")


  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Transaction fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(example = "1823100.0", value = "")

  @Valid

  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public Transaction gasPrice(BigDecimal gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

  /**
   * Get gasPrice
   * @return gasPrice
  **/
  @ApiModelProperty(example = "2000000.0", value = "")

  @Valid

  public BigDecimal getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(BigDecimal gasPrice) {
    this.gasPrice = gasPrice;
  }

  public Transaction gasLimit(BigDecimal gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

  /**
   * Get gasLimit
   * @return gasLimit
  **/
  @ApiModelProperty(example = "3.0E7", value = "")

  @Valid

  public BigDecimal getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(BigDecimal gasLimit) {
    this.gasLimit = gasLimit;
  }

  public Transaction gasUsed(BigDecimal gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

  /**
   * Get gasUsed
   * @return gasUsed
  **/
  @ApiModelProperty(example = "91155.0", value = "")

  @Valid

  public BigDecimal getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(BigDecimal gasUsed) {
    this.gasUsed = gasUsed;
  }

  public Transaction transactionIndex(BigDecimal transactionIndex) {
    this.transactionIndex = transactionIndex;
    return this;
  }

  /**
   * Get transactionIndex
   * @return transactionIndex
  **/
  @ApiModelProperty(example = "41.0", value = "")

  @Valid

  public BigDecimal getTransactionIndex() {
    return transactionIndex;
  }

  public void setTransactionIndex(BigDecimal transactionIndex) {
    this.transactionIndex = transactionIndex;
  }

  public Transaction input(String input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "0xaf81c5b90000000000000000000000008f3470a7388c05ee4e7af3d01d8c722b0ff52374000000000000000000000000000000000000000000000000063eb89da4ed0000", value = "")


  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public Transaction nonce(BigDecimal nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(example = "186.0", value = "")

  @Valid

  public BigDecimal getNonce() {
    return nonce;
  }

  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }

  public Transaction status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * (1 for success, or 0 for fail)
   * @return status
  **/
  @ApiModelProperty(example = "1.0", value = "(1 for success, or 0 for fail)")

  @Valid

  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public Transaction timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "2018-01-03T01:47:06.000Z", value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Transaction to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "0x65bf121299b428adcfb5b408e6d582f3cbbad415", value = "")


  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Transaction value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "0.0", value = "")

  @Valid

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Transaction meta(String meta) {
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
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.hash, transaction.hash) &&
        Objects.equals(this.blockNumber, transaction.blockNumber) &&
        Objects.equals(this.contractAddress, transaction.contractAddress) &&
        Objects.equals(this.cumulativeGasUsed, transaction.cumulativeGasUsed) &&
        Objects.equals(this.from, transaction.from) &&
        Objects.equals(this.fee, transaction.fee) &&
        Objects.equals(this.gasPrice, transaction.gasPrice) &&
        Objects.equals(this.gasLimit, transaction.gasLimit) &&
        Objects.equals(this.gasUsed, transaction.gasUsed) &&
        Objects.equals(this.transactionIndex, transaction.transactionIndex) &&
        Objects.equals(this.input, transaction.input) &&
        Objects.equals(this.nonce, transaction.nonce) &&
        Objects.equals(this.status, transaction.status) &&
        Objects.equals(this.timestamp, transaction.timestamp) &&
        Objects.equals(this.to, transaction.to) &&
        Objects.equals(this.value, transaction.value) &&
        Objects.equals(this.meta, transaction.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, blockNumber, contractAddress, cumulativeGasUsed, from, fee, gasPrice, gasLimit, gasUsed, transactionIndex, input, nonce, status, timestamp, to, value, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    cumulativeGasUsed: ").append(toIndentedString(cumulativeGasUsed)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    transactionIndex: ").append(toIndentedString(transactionIndex)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

