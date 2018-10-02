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
 * Example data object contains sample trade data. Actual trade data may include more fields than example data below.
 */
@ApiModel(description = "Example data object contains sample trade data. Actual trade data may include more fields than example data below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class Trade   {
  @JsonProperty("tradeId")
  private String tradeId = null;

  @JsonProperty("type")
  private BigDecimal type = null;

  @JsonProperty("orderId")
  private String orderId = null;

  @JsonProperty("buyAddress")
  private String buyAddress = null;

  @JsonProperty("buyAsset")
  private String buyAsset = null;

  @JsonProperty("buyAmount")
  private BigDecimal buyAmount = null;

  @JsonProperty("sellAddress")
  private String sellAddress = null;

  @JsonProperty("sellAsset")
  private String sellAsset = null;

  @JsonProperty("sellAmount")
  private BigDecimal sellAmount = null;

  @JsonProperty("fee")
  private BigDecimal fee = null;

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

  public Trade tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }

  /**
   * Get tradeId
   * @return tradeId
  **/
  @ApiModelProperty(example = "3697472920621057", required = true, value = "")
  @NotNull


  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  public Trade type(BigDecimal type) {
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

  public Trade orderId(String orderId) {
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

  public Trade buyAddress(String buyAddress) {
    this.buyAddress = buyAddress;
    return this;
  }

  /**
   * Get buyAddress
   * @return buyAddress
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", required = true, value = "")
  @NotNull


  public String getBuyAddress() {
    return buyAddress;
  }

  public void setBuyAddress(String buyAddress) {
    this.buyAddress = buyAddress;
  }

  public Trade buyAsset(String buyAsset) {
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

  public Trade buyAmount(BigDecimal buyAmount) {
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

  public Trade sellAddress(String sellAddress) {
    this.sellAddress = sellAddress;
    return this;
  }

  /**
   * Get sellAddress
   * @return sellAddress
  **/
  @ApiModelProperty(example = "0x3f6dd22a5b1ee4ab60c9c4b8f31e8817cad86ce182fc92007342d0bd026171c4", required = true, value = "")
  @NotNull


  public String getSellAddress() {
    return sellAddress;
  }

  public void setSellAddress(String sellAddress) {
    this.sellAddress = sellAddress;
  }

  public Trade sellAsset(String sellAsset) {
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

  public Trade sellAmount(BigDecimal sellAmount) {
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

  public Trade fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Get fee
   * @return fee
  **/
  @ApiModelProperty(example = "1.0", value = "")

  @Valid

  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public Trade timestamp(String timestamp) {
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

  public Trade timestampNanoseconds(BigDecimal timestampNanoseconds) {
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

  public Trade blockNumber(BigDecimal blockNumber) {
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

  public Trade transactionHash(String transactionHash) {
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

  public Trade functionCallHash(String functionCallHash) {
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

  public Trade meta(String meta) {
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
    Trade trade = (Trade) o;
    return Objects.equals(this.tradeId, trade.tradeId) &&
        Objects.equals(this.type, trade.type) &&
        Objects.equals(this.orderId, trade.orderId) &&
        Objects.equals(this.buyAddress, trade.buyAddress) &&
        Objects.equals(this.buyAsset, trade.buyAsset) &&
        Objects.equals(this.buyAmount, trade.buyAmount) &&
        Objects.equals(this.sellAddress, trade.sellAddress) &&
        Objects.equals(this.sellAsset, trade.sellAsset) &&
        Objects.equals(this.sellAmount, trade.sellAmount) &&
        Objects.equals(this.fee, trade.fee) &&
        Objects.equals(this.timestamp, trade.timestamp) &&
        Objects.equals(this.timestampNanoseconds, trade.timestampNanoseconds) &&
        Objects.equals(this.blockNumber, trade.blockNumber) &&
        Objects.equals(this.transactionHash, trade.transactionHash) &&
        Objects.equals(this.functionCallHash, trade.functionCallHash) &&
        Objects.equals(this.meta, trade.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeId, type, orderId, buyAddress, buyAsset, buyAmount, sellAddress, sellAsset, sellAmount, fee, timestamp, timestampNanoseconds, blockNumber, transactionHash, functionCallHash, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trade {\n");
    
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    buyAddress: ").append(toIndentedString(buyAddress)).append("\n");
    sb.append("    buyAsset: ").append(toIndentedString(buyAsset)).append("\n");
    sb.append("    buyAmount: ").append(toIndentedString(buyAmount)).append("\n");
    sb.append("    sellAddress: ").append(toIndentedString(sellAddress)).append("\n");
    sb.append("    sellAsset: ").append(toIndentedString(sellAsset)).append("\n");
    sb.append("    sellAmount: ").append(toIndentedString(sellAmount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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

