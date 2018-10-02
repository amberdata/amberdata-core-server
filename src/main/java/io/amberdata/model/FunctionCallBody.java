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
 * Example data object contains sample function call data. Actual function call data may include more fields than example data below.
 */
@ApiModel(description = "Example data object contains sample function call data. Actual function call data may include more fields than example data below.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class FunctionCallBody   {
  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("transactionHash")
  private String transactionHash = null;

  @JsonProperty("index")
  private BigDecimal index = null;

  @JsonProperty("arguments")
  private String arguments = null;

  @JsonProperty("assetType")
  private String assetType = null;

  @JsonProperty("depth")
  private BigDecimal depth = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("result")
  private String result = null;

  @JsonProperty("signature")
  private String signature = null;

  @JsonProperty("timestamp")
  private String timestamp = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  @JsonProperty("meta")
  private String meta = null;

  public FunctionCallBody hash(String hash) {
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

  public FunctionCallBody transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

  /**
   * Get transactionHash
   * @return transactionHash
  **/
  @ApiModelProperty(example = "0xf0817303bc0ef68deb17e60c200a0b13f93d43866d30af1b0799ec36aeddab97", required = true, value = "")
  @NotNull


  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public FunctionCallBody index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
  **/
  @ApiModelProperty(example = "42.0", required = true, value = "")
  @NotNull

  @Valid

  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }

  public FunctionCallBody arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * Get arguments
   * @return arguments
  **/
  @ApiModelProperty(example = "(Optional) { address: \"0x65bf121299b428adcfb5b408e6d582f3cbbad415\", value: 2500000000000 }", value = "")


  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  public FunctionCallBody assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Get assetType
   * @return assetType
  **/
  @ApiModelProperty(example = "XLM", value = "")


  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public FunctionCallBody depth(BigDecimal depth) {
    this.depth = depth;
    return this;
  }

  /**
   * Get depth
   * @return depth
  **/
  @ApiModelProperty(example = "1.0", value = "")

  @Valid

  public BigDecimal getDepth() {
    return depth;
  }

  public void setDepth(BigDecimal depth) {
    this.depth = depth;
  }

  public FunctionCallBody from(String from) {
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

  public FunctionCallBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "(Optional) The name of the function being called", value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FunctionCallBody result(String result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(example = "Result of the function call", required = true, value = "")
  @NotNull


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public FunctionCallBody signature(String signature) {
    this.signature = signature;
    return this;
  }

  /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(example = "(Optional) transfer(address,uint256)", value = "")


  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public FunctionCallBody timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "1532111933599", required = true, value = "")
  @NotNull


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public FunctionCallBody to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "(Optional) 0x65bf121299b428adcfb5b408e6d582f3cbbad415", value = "")


  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public FunctionCallBody type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "(Optional) function_call|create_account|payment|...", value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FunctionCallBody value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "(Optional) value of the underlying asset being transferred, if any", value = "")

  @Valid

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public FunctionCallBody meta(String meta) {
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
    FunctionCallBody functionCallBody = (FunctionCallBody) o;
    return Objects.equals(this.hash, functionCallBody.hash) &&
        Objects.equals(this.transactionHash, functionCallBody.transactionHash) &&
        Objects.equals(this.index, functionCallBody.index) &&
        Objects.equals(this.arguments, functionCallBody.arguments) &&
        Objects.equals(this.assetType, functionCallBody.assetType) &&
        Objects.equals(this.depth, functionCallBody.depth) &&
        Objects.equals(this.from, functionCallBody.from) &&
        Objects.equals(this.name, functionCallBody.name) &&
        Objects.equals(this.result, functionCallBody.result) &&
        Objects.equals(this.signature, functionCallBody.signature) &&
        Objects.equals(this.timestamp, functionCallBody.timestamp) &&
        Objects.equals(this.to, functionCallBody.to) &&
        Objects.equals(this.type, functionCallBody.type) &&
        Objects.equals(this.value, functionCallBody.value) &&
        Objects.equals(this.meta, functionCallBody.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, transactionHash, index, arguments, assetType, depth, from, name, result, signature, timestamp, to, type, value, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionCallBody {\n");
    
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

