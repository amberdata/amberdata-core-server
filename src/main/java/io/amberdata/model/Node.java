package io.amberdata.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Node
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class Node   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("client")
  private String client = null;

  @JsonProperty("consensus")
  private String consensus = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  @JsonProperty("countryName")
  private String countryName = null;

  @JsonProperty("ip")
  private String ip = null;

  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("lastAsked")
  private String lastAsked = null;

  @JsonProperty("updatedAt")
  private String updatedAt = null;

  @JsonProperty("method")
  private String method = null;

  @JsonProperty("meta")
  private String meta = null;

  public Node id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "192.168.255.220", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Node client(String client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(example = "geth-1.8.9", value = "")


  public String getClient() {
    return client;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public Node consensus(String consensus) {
    this.consensus = consensus;
    return this;
  }

  /**
   * Get consensus
   * @return consensus
  **/
  @ApiModelProperty(example = "POW", value = "")


  public String getConsensus() {
    return consensus;
  }

  public void setConsensus(String consensus) {
    this.consensus = consensus;
  }

  public Node countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(example = "US", value = "")


  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Node countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Get countryName
   * @return countryName
  **/
  @ApiModelProperty(example = "United States", value = "")


  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public Node ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * Get ip
   * @return ip
  **/
  @ApiModelProperty(example = "192.168.255.220", required = true, value = "")
  @NotNull


  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Node hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
  **/
  @ApiModelProperty(value = "")


  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public Node lastAsked(String lastAsked) {
    this.lastAsked = lastAsked;
    return this;
  }

  /**
   * Get lastAsked
   * @return lastAsked
  **/
  @ApiModelProperty(example = "2018-02-13T04:12:25.926Z", value = "")


  public String getLastAsked() {
    return lastAsked;
  }

  public void setLastAsked(String lastAsked) {
    this.lastAsked = lastAsked;
  }

  public Node updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2018-02-13T04:12:25.926Z", value = "")


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Node method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(value = "")


  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Node meta(String meta) {
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
    Node node = (Node) o;
    return Objects.equals(this.id, node.id) &&
        Objects.equals(this.client, node.client) &&
        Objects.equals(this.consensus, node.consensus) &&
        Objects.equals(this.countryCode, node.countryCode) &&
        Objects.equals(this.countryName, node.countryName) &&
        Objects.equals(this.ip, node.ip) &&
        Objects.equals(this.hostname, node.hostname) &&
        Objects.equals(this.lastAsked, node.lastAsked) &&
        Objects.equals(this.updatedAt, node.updatedAt) &&
        Objects.equals(this.method, node.method) &&
        Objects.equals(this.meta, node.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, client, consensus, countryCode, countryName, ip, hostname, lastAsked, updatedAt, method, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    consensus: ").append(toIndentedString(consensus)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    lastAsked: ").append(toIndentedString(lastAsked)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

