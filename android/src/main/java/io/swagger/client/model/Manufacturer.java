/**
 * Simple Inventory API
 * This is a simple API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: you@your-company.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Manufacturer {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("homePage")
  private String homePage = null;
  @SerializedName("phone")
  private String phone = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getHomePage() {
    return homePage;
  }
  public void setHomePage(String homePage) {
    this.homePage = homePage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manufacturer manufacturer = (Manufacturer) o;
    return (this.name == null ? manufacturer.name == null : this.name.equals(manufacturer.name)) &&
        (this.homePage == null ? manufacturer.homePage == null : this.homePage.equals(manufacturer.homePage)) &&
        (this.phone == null ? manufacturer.phone == null : this.phone.equals(manufacturer.phone));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.homePage == null ? 0: this.homePage.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manufacturer {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  homePage: ").append(homePage).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}