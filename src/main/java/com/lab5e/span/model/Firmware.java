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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Firmware images aren&#39;t served back out through the API, only the metadata.
 */
@ApiModel(description = "Firmware images aren't served back out through the API, only the metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-03T14:07:27.227Z[GMT]")
public class Firmware {
  public static final String SERIALIZED_NAME_IMAGE_ID = "imageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_SHA256 = "sha256";
  @SerializedName(SERIALIZED_NAME_SHA256)
  private String sha256;

  public static final String SERIALIZED_NAME_LENGTH = "length";
  @SerializedName(SERIALIZED_NAME_LENGTH)
  private Integer length;

  public static final String SERIALIZED_NAME_COLLECTION_ID = "collectionId";
  @SerializedName(SERIALIZED_NAME_COLLECTION_ID)
  private String collectionId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Map<String, String> tags = null;


  public Firmware imageId(String imageId) {
    
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


  public Firmware version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Make sure that the firmware image reports this version. If the version reported by this image is different the FOTA process won&#39;t be reported as successful since the device will report a version different from this.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Make sure that the firmware image reports this version. If the version reported by this image is different the FOTA process won't be reported as successful since the device will report a version different from this.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public Firmware filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * This is just for internal house keeping, making it potentially easier to identify the firmware image.
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This is just for internal house keeping, making it potentially easier to identify the firmware image.")

  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public Firmware sha256(String sha256) {
    
    this.sha256 = sha256;
    return this;
  }

   /**
   * To ensure each image is unique the SHA-256 hash for all images in a collection must be unqique
   * @return sha256
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To ensure each image is unique the SHA-256 hash for all images in a collection must be unqique")

  public String getSha256() {
    return sha256;
  }


  public void setSha256(String sha256) {
    this.sha256 = sha256;
  }


  public Firmware length(Integer length) {
    
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLength() {
    return length;
  }


  public void setLength(Integer length) {
    this.length = length;
  }


  public Firmware collectionId(String collectionId) {
    
    this.collectionId = collectionId;
    return this;
  }

   /**
   * Collection ID for the collection owning the firmware image.
   * @return collectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Collection ID for the collection owning the firmware image.")

  public String getCollectionId() {
    return collectionId;
  }


  public void setCollectionId(String collectionId) {
    this.collectionId = collectionId;
  }


  public Firmware created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public Firmware tags(Map<String, String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Firmware putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Tags for firmware image.
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tags for firmware image.")

  public Map<String, String> getTags() {
    return tags;
  }


  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Firmware firmware = (Firmware) o;
    return Objects.equals(this.imageId, firmware.imageId) &&
        Objects.equals(this.version, firmware.version) &&
        Objects.equals(this.filename, firmware.filename) &&
        Objects.equals(this.sha256, firmware.sha256) &&
        Objects.equals(this.length, firmware.length) &&
        Objects.equals(this.collectionId, firmware.collectionId) &&
        Objects.equals(this.created, firmware.created) &&
        Objects.equals(this.tags, firmware.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, version, filename, sha256, length, collectionId, created, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Firmware {\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    collectionId: ").append(toIndentedString(collectionId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

