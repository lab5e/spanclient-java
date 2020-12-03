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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OutputDataMessageOutputMessageType
 */
@JsonAdapter(OutputDataMessageOutputMessageType.Adapter.class)
public enum OutputDataMessageOutputMessageType {
  
  UNKNOWN("unknown"),
  
  KEEPALIVE("keepalive"),
  
  DATA("data");

  private String value;

  OutputDataMessageOutputMessageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OutputDataMessageOutputMessageType fromValue(String value) {
    for (OutputDataMessageOutputMessageType b : OutputDataMessageOutputMessageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OutputDataMessageOutputMessageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final OutputDataMessageOutputMessageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OutputDataMessageOutputMessageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OutputDataMessageOutputMessageType.fromValue(value);
    }
  }
}

