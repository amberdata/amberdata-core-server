package io.amberdata.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.amberdata.model.BlockchainsConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Example data object contains sample block data, block data submitted may vary. Actual block data may include more fields than example data below. Example data is from Ethereum blockchain.
 */
@ApiModel(description = "Example data object contains sample block data, block data submitted may vary. Actual block data may include more fields than example data below. Example data is from Ethereum blockchain.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class Blockchain   {
  @JsonProperty("blockchainId")
  private String blockchainId = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("network")
  private String network = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("permissions")
  private String permissions = null;

  @JsonProperty("config")
  private BlockchainsConfig config = null;

  public Blockchain blockchainId(String blockchainId) {
    this.blockchainId = blockchainId;
    return this;
  }

  /**
   * Get blockchainId
   * @return blockchainId
  **/
  @ApiModelProperty(example = "4ab60c9c4b8f31", value = "")


  public String getBlockchainId() {
    return blockchainId;
  }

  public void setBlockchainId(String blockchainId) {
    this.blockchainId = blockchainId;
  }

  public Blockchain slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  **/
  @ApiModelProperty(example = "ethereum-homestead", value = "")


  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Blockchain name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Ethereum", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Blockchain network(String network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(example = "Homestead", required = true, value = "")
  @NotNull


  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public Blockchain type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "testnet", value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Blockchain permissions(String permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(example = "public", value = "")


  public String getPermissions() {
    return permissions;
  }

  public void setPermissions(String permissions) {
    this.permissions = permissions;
  }

  public Blockchain config(BlockchainsConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BlockchainsConfig getConfig() {
    return config;
  }

  public void setConfig(BlockchainsConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Blockchain blockchain = (Blockchain) o;
    return Objects.equals(this.blockchainId, blockchain.blockchainId) &&
        Objects.equals(this.slug, blockchain.slug) &&
        Objects.equals(this.name, blockchain.name) &&
        Objects.equals(this.network, blockchain.network) &&
        Objects.equals(this.type, blockchain.type) &&
        Objects.equals(this.permissions, blockchain.permissions) &&
        Objects.equals(this.config, blockchain.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockchainId, slug, name, network, type, permissions, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Blockchain {\n");
    
    sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

