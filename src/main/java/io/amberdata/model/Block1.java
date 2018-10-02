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

public class Block1   {
  @JsonProperty("number")
  private BigDecimal number = null;

  @JsonProperty("difficulty")
  private BigDecimal difficulty = null;

  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("input")
  private String input = null;

  @JsonProperty("gasLimit")
  private BigDecimal gasLimit = null;

  @JsonProperty("gasUsed")
  private BigDecimal gasUsed = null;

  @JsonProperty("miner")
  private String miner = null;

  @JsonProperty("nonce")
  private BigDecimal nonce = null;

  @JsonProperty("parentHash")
  private String parentHash = null;

  @JsonProperty("rewardValue")
  private BigDecimal rewardValue = null;

  @JsonProperty("size")
  private BigDecimal size = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("totalDifficulty")
  private BigDecimal totalDifficulty = null;

  @JsonProperty("numTransactions")
  private BigDecimal numTransactions = null;

  @JsonProperty("totalUncles")
  private BigDecimal totalUncles = null;

  @JsonProperty("transactionsRoot")
  private String transactionsRoot = null;

  @JsonProperty("meta")
  private String meta = null;

  public Block1 number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "5134243.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public Block1 difficulty(BigDecimal difficulty) {
    this.difficulty = difficulty;
    return this;
  }

  /**
   * Get difficulty
   * @return difficulty
  **/
  @ApiModelProperty(example = "2.347308378664457E15", value = "")

  @Valid

  public BigDecimal getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(BigDecimal difficulty) {
    this.difficulty = difficulty;
  }

  public Block1 hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(example = "0xf0817303bc0ef68deb17e60c200a0b13f93d43866d30af1b0799ec36aeddab97", value = "")


  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Block1 input(String input) {
    this.input = input;
    return this;
  }

  /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "0x", value = "")


  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public Block1 gasLimit(BigDecimal gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

  /**
   * Get gasLimit
   * @return gasLimit
  **/
  @ApiModelProperty(example = "6712068.0", value = "")

  @Valid

  public BigDecimal getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(BigDecimal gasLimit) {
    this.gasLimit = gasLimit;
  }

  public Block1 gasUsed(BigDecimal gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

  /**
   * Get gasUsed
   * @return gasUsed
  **/
  @ApiModelProperty(example = "1608525.0", value = "")

  @Valid

  public BigDecimal getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(BigDecimal gasUsed) {
    this.gasUsed = gasUsed;
  }

  public Block1 miner(String miner) {
    this.miner = miner;
    return this;
  }

  /**
   * Get miner
   * @return miner
  **/
  @ApiModelProperty(example = "0xf0817303bc0ef68deb17e60c200a0b13f93d438", value = "")


  public String getMiner() {
    return miner;
  }

  public void setMiner(String miner) {
    this.miner = miner;
  }

  public Block1 nonce(BigDecimal nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(example = "5134243.0", value = "")

  @Valid

  public BigDecimal getNonce() {
    return nonce;
  }

  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }

  public Block1 parentHash(String parentHash) {
    this.parentHash = parentHash;
    return this;
  }

  /**
   * Get parentHash
   * @return parentHash
  **/
  @ApiModelProperty(example = "0xf0817303bc0ef68deb17e60c200a0b13f93d43866d30af1b0799ec36aeddab97", value = "")


  public String getParentHash() {
    return parentHash;
  }

  public void setParentHash(String parentHash) {
    this.parentHash = parentHash;
  }

  public Block1 rewardValue(BigDecimal rewardValue) {
    this.rewardValue = rewardValue;
    return this;
  }

  /**
   * Get rewardValue
   * @return rewardValue
  **/
  @ApiModelProperty(example = "5134243.0", value = "")

  @Valid

  public BigDecimal getRewardValue() {
    return rewardValue;
  }

  public void setRewardValue(BigDecimal rewardValue) {
    this.rewardValue = rewardValue;
  }

  public Block1 size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "7829.0", value = "")

  @Valid

  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public Block1 timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "1532111933599", value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public Block1 totalDifficulty(BigDecimal totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
    return this;
  }

  /**
   * Get totalDifficulty
   * @return totalDifficulty
  **/
  @ApiModelProperty(example = "9.065813120672422E20", value = "")

  @Valid

  public BigDecimal getTotalDifficulty() {
    return totalDifficulty;
  }

  public void setTotalDifficulty(BigDecimal totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }

  public Block1 numTransactions(BigDecimal numTransactions) {
    this.numTransactions = numTransactions;
    return this;
  }

  /**
   * Get numTransactions
   * @return numTransactions
  **/
  @ApiModelProperty(example = "51.0", value = "")

  @Valid

  public BigDecimal getNumTransactions() {
    return numTransactions;
  }

  public void setNumTransactions(BigDecimal numTransactions) {
    this.numTransactions = numTransactions;
  }

  public Block1 totalUncles(BigDecimal totalUncles) {
    this.totalUncles = totalUncles;
    return this;
  }

  /**
   * Get totalUncles
   * @return totalUncles
  **/
  @ApiModelProperty(example = "1.0", value = "")

  @Valid

  public BigDecimal getTotalUncles() {
    return totalUncles;
  }

  public void setTotalUncles(BigDecimal totalUncles) {
    this.totalUncles = totalUncles;
  }

  public Block1 transactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
    return this;
  }

  /**
   * Get transactionsRoot
   * @return transactionsRoot
  **/
  @ApiModelProperty(example = "0xf0817303bc0ef68deb17e60c200a0b13f93d43866d30af1b0799ec36aeddab97", value = "")


  public String getTransactionsRoot() {
    return transactionsRoot;
  }

  public void setTransactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
  }

  public Block1 meta(String meta) {
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
    Block1 block1 = (Block1) o;
    return Objects.equals(this.number, block1.number) &&
        Objects.equals(this.difficulty, block1.difficulty) &&
        Objects.equals(this.hash, block1.hash) &&
        Objects.equals(this.input, block1.input) &&
        Objects.equals(this.gasLimit, block1.gasLimit) &&
        Objects.equals(this.gasUsed, block1.gasUsed) &&
        Objects.equals(this.miner, block1.miner) &&
        Objects.equals(this.nonce, block1.nonce) &&
        Objects.equals(this.parentHash, block1.parentHash) &&
        Objects.equals(this.rewardValue, block1.rewardValue) &&
        Objects.equals(this.size, block1.size) &&
        Objects.equals(this.timestamp, block1.timestamp) &&
        Objects.equals(this.totalDifficulty, block1.totalDifficulty) &&
        Objects.equals(this.numTransactions, block1.numTransactions) &&
        Objects.equals(this.totalUncles, block1.totalUncles) &&
        Objects.equals(this.transactionsRoot, block1.transactionsRoot) &&
        Objects.equals(this.meta, block1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, difficulty, hash, input, gasLimit, gasUsed, miner, nonce, parentHash, rewardValue, size, timestamp, totalDifficulty, numTransactions, totalUncles, transactionsRoot, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block1 {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    parentHash: ").append(toIndentedString(parentHash)).append("\n");
    sb.append("    rewardValue: ").append(toIndentedString(rewardValue)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    totalDifficulty: ").append(toIndentedString(totalDifficulty)).append("\n");
    sb.append("    numTransactions: ").append(toIndentedString(numTransactions)).append("\n");
    sb.append("    totalUncles: ").append(toIndentedString(totalUncles)).append("\n");
    sb.append("    transactionsRoot: ").append(toIndentedString(transactionsRoot)).append("\n");
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

