/*
 * LocationIQ
 * LocationIQ provides flexible enterprise-grade location based solutions. We work with developers, startups and enterprises worldwide serving billions of requests everyday. This page provides an overview of the technical aspects of our API and will help you get started.
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.locationiq.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * DirectionsMatrixSources
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-21T10:08:21.449715+05:30[Asia/Kolkata]")
public class DirectionsMatrixSources {
  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private BigDecimal distance;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private List<BigDecimal> location = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public DirectionsMatrixSources distance(BigDecimal distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDistance() {
    return distance;
  }


  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }


  public DirectionsMatrixSources location(List<BigDecimal> location) {
    
    this.location = location;
    return this;
  }

  public DirectionsMatrixSources addLocationItem(BigDecimal locationItem) {
    if (this.location == null) {
      this.location = new ArrayList<BigDecimal>();
    }
    this.location.add(locationItem);
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BigDecimal> getLocation() {
    return location;
  }


  public void setLocation(List<BigDecimal> location) {
    this.location = location;
  }


  public DirectionsMatrixSources name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectionsMatrixSources directionsMatrixSources = (DirectionsMatrixSources) o;
    return Objects.equals(this.distance, directionsMatrixSources.distance) &&
        Objects.equals(this.location, directionsMatrixSources.location) &&
        Objects.equals(this.name, directionsMatrixSources.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, location, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectionsMatrixSources {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

