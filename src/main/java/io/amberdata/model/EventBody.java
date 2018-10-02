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
 * EventBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class EventBody   {
  @JsonProperty("address")
  private String address = null;

  @JsonProperty("blockHash")
  private String blockHash = null;

  @JsonProperty("data")
  private String data = null;

  @JsonProperty("index")
  private BigDecimal index = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("topics")
  private String topics = null;

  @JsonProperty("transactionHash")
  private String transactionHash = null;

  @JsonProperty("transactionIndex")
  private BigDecimal transactionIndex = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("meta")
  private String meta = null;

  public EventBody address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "0xdf6164efd12678bf6a7d5a1ddf73c831493f6574", required = true, value = "")
  @NotNull


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public EventBody blockHash(String blockHash) {
    this.blockHash = blockHash;
    return this;
  }

  /**
   * Get blockHash
   * @return blockHash
  **/
  @ApiModelProperty(example = "0xec3228653eb19e86a046b85c0327ba2e736fa9b255ea6caed973fa2486bb5442", value = "")


  public String getBlockHash() {
    return blockHash;
  }

  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }

  public EventBody data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "0x000000000000000000000000000000000000000000000000000000000000076b0000000000000000000000000000000000000000000000000000000000000000", value = "")


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public EventBody index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(example = "49.0", value = "")

  @Valid

  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public EventBody timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "2018-01-05T05:09:31.000Z", value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public EventBody topics(String topics) {
    this.topics = topics;
    return this;
  }

  /**
   * Get topics
   * @return topics
  **/
  @ApiModelProperty(example = "0x26194856c6c579d36bc6b21531c958237d96b3f18856c8a745fd16e0133f1e8a", value = "")


  public String getTopics() {
    return topics;
  }

  public void setTopics(String topics) {
    this.topics = topics;
  }

  public EventBody transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

  /**
   * Get transactionHash
   * @return transactionHash
  **/
  @ApiModelProperty(example = "0xd858590924409ab454c33cb0cf4fed15fada6e4e204bcf82727ac54afd99b0da", value = "")


  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public EventBody transactionIndex(BigDecimal transactionIndex) {
    this.transactionIndex = transactionIndex;
    return this;
  }

  /**
   * Get transactionIndex
   * @return transactionIndex
  **/
  @ApiModelProperty(example = "26.0", value = "")

  @Valid

  public BigDecimal getTransactionIndex() {
    return transactionIndex;
  }

  public void setTransactionIndex(BigDecimal transactionIndex) {
    this.transactionIndex = transactionIndex;
  }

  public EventBody type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "event", value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EventBody meta(String meta) {
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
    EventBody eventBody = (EventBody) o;
    return Objects.equals(this.address, eventBody.address) &&
        Objects.equals(this.blockHash, eventBody.blockHash) &&
        Objects.equals(this.data, eventBody.data) &&
        Objects.equals(this.index, eventBody.index) &&
        Objects.equals(this.timestamp, eventBody.timestamp) &&
        Objects.equals(this.topics, eventBody.topics) &&
        Objects.equals(this.transactionHash, eventBody.transactionHash) &&
        Objects.equals(this.transactionIndex, eventBody.transactionIndex) &&
        Objects.equals(this.type, eventBody.type) &&
        Objects.equals(this.meta, eventBody.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, blockHash, data, index, timestamp, topics, transactionHash, transactionIndex, type, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventBody {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionIndex: ").append(toIndentedString(transactionIndex)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

