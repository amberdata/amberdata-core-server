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
 * BlockchainsConfigPanels
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class BlockchainsConfigPanels   {
  @JsonProperty("addresses")
  private Boolean addresses = null;

  @JsonProperty("blocks")
  private Boolean blocks = null;

  @JsonProperty("contracts")
  private Boolean contracts = null;

  @JsonProperty("events")
  private Boolean events = null;

  @JsonProperty("nodes")
  private Boolean nodes = null;

  @JsonProperty("transactions")
  private Boolean transactions = null;

  @JsonProperty("uncles")
  private Boolean uncles = null;

  public BlockchainsConfigPanels addresses(Boolean addresses) {
    this.addresses = addresses;
    return this;
  }

  /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isAddresses() {
    return addresses;
  }

  public void setAddresses(Boolean addresses) {
    this.addresses = addresses;
  }

  public BlockchainsConfigPanels blocks(Boolean blocks) {
    this.blocks = blocks;
    return this;
  }

  /**
   * Get blocks
   * @return blocks
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isBlocks() {
    return blocks;
  }

  public void setBlocks(Boolean blocks) {
    this.blocks = blocks;
  }

  public BlockchainsConfigPanels contracts(Boolean contracts) {
    this.contracts = contracts;
    return this;
  }

  /**
   * Get contracts
   * @return contracts
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isContracts() {
    return contracts;
  }

  public void setContracts(Boolean contracts) {
    this.contracts = contracts;
  }

  public BlockchainsConfigPanels events(Boolean events) {
    this.events = events;
    return this;
  }

  /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isEvents() {
    return events;
  }

  public void setEvents(Boolean events) {
    this.events = events;
  }

  public BlockchainsConfigPanels nodes(Boolean nodes) {
    this.nodes = nodes;
    return this;
  }

  /**
   * Get nodes
   * @return nodes
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isNodes() {
    return nodes;
  }

  public void setNodes(Boolean nodes) {
    this.nodes = nodes;
  }

  public BlockchainsConfigPanels transactions(Boolean transactions) {
    this.transactions = transactions;
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isTransactions() {
    return transactions;
  }

  public void setTransactions(Boolean transactions) {
    this.transactions = transactions;
  }

  public BlockchainsConfigPanels uncles(Boolean uncles) {
    this.uncles = uncles;
    return this;
  }

  /**
   * Get uncles
   * @return uncles
  **/
  @ApiModelProperty(example = "false", value = "")


  public Boolean isUncles() {
    return uncles;
  }

  public void setUncles(Boolean uncles) {
    this.uncles = uncles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockchainsConfigPanels blockchainsConfigPanels = (BlockchainsConfigPanels) o;
    return Objects.equals(this.addresses, blockchainsConfigPanels.addresses) &&
        Objects.equals(this.blocks, blockchainsConfigPanels.blocks) &&
        Objects.equals(this.contracts, blockchainsConfigPanels.contracts) &&
        Objects.equals(this.events, blockchainsConfigPanels.events) &&
        Objects.equals(this.nodes, blockchainsConfigPanels.nodes) &&
        Objects.equals(this.transactions, blockchainsConfigPanels.transactions) &&
        Objects.equals(this.uncles, blockchainsConfigPanels.uncles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, blocks, contracts, events, nodes, transactions, uncles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockchainsConfigPanels {\n");
    
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    blocks: ").append(toIndentedString(blocks)).append("\n");
    sb.append("    contracts: ").append(toIndentedString(contracts)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    uncles: ").append(toIndentedString(uncles)).append("\n");
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

