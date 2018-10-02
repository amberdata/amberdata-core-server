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
 * Sample Uncle
 */
@ApiModel(description = "Sample Uncle")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class Uncle   {
  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("blockNumber")
  private BigDecimal blockNumber = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("difficulty")
  private BigDecimal difficulty = null;

  @JsonProperty("gasLimit")
  private BigDecimal gasLimit = null;

  @JsonProperty("gasUsed")
  private BigDecimal gasUsed = null;

  @JsonProperty("logsBloom")
  private String logsBloom = null;

  @JsonProperty("miner")
  private String miner = null;

  @JsonProperty("mixHash")
  private String mixHash = null;

  @JsonProperty("nonce")
  private BigDecimal nonce = null;

  @JsonProperty("number")
  private BigDecimal number = null;

  @JsonProperty("parentHash")
  private String parentHash = null;

  @JsonProperty("positionIndex")
  private BigDecimal positionIndex = null;

  @JsonProperty("rewardValue")
  private BigDecimal rewardValue = null;

  @JsonProperty("receiptsRoot")
  private String receiptsRoot = null;

  @JsonProperty("sha3Uncles")
  private String sha3Uncles = null;

  @JsonProperty("size")
  private BigDecimal size = null;

  @JsonProperty("stateRoot")
  private String stateRoot = null;

  @JsonProperty("timestamp")
  private BigDecimal timestamp = null;

  @JsonProperty("timestampNanoseconds")
  private BigDecimal timestampNanoseconds = null;

  @JsonProperty("totalDifficulty")
  private BigDecimal totalDifficulty = null;

  @JsonProperty("transactionsRoot")
  private String transactionsRoot = null;

  @JsonProperty("meta")
  private String meta = null;

  @JsonProperty("blockTimestamp")
  private BigDecimal blockTimestamp = null;

  @JsonProperty("blockTimestampNanoseconds")
  private BigDecimal blockTimestampNanoseconds = null;

  public Uncle hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(example = "0xe2c025832f1e3a4de069a8090b11b0a8504452966ca364d0a2d51f0e78138f5a", required = true, value = "")
  @NotNull


  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Uncle blockNumber(BigDecimal blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

  /**
   * Get blockNumber
   * @return blockNumber
  **/
  @ApiModelProperty(example = "5134246.0", value = "")

  @Valid

  public BigDecimal getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(BigDecimal blockNumber) {
    this.blockNumber = blockNumber;
  }

  public Uncle blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

  /**
   * Get blockHash
   * @return blockHash
  **/
  @ApiModelProperty(example = "0xe2c025832f1e3a4de069b8090b11b0a8504452966ca364d0a2d51f0e78138f5a", value = "")


  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public Uncle difficulty(BigDecimal difficulty) {
    this.difficulty = difficulty;
    return this;
  }

  /**
   * Get difficulty
   * @return difficulty
  **/
  @ApiModelProperty(example = "1.954156714554804E15", value = "")

  @Valid

  public BigDecimal getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(BigDecimal difficulty) {
    this.difficulty = difficulty;
  }

  public Uncle gasLimit(BigDecimal gasLimit) {
    this.gasLimit = gasLimit;
    return this;
  }

  /**
   * Get gasLimit
   * @return gasLimit
  **/
  @ApiModelProperty(example = "8000000.0", value = "")

  @Valid

  public BigDecimal getGasLimit() {
    return gasLimit;
  }

  public void setGasLimit(BigDecimal gasLimit) {
    this.gasLimit = gasLimit;
  }

  public Uncle gasUsed(BigDecimal gasUsed) {
    this.gasUsed = gasUsed;
    return this;
  }

  /**
   * Get gasUsed
   * @return gasUsed
  **/
  @ApiModelProperty(example = "7983640.0", value = "")

  @Valid

  public BigDecimal getGasUsed() {
    return gasUsed;
  }

  public void setGasUsed(BigDecimal gasUsed) {
    this.gasUsed = gasUsed;
  }

  public Uncle logsBloom(String logsBloom) {
    this.logsBloom = logsBloom;
    return this;
  }

  /**
   * Get logsBloom
   * @return logsBloom
  **/
  @ApiModelProperty(example = "0x04000000200a6010cc0000400001109a200008800000a00694100c8050604028000041040c00000000804310064004050010000904882080101c8005482803000000084001c20001c810480e6000100042020106008000004002000100400000041000220441b0320910c05000a0020000e0002028048001140000951088c400290083010020a0408402001100a0501a040091c5e00080d4805600060100330986000100320800080080820000b491114400800d00018021000e0491002840205800000200004000140000000090000e18030024840c08442070300010402800201c020100008200044000602010e00400900020e08080090034120000002029", value = "")


  public String getLogsBloom() {
    return logsBloom;
  }

  public void setLogsBloom(String logsBloom) {
    this.logsBloom = logsBloom;
  }

  public Uncle miner(String miner) {
    this.miner = miner;
    return this;
  }

  /**
   * Get miner
   * @return miner
  **/
  @ApiModelProperty(example = "0x829bd824b016326a401d083b33d092293333a830", required = true, value = "")
  @NotNull


  public String getMiner() {
    return miner;
  }

  public void setMiner(String miner) {
    this.miner = miner;
  }

  public Uncle mixHash(String mixHash) {
    this.mixHash = mixHash;
    return this;
  }

  /**
   * Get mixHash
   * @return mixHash
  **/
  @ApiModelProperty(example = "0xffdc9e055bba26af0fbbbc8ab56caf32487444ae949479b0e7502ff0f01d691e", value = "")


  public String getMixHash() {
    return mixHash;
  }

  public void setMixHash(String mixHash) {
    this.mixHash = mixHash;
  }

  public Uncle nonce(BigDecimal nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(example = "6.6256172121905792E17", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getNonce() {
    return nonce;
  }

  public void setNonce(BigDecimal nonce) {
    this.nonce = nonce;
  }

  public Uncle number(BigDecimal number) {
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

  public Uncle parentHash(String parentHash) {
    this.parentHash = parentHash;
    return this;
  }

  /**
   * Get parentHash
   * @return parentHash
  **/
  @ApiModelProperty(example = "0x9f35b3e7f2c5e75919cf07e79fd28f2b2d2e2dce8a22f978e581f557ea11af78", required = true, value = "")
  @NotNull


  public String getParentHash() {
    return parentHash;
  }

  public void setParentHash(String parentHash) {
    this.parentHash = parentHash;
  }

  public Uncle positionIndex(BigDecimal positionIndex) {
    this.positionIndex = positionIndex;
    return this;
  }

  /**
   * Get positionIndex
   * @return positionIndex
  **/
  @ApiModelProperty(example = "2.0", value = "")

  @Valid

  public BigDecimal getPositionIndex() {
    return positionIndex;
  }

  public void setPositionIndex(BigDecimal positionIndex) {
    this.positionIndex = positionIndex;
  }

  public Uncle rewardValue(BigDecimal rewardValue) {
    this.rewardValue = rewardValue;
    return this;
  }

  /**
   * Get rewardValue
   * @return rewardValue
  **/
  @ApiModelProperty(example = "2.25E12", value = "")

  @Valid

  public BigDecimal getRewardValue() {
    return rewardValue;
  }

  public void setRewardValue(BigDecimal rewardValue) {
    this.rewardValue = rewardValue;
  }

  public Uncle receiptsRoot(String receiptsRoot) {
    this.receiptsRoot = receiptsRoot;
    return this;
  }

  /**
   * Get receiptsRoot
   * @return receiptsRoot
  **/
  @ApiModelProperty(example = "0xa1d1fcbc9ae07200767f75cc8fc1f2b3bf681fc5bcb99d1d77a90b402021f1cd", value = "")


  public String getReceiptsRoot() {
    return receiptsRoot;
  }

  public void setReceiptsRoot(String receiptsRoot) {
    this.receiptsRoot = receiptsRoot;
  }

  public Uncle sha3Uncles(String sha3Uncles) {
    this.sha3Uncles = sha3Uncles;
    return this;
  }

  /**
   * Get sha3Uncles
   * @return sha3Uncles
  **/
  @ApiModelProperty(example = "0xa1d1fcbc9ae07200767f75cc8fc1f2b3bf681fc5bcb99d1d77a90b402021f1cd", value = "")


  public String getSha3Uncles() {
    return sha3Uncles;
  }

  public void setSha3Uncles(String sha3Uncles) {
    this.sha3Uncles = sha3Uncles;
  }

  public Uncle size(BigDecimal size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "536.0", value = "")

  @Valid

  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public Uncle stateRoot(String stateRoot) {
    this.stateRoot = stateRoot;
    return this;
  }

  /**
   * Get stateRoot
   * @return stateRoot
  **/
  @ApiModelProperty(example = "0xa1d1fcbc9ae07200767f75cc8fc1f2b3bf681fc5bcb99d1d77a90b402021f1cd", value = "")


  public String getStateRoot() {
    return stateRoot;
  }

  public void setStateRoot(String stateRoot) {
    this.stateRoot = stateRoot;
  }

  public Uncle timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "1.534940211755E12", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public Uncle timestampNanoseconds(BigDecimal timestampNanoseconds) {
    this.timestampNanoseconds = timestampNanoseconds;
    return this;
  }

  /**
   * Get timestampNanoseconds
   * @return timestampNanoseconds
  **/
  @ApiModelProperty(example = "10.0", value = "")

  @Valid

  public BigDecimal getTimestampNanoseconds() {
    return timestampNanoseconds;
  }

  public void setTimestampNanoseconds(BigDecimal timestampNanoseconds) {
    this.timestampNanoseconds = timestampNanoseconds;
  }

  public Uncle totalDifficulty(BigDecimal totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
    return this;
  }

  /**
   * Get totalDifficulty
   * @return totalDifficulty
  **/
  @ApiModelProperty(example = "1.954156714554804E15", value = "")

  @Valid

  public BigDecimal getTotalDifficulty() {
    return totalDifficulty;
  }

  public void setTotalDifficulty(BigDecimal totalDifficulty) {
    this.totalDifficulty = totalDifficulty;
  }

  public Uncle transactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
    return this;
  }

  /**
   * Get transactionsRoot
   * @return transactionsRoot
  **/
  @ApiModelProperty(example = "0xcecdb011d15d0ee8d6b167ab064e61606231b0b25c033511750f51c37e476a13", value = "")


  public String getTransactionsRoot() {
    return transactionsRoot;
  }

  public void setTransactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
  }

  public Uncle meta(String meta) {
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

  public Uncle blockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
    return this;
  }

  /**
   * Get blockTimestamp
   * @return blockTimestamp
  **/
  @ApiModelProperty(example = "1.534940211755E12", value = "")

  @Valid

  public BigDecimal getBlockTimestamp() {
    return blockTimestamp;
  }

  public void setBlockTimestamp(BigDecimal blockTimestamp) {
    this.blockTimestamp = blockTimestamp;
  }

  public Uncle blockTimestampNanoseconds(BigDecimal blockTimestampNanoseconds) {
    this.blockTimestampNanoseconds = blockTimestampNanoseconds;
    return this;
  }

  /**
   * Get blockTimestampNanoseconds
   * @return blockTimestampNanoseconds
  **/
  @ApiModelProperty(example = "10.0", value = "")

  @Valid

  public BigDecimal getBlockTimestampNanoseconds() {
    return blockTimestampNanoseconds;
  }

  public void setBlockTimestampNanoseconds(BigDecimal blockTimestampNanoseconds) {
    this.blockTimestampNanoseconds = blockTimestampNanoseconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Uncle uncle = (Uncle) o;
    return Objects.equals(this.hash, uncle.hash) &&
        Objects.equals(this.blockNumber, uncle.blockNumber) &&
        Objects.equals(this.blockHash, uncle.blockHash) &&
        Objects.equals(this.difficulty, uncle.difficulty) &&
        Objects.equals(this.gasLimit, uncle.gasLimit) &&
        Objects.equals(this.gasUsed, uncle.gasUsed) &&
        Objects.equals(this.logsBloom, uncle.logsBloom) &&
        Objects.equals(this.miner, uncle.miner) &&
        Objects.equals(this.mixHash, uncle.mixHash) &&
        Objects.equals(this.nonce, uncle.nonce) &&
        Objects.equals(this.number, uncle.number) &&
        Objects.equals(this.parentHash, uncle.parentHash) &&
        Objects.equals(this.positionIndex, uncle.positionIndex) &&
        Objects.equals(this.rewardValue, uncle.rewardValue) &&
        Objects.equals(this.receiptsRoot, uncle.receiptsRoot) &&
        Objects.equals(this.sha3Uncles, uncle.sha3Uncles) &&
        Objects.equals(this.size, uncle.size) &&
        Objects.equals(this.stateRoot, uncle.stateRoot) &&
        Objects.equals(this.timestamp, uncle.timestamp) &&
        Objects.equals(this.timestampNanoseconds, uncle.timestampNanoseconds) &&
        Objects.equals(this.totalDifficulty, uncle.totalDifficulty) &&
        Objects.equals(this.transactionsRoot, uncle.transactionsRoot) &&
        Objects.equals(this.meta, uncle.meta) &&
        Objects.equals(this.blockTimestamp, uncle.blockTimestamp) &&
        Objects.equals(this.blockTimestampNanoseconds, uncle.blockTimestampNanoseconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, blockNumber, blockHash, difficulty, gasLimit, gasUsed, logsBloom, miner, mixHash, nonce, number, parentHash, positionIndex, rewardValue, receiptsRoot, sha3Uncles, size, stateRoot, timestamp, timestampNanoseconds, totalDifficulty, transactionsRoot, meta, blockTimestamp, blockTimestampNanoseconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Uncle {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    logsBloom: ").append(toIndentedString(logsBloom)).append("\n");
    sb.append("    miner: ").append(toIndentedString(miner)).append("\n");
    sb.append("    mixHash: ").append(toIndentedString(mixHash)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    parentHash: ").append(toIndentedString(parentHash)).append("\n");
    sb.append("    positionIndex: ").append(toIndentedString(positionIndex)).append("\n");
    sb.append("    rewardValue: ").append(toIndentedString(rewardValue)).append("\n");
    sb.append("    receiptsRoot: ").append(toIndentedString(receiptsRoot)).append("\n");
    sb.append("    sha3Uncles: ").append(toIndentedString(sha3Uncles)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    stateRoot: ").append(toIndentedString(stateRoot)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timestampNanoseconds: ").append(toIndentedString(timestampNanoseconds)).append("\n");
    sb.append("    totalDifficulty: ").append(toIndentedString(totalDifficulty)).append("\n");
    sb.append("    transactionsRoot: ").append(toIndentedString(transactionsRoot)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    blockTimestamp: ").append(toIndentedString(blockTimestamp)).append("\n");
    sb.append("    blockTimestampNanoseconds: ").append(toIndentedString(blockTimestampNanoseconds)).append("\n");
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

