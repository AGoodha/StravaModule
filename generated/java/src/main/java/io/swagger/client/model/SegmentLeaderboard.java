/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.SegmentLeaderboardEntry;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * A
 */
@Schema(description = "A")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-22T22:11:32.894352-06:00[America/Denver]")
public class SegmentLeaderboard {
  @SerializedName("entry_count")
  private Integer entryCount = null;

  @SerializedName("effort_count")
  private Integer effortCount = null;

  /**
   * Gets or Sets komType
   */
  @JsonAdapter(KomTypeEnum.Adapter.class)
  public enum KomTypeEnum {
    KOM("kom"),
    CR("cr");

    private String value;

    KomTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static KomTypeEnum fromValue(String text) {
      for (KomTypeEnum b : KomTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<KomTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KomTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KomTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KomTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("kom_type")
  private KomTypeEnum komType = null;

  @SerializedName("entries")
  private List<SegmentLeaderboardEntry> entries = null;

  public SegmentLeaderboard entryCount(Integer entryCount) {
    this.entryCount = entryCount;
    return this;
  }

   /**
   * The total number of entries for this leaderboard
   * @return entryCount
  **/
  @Schema(example = "1993", description = "The total number of entries for this leaderboard")
  public Integer getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(Integer entryCount) {
    this.entryCount = entryCount;
  }

  public SegmentLeaderboard effortCount(Integer effortCount) {
    this.effortCount = effortCount;
    return this;
  }

   /**
   * Deprecated, use entry_count
   * @return effortCount
  **/
  @Schema(example = "1993", description = "Deprecated, use entry_count")
  public Integer getEffortCount() {
    return effortCount;
  }

  public void setEffortCount(Integer effortCount) {
    this.effortCount = effortCount;
  }

  public SegmentLeaderboard komType(KomTypeEnum komType) {
    this.komType = komType;
    return this;
  }

   /**
   * Get komType
   * @return komType
  **/
  @Schema(description = "")
  public KomTypeEnum getKomType() {
    return komType;
  }

  public void setKomType(KomTypeEnum komType) {
    this.komType = komType;
  }

  public SegmentLeaderboard entries(List<SegmentLeaderboardEntry> entries) {
    this.entries = entries;
    return this;
  }

  public SegmentLeaderboard addEntriesItem(SegmentLeaderboardEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<SegmentLeaderboardEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @Schema(description = "")
  public List<SegmentLeaderboardEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<SegmentLeaderboardEntry> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentLeaderboard segmentLeaderboard = (SegmentLeaderboard) o;
    return Objects.equals(this.entryCount, segmentLeaderboard.entryCount) &&
        Objects.equals(this.effortCount, segmentLeaderboard.effortCount) &&
        Objects.equals(this.komType, segmentLeaderboard.komType) &&
        Objects.equals(this.entries, segmentLeaderboard.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryCount, effortCount, komType, entries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentLeaderboard {\n");
    
    sb.append("    entryCount: ").append(toIndentedString(entryCount)).append("\n");
    sb.append("    effortCount: ").append(toIndentedString(effortCount)).append("\n");
    sb.append("    komType: ").append(toIndentedString(komType)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
