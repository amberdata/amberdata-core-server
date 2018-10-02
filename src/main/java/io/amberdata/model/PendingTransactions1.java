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
 * Sample pending transaction
 */
@ApiModel(description = "Sample pending transaction")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class PendingTransactions1   {
  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("blockNumber")
  private BigDecimal blockNumber = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("creates")
  private String creates = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("gas")
  private BigDecimal gas = null;

  @JsonProperty("gasPrice")
  private BigDecimal gasPrice = null;

  @JsonProperty("transactionIndex")
  private BigDecimal transactionIndex = null;

  @JsonProperty("input")
  private String input = null;

  @JsonProperty("nonce")
  private BigDecimal nonce = null;

  @JsonProperty("publicKey")
  private String publicKey = null;

  @JsonProperty("raw")
  private String raw = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  @JsonProperty("meta")
  private String meta = null;

  @JsonProperty("createdAt")
  private BigDecimal createdAt = null;

  @JsonProperty("createdAtNanoseconds")
  private BigDecimal createdAtNanoseconds = null;

  @JsonProperty("confirmedHash")
  private String confirmedHash = null;

  @JsonProperty("confirmedAt")
  private BigDecimal confirmedAt = null;

  @JsonProperty("confirmedAtNanoseconds")
  private BigDecimal confirmedAtNanoseconds = null;

  @JsonProperty("state")
  private String state = null;

  public PendingTransactions1 hash(String hash) {
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

  public PendingTransactions1 blockNumber(BigDecimal blockNumber) {
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

  public PendingTransactions1 blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

  /**
   * Get blockHash
   * @return blockHash
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92033342d0bd026171c4", value = "")


  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public PendingTransactions1 creates(String creates) {
    this.creates = creates;
    return this;
  }

  /**
   * Get creates
   * @return creates
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92033342d0bd026171c4", value = "")


  public String getCreates() {
    return creates;
  }

  public void setCreates(String creates) {
    this.creates = creates;
  }

  public PendingTransactions1 from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "0x0a62f2c835e131a536678c0a55d042713434e4c0", required = true, value = "")
  @NotNull


  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public PendingTransactions1 gas(BigDecimal gas) {
    this.gas = gas;
    return this;
  }

  /**
   * Get gas
   * @return gas
  **/
  @ApiModelProperty(example = "3.0E7", value = "")

  @Valid

  public BigDecimal getGas() {
    return gas;
  }

  public void setGas(BigDecimal gas) {
    this.gas = gas;
  }

  public PendingTransactions1 gasPrice(BigDecimal gasPrice) {
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

  public PendingTransactions1 transactionIndex(BigDecimal transactionIndex) {
    this.transactionIndex = transactionIndex;
    return this;
  }

  /**
   * Get transactionIndex
   * @return transactionIndex
  **/
  @ApiModelProperty(example = "42.0", value = "")

  @Valid

  public BigDecimal getTransactionIndex() {
    return transactionIndex;
  }

  public void setTransactionIndex(BigDecimal transactionIndex) {
    this.transactionIndex = transactionIndex;
  }

  public PendingTransactions1 input(String input) {
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

  public PendingTransactions1 nonce(BigDecimal nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(example = "186.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getNonce() {
    return nonce;
  }

  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }

  public PendingTransactions1 publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

  /**
   * Get publicKey
   * @return publicKey
  **/
  @ApiModelProperty(example = "0x0a62f2c835e131a536678c0a55d042713434e4c0", value = "")


  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public PendingTransactions1 raw(String raw) {
    this.raw = raw;
    return this;
  }

  /**
   * Get raw
   * @return raw
  **/
  @ApiModelProperty(example = "0x0a62f2c835e131a536678c0a55d042713434e4c0", value = "")


  public String getRaw() {
    return raw;
  }

  public void setRaw(String raw) {
    this.raw = raw;
  }

  public PendingTransactions1 to(String to) {
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

  public PendingTransactions1 value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "123.456", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public PendingTransactions1 meta(String meta) {
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

  public PendingTransactions1 createdAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "1.534940211755E12", value = "")

  @Valid

  public BigDecimal getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(BigDecimal createdAt) {
    this.createdAt = createdAt;
  }

  public PendingTransactions1 createdAtNanoseconds(BigDecimal createdAtNanoseconds) {
    this.createdAtNanoseconds = createdAtNanoseconds;
    return this;
  }

  /**
   * Get createdAtNanoseconds
   * @return createdAtNanoseconds
  **/
  @ApiModelProperty(example = "10.0", value = "")

  @Valid

  public BigDecimal getCreatedAtNanoseconds() {
    return createdAtNanoseconds;
  }

  public void setCreatedAtNanoseconds(BigDecimal createdAtNanoseconds) {
    this.createdAtNanoseconds = createdAtNanoseconds;
  }

  public PendingTransactions1 confirmedHash(String confirmedHash) {
    this.confirmedHash = confirmedHash;
    return this;
  }

  /**
   * Get confirmedHash
   * @return confirmedHash
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", value = "")


  public String getConfirmedHash() {
    return confirmedHash;
  }

  public void setConfirmedHash(String confirmedHash) {
    this.confirmedHash = confirmedHash;
  }

  public PendingTransactions1 confirmedAt(BigDecimal confirmedAt) {
    this.confirmedAt = confirmedAt;
    return this;
  }

  /**
   * Get confirmedAt
   * @return confirmedAt
  **/
  @ApiModelProperty(example = "1.534940211755E12", value = "")

  @Valid

  public BigDecimal getConfirmedAt() {
    return confirmedAt;
  }

  public void setConfirmedAt(BigDecimal confirmedAt) {
    this.confirmedAt = confirmedAt;
  }

  public PendingTransactions1 confirmedAtNanoseconds(BigDecimal confirmedAtNanoseconds) {
    this.confirmedAtNanoseconds = confirmedAtNanoseconds;
    return this;
  }

  /**
   * Get confirmedAtNanoseconds
   * @return confirmedAtNanoseconds
  **/
  @ApiModelProperty(example = "10.0", value = "")

  @Valid

  public BigDecimal getConfirmedAtNanoseconds() {
    return confirmedAtNanoseconds;
  }

  public void setConfirmedAtNanoseconds(BigDecimal confirmedAtNanoseconds) {
    this.confirmedAtNanoseconds = confirmedAtNanoseconds;
  }

  public PendingTransactions1 state(String state) {
    this.state = state;
    return this;
  }

  /**
   * state: UNKNOWN (0), PENDING (1), CONFIRMED (2), REPLACED (3), LOST (4)
   * @return state
  **/
  @ApiModelProperty(example = "CONFIRMED", value = "state: UNKNOWN (0), PENDING (1), CONFIRMED (2), REPLACED (3), LOST (4)")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendingTransactions1 pendingTransactions1 = (PendingTransactions1) o;
    return Objects.equals(this.hash, pendingTransactions1.hash) &&
        Objects.equals(this.blockNumber, pendingTransactions1.blockNumber) &&
        Objects.equals(this.blockHash, pendingTransactions1.blockHash) &&
        Objects.equals(this.creates, pendingTransactions1.creates) &&
        Objects.equals(this.from, pendingTransactions1.from) &&
        Objects.equals(this.gas, pendingTransactions1.gas) &&
        Objects.equals(this.gasPrice, pendingTransactions1.gasPrice) &&
        Objects.equals(this.transactionIndex, pendingTransactions1.transactionIndex) &&
        Objects.equals(this.input, pendingTransactions1.input) &&
        Objects.equals(this.nonce, pendingTransactions1.nonce) &&
        Objects.equals(this.publicKey, pendingTransactions1.publicKey) &&
        Objects.equals(this.raw, pendingTransactions1.raw) &&
        Objects.equals(this.to, pendingTransactions1.to) &&
        Objects.equals(this.value, pendingTransactions1.value) &&
        Objects.equals(this.meta, pendingTransactions1.meta) &&
        Objects.equals(this.createdAt, pendingTransactions1.createdAt) &&
        Objects.equals(this.createdAtNanoseconds, pendingTransactions1.createdAtNanoseconds) &&
        Objects.equals(this.confirmedHash, pendingTransactions1.confirmedHash) &&
        Objects.equals(this.confirmedAt, pendingTransactions1.confirmedAt) &&
        Objects.equals(this.confirmedAtNanoseconds, pendingTransactions1.confirmedAtNanoseconds) &&
        Objects.equals(this.state, pendingTransactions1.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, blockNumber, blockHash, creates, from, gas, gasPrice, transactionIndex, input, nonce, publicKey, raw, to, value, meta, createdAt, createdAtNanoseconds, confirmedHash, confirmedAt, confirmedAtNanoseconds, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendingTransactions1 {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    creates: ").append(toIndentedString(creates)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    transactionIndex: ").append(toIndentedString(transactionIndex)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdAtNanoseconds: ").append(toIndentedString(createdAtNanoseconds)).append("\n");
    sb.append("    confirmedHash: ").append(toIndentedString(confirmedHash)).append("\n");
    sb.append("    confirmedAt: ").append(toIndentedString(confirmedAt)).append("\n");
    sb.append("    confirmedAtNanoseconds: ").append(toIndentedString(confirmedAtNanoseconds)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

