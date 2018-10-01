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
 * Example data object contains sample order data. Actual order data may include more fields than example data below.
 */
@ApiModel(description = "Example data object contains sample order data. Actual order data may include more fields than example data below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class Order   {
  @JsonProperty("type")
  private BigDecimal type = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("buyAsset")
  private String buyAsset = null;

  @JsonProperty("sellAsset")
  private String sellAsset = null;

  @JsonProperty("buyAmount")
  private BigDecimal buyAmount = null;

  @JsonProperty("sellAmount")
  private BigDecimal sellAmount = null;

  @JsonProperty("expirationMs")
  private BigDecimal expirationMs = null;

  @JsonProperty("expirationNanoseconds")
  private BigDecimal expirationNanoseconds = null;

  @JsonProperty("makerAddress")
  private String makerAddress = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("timestampNanoseconds")
  private BigDecimal timestampNanoseconds = null;

  @JsonProperty("blockNumber")
  private BigDecimal blockNumber = null;

  @JsonProperty("transactionHash")
  private String transactionHash = null;

  @JsonProperty("functionCallHash")
  private String functionCallHash = null;

  @JsonProperty("meta")
  private String meta = null;

  public Order type(BigDecimal type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "1.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public Order orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(example = "122", required = true, value = "")
  @NotNull


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Order buyAsset(String buyAsset) {
    this.buyAsset = buyAsset;
    return this;
  }

  /**
   * Get buyAsset
   * @return buyAsset
  **/
  @ApiModelProperty(example = "SYM", required = true, value = "")
  @NotNull


  public String getBuyAsset() {
    return buyAsset;
  }

  public void setBuyAsset(String buyAsset) {
    this.buyAsset = buyAsset;
  }

  public Order sellAsset(String sellAsset) {
    this.sellAsset = sellAsset;
    return this;
  }

  /**
   * Get sellAsset
   * @return sellAsset
  **/
  @ApiModelProperty(example = "XLM", required = true, value = "")
  @NotNull


  public String getSellAsset() {
    return sellAsset;
  }

  public void setSellAsset(String sellAsset) {
    this.sellAsset = sellAsset;
  }

  public Order buyAmount(BigDecimal buyAmount) {
    this.buyAmount = buyAmount;
    return this;
  }

  /**
   * Get buyAmount
   * @return buyAmount
  **/
  @ApiModelProperty(example = "3.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getBuyAmount() {
    return buyAmount;
  }

  public void setBuyAmount(BigDecimal buyAmount) {
    this.buyAmount = buyAmount;
  }

  public Order sellAmount(BigDecimal sellAmount) {
    this.sellAmount = sellAmount;
    return this;
  }

  /**
   * Get sellAmount
   * @return sellAmount
  **/
  @ApiModelProperty(example = "15.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getSellAmount() {
    return sellAmount;
  }

  public void setSellAmount(BigDecimal sellAmount) {
    this.sellAmount = sellAmount;
  }

  public Order expirationMs(BigDecimal expirationMs) {
    this.expirationMs = expirationMs;
    return this;
  }

  /**
   * Get expirationMs
   * @return expirationMs
  **/
  @ApiModelProperty(example = "6.0E7", value = "")

  @Valid

  public BigDecimal getExpirationMs() {
    return expirationMs;
  }

  public void setExpirationMs(BigDecimal expirationMs) {
    this.expirationMs = expirationMs;
  }

  public Order expirationNanoseconds(BigDecimal expirationNanoseconds) {
    this.expirationNanoseconds = expirationNanoseconds;
    return this;
  }

  /**
   * Get expirationNanoseconds
   * @return expirationNanoseconds
  **/
  @ApiModelProperty(example = "100.0", value = "")

  @Valid

  public BigDecimal getExpirationNanoseconds() {
    return expirationNanoseconds;
  }

  public void setExpirationNanoseconds(BigDecimal expirationNanoseconds) {
    this.expirationNanoseconds = expirationNanoseconds;
  }

  public Order makerAddress(String makerAddress) {
    this.makerAddress = makerAddress;
    return this;
  }

  /**
   * Get makerAddress
   * @return makerAddress
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", required = true, value = "")
  @NotNull


  public String getMakerAddress() {
    return makerAddress;
  }

  public void setMakerAddress(String makerAddress) {
    this.makerAddress = makerAddress;
  }

  public Order timestamp(String timestamp) {
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

  public Order timestampNanoseconds(BigDecimal timestampNanoseconds) {
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

  public Order blockNumber(BigDecimal blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

  /**
   * Get blockNumber
   * @return blockNumber
  **/
  @ApiModelProperty(example = "345.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(BigDecimal blockNumber) {
    this.blockNumber = blockNumber;
  }

  public Order transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

  /**
   * Get transactionHash
   * @return transactionHash
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", required = true, value = "")
  @NotNull


  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public Order functionCallHash(String functionCallHash) {
    this.functionCallHash = functionCallHash;
    return this;
  }

  /**
   * Get functionCallHash
   * @return functionCallHash
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", required = true, value = "")
  @NotNull


  public String getFunctionCallHash() {
    return functionCallHash;
  }

  public void setFunctionCallHash(String functionCallHash) {
    this.functionCallHash = functionCallHash;
  }

  public Order meta(String meta) {
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
    Order order = (Order) o;
    return Objects.equals(this.type, order.type) &&
        Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.buyAsset, order.buyAsset) &&
        Objects.equals(this.sellAsset, order.sellAsset) &&
        Objects.equals(this.buyAmount, order.buyAmount) &&
        Objects.equals(this.sellAmount, order.sellAmount) &&
        Objects.equals(this.expirationMs, order.expirationMs) &&
        Objects.equals(this.expirationNanoseconds, order.expirationNanoseconds) &&
        Objects.equals(this.makerAddress, order.makerAddress) &&
        Objects.equals(this.timestamp, order.timestamp) &&
        Objects.equals(this.timestampNanoseconds, order.timestampNanoseconds) &&
        Objects.equals(this.blockNumber, order.blockNumber) &&
        Objects.equals(this.transactionHash, order.transactionHash) &&
        Objects.equals(this.functionCallHash, order.functionCallHash) &&
        Objects.equals(this.meta, order.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, orderId, buyAsset, sellAsset, buyAmount, sellAmount, expirationMs, expirationNanoseconds, makerAddress, timestamp, timestampNanoseconds, blockNumber, transactionHash, functionCallHash, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    buyAsset: ").append(toIndentedString(buyAsset)).append("\n");
    sb.append("    sellAsset: ").append(toIndentedString(sellAsset)).append("\n");
    sb.append("    buyAmount: ").append(toIndentedString(buyAmount)).append("\n");
    sb.append("    sellAmount: ").append(toIndentedString(sellAmount)).append("\n");
    sb.append("    expirationMs: ").append(toIndentedString(expirationMs)).append("\n");
    sb.append("    expirationNanoseconds: ").append(toIndentedString(expirationNanoseconds)).append("\n");
    sb.append("    makerAddress: ").append(toIndentedString(makerAddress)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    timestampNanoseconds: ").append(toIndentedString(timestampNanoseconds)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
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

