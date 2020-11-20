/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.0.12 reported-davon
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span.model;

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
import java.util.ArrayList;
import java.util.List;

/**
 * FirmwareUsageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-20T10:26:47.664Z[GMT]")
public class FirmwareUsageResponse {
  public static final String SERIALIZED_NAME_IMAGE_ID = "imageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_TARGETED = "targeted";
  @SerializedName(SERIALIZED_NAME_TARGETED)
  private List<String> targeted = null;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private List<String> current = null;


  public FirmwareUsageResponse imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public FirmwareUsageResponse targeted(List<String> targeted) {
    
    this.targeted = targeted;
    return this;
  }

  public FirmwareUsageResponse addTargetedItem(String targetedItem) {
    if (this.targeted == null) {
      this.targeted = new ArrayList<>();
    }
    this.targeted.add(targetedItem);
    return this;
  }

   /**
   * Get targeted
   * @return targeted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTargeted() {
    return targeted;
  }


  public void setTargeted(List<String> targeted) {
    this.targeted = targeted;
  }


  public FirmwareUsageResponse current(List<String> current) {
    
    this.current = current;
    return this;
  }

  public FirmwareUsageResponse addCurrentItem(String currentItem) {
    if (this.current == null) {
      this.current = new ArrayList<>();
    }
    this.current.add(currentItem);
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCurrent() {
    return current;
  }


  public void setCurrent(List<String> current) {
    this.current = current;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareUsageResponse firmwareUsageResponse = (FirmwareUsageResponse) o;
    return Objects.equals(this.imageId, firmwareUsageResponse.imageId) &&
        Objects.equals(this.targeted, firmwareUsageResponse.targeted) &&
        Objects.equals(this.current, firmwareUsageResponse.current);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, targeted, current);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareUsageResponse {\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    targeted: ").append(toIndentedString(targeted)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
