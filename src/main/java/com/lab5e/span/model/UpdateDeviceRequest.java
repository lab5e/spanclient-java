/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.1.3 factual-kahlil
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
import com.lab5e.span.model.FirmwareMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdateDeviceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-03T14:07:27.227Z[GMT]")
public class UpdateDeviceRequest {
  public static final String SERIALIZED_NAME_EXISTING_COLLECTION_ID = "existingCollectionId";
  @SerializedName(SERIALIZED_NAME_EXISTING_COLLECTION_ID)
  private String existingCollectionId;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_IMSI = "imsi";
  @SerializedName(SERIALIZED_NAME_IMSI)
  private String imsi;

  public static final String SERIALIZED_NAME_IMEI = "imei";
  @SerializedName(SERIALIZED_NAME_IMEI)
  private String imei;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;

  public static final String SERIALIZED_NAME_FIRMWARE = "firmware";
  @SerializedName(SERIALIZED_NAME_FIRMWARE)
  private FirmwareMetadata firmware;


  public UpdateDeviceRequest existingCollectionId(String existingCollectionId) {
    
    this.existingCollectionId = existingCollectionId;
    return this;
  }

   /**
   * Get existingCollectionId
   * @return existingCollectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExistingCollectionId() {
    return existingCollectionId;
  }


  public void setExistingCollectionId(String existingCollectionId) {
    this.existingCollectionId = existingCollectionId;
  }


  public UpdateDeviceRequest deviceId(String deviceId) {
    
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeviceId() {
    return deviceId;
  }


  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  public UpdateDeviceRequest collectionId(String collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * The collection id for the device. This field is optional and can be omitted if the collection id isn&#39;t changed. When changing to a new collection you must be an owner of the other collection, ie an administrator of the team that owns the new collection.
   * @return collectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The collection id for the device. This field is optional and can be omitted if the collection id isn't changed. When changing to a new collection you must be an owner of the other collection, ie an administrator of the team that owns the new collection.")

  public String getCollectionId() {
    return collectionId;
  }


  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }


  public UpdateDeviceRequest imsi(String imsi) {
    
    this.imsi = imsi;
    return this;
  }

   /**
   * The IMSI is the unique ID for the (e|nu|whatever)SIM card on your device. This is the primary identifier for your device on the network.
   * @return imsi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IMSI is the unique ID for the (e|nu|whatever)SIM card on your device. This is the primary identifier for your device on the network.")

  public String getImsi() {
    return imsi;
  }


  public void setImsi(String imsi) {
    this.imsi = imsi;
  }


  public UpdateDeviceRequest imei(String imei) {
    
    this.imei = imei;
    return this;
  }

   /**
   * The IMEI number is the unique ID for your hardware as seen by the network. Obviously you might have a completely different view on things.
   * @return imei
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The IMEI number is the unique ID for your hardware as seen by the network. Obviously you might have a completely different view on things.")

  public String getImei() {
    return imei;
  }


  public void setImei(String imei) {
    this.imei = imei;
  }


  public UpdateDeviceRequest tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public UpdateDeviceRequest putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Tags are metadata for the device that you can set. These are just strings.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags are metadata for the device that you can set. These are just strings.")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  public UpdateDeviceRequest firmware(FirmwareMetadata firmware) {
    
    this.firmware = firmware;
    return this;
  }

   /**
   * Get firmware
   * @return firmware
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FirmwareMetadata getFirmware() {
    return firmware;
  }


  public void setFirmware(FirmwareMetadata firmware) {
    this.firmware = firmware;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeviceRequest updateDeviceRequest = (UpdateDeviceRequest) o;
    return Objects.equals(this.existingCollectionId, updateDeviceRequest.existingCollectionId) &&
        Objects.equals(this.deviceId, updateDeviceRequest.deviceId) &&
        Objects.equals(this.collectionId, updateDeviceRequest.collectionId) &&
        Objects.equals(this.imsi, updateDeviceRequest.imsi) &&
        Objects.equals(this.imei, updateDeviceRequest.imei) &&
        Objects.equals(this.tags, updateDeviceRequest.tags) &&
        Objects.equals(this.firmware, updateDeviceRequest.firmware);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingCollectionId, deviceId, collectionId, imsi, imei, tags, firmware);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeviceRequest {\n");
    sb.append("    existingCollectionId: ").append(toIndentedString(existingCollectionId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
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

