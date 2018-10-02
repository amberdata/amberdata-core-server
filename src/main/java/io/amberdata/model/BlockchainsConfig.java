package io.amberdata.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.amberdata.model.BlockchainsConfigPanels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BlockchainsConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-08T19:03:46.332-05:00")

public class BlockchainsConfig   {
  @JsonProperty("panels")
  private BlockchainsConfigPanels panels = null;

  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("website")
  private String website = null;

  public BlockchainsConfig panels(BlockchainsConfigPanels panels) {
    this.panels = panels;
    return this;
  }

  /**
   * Get panels
   * @return panels
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BlockchainsConfigPanels getPanels() {
    return panels;
  }

  public void setPanels(BlockchainsConfigPanels panels) {
    this.panels = panels;
  }

  public BlockchainsConfig icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(example = "https://url.website.com/for/your/svg/or/png/icon.png", value = "")


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public BlockchainsConfig color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(example = "#003366", value = "")


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public BlockchainsConfig website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(example = "https://url.website.com/", value = "")


  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockchainsConfig blockchainsConfig = (BlockchainsConfig) o;
    return Objects.equals(this.panels, blockchainsConfig.panels) &&
        Objects.equals(this.icon, blockchainsConfig.icon) &&
        Objects.equals(this.color, blockchainsConfig.color) &&
        Objects.equals(this.website, blockchainsConfig.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(panels, icon, color, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockchainsConfig {\n");
    
    sb.append("    panels: ").append(toIndentedString(panels)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

