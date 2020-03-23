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
import io.swagger.client.model.MetaActivity;
import io.swagger.client.model.MetaAthlete;
import io.swagger.client.model.SummarySegment;
import io.swagger.client.model.SummarySegmentEffort;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * DetailedSegmentEffort
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-22T22:11:32.894352-06:00[America/Denver]")
public class DetailedSegmentEffort extends SummarySegmentEffort {
  @SerializedName("name")
  private String name = null;

  @SerializedName("activity")
  private MetaActivity activity = null;

  @SerializedName("athlete")
  private MetaAthlete athlete = null;

  @SerializedName("moving_time")
  private Integer movingTime = null;

  @SerializedName("start_index")
  private Integer startIndex = null;

  @SerializedName("end_index")
  private Integer endIndex = null;

  @SerializedName("average_cadence")
  private Float averageCadence = null;

  @SerializedName("average_watts")
  private Float averageWatts = null;

  @SerializedName("device_watts")
  private Boolean deviceWatts = null;

  @SerializedName("average_heartrate")
  private Float averageHeartrate = null;

  @SerializedName("max_heartrate")
  private Float maxHeartrate = null;

  @SerializedName("segment")
  private SummarySegment segment = null;

  @SerializedName("kom_rank")
  private Integer komRank = null;

  @SerializedName("pr_rank")
  private Integer prRank = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  public DetailedSegmentEffort name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the segment on which this effort was performed
   * @return name
  **/
  @Schema(description = "The name of the segment on which this effort was performed")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DetailedSegmentEffort activity(MetaActivity activity) {
    this.activity = activity;
    return this;
  }

   /**
   * Get activity
   * @return activity
  **/
  @Schema(description = "")
  public MetaActivity getActivity() {
    return activity;
  }

  public void setActivity(MetaActivity activity) {
    this.activity = activity;
  }

  public DetailedSegmentEffort athlete(MetaAthlete athlete) {
    this.athlete = athlete;
    return this;
  }

   /**
   * Get athlete
   * @return athlete
  **/
  @Schema(description = "")
  public MetaAthlete getAthlete() {
    return athlete;
  }

  public void setAthlete(MetaAthlete athlete) {
    this.athlete = athlete;
  }

  public DetailedSegmentEffort movingTime(Integer movingTime) {
    this.movingTime = movingTime;
    return this;
  }

   /**
   * The effort&#x27;s moving time
   * @return movingTime
  **/
  @Schema(description = "The effort's moving time")
  public Integer getMovingTime() {
    return movingTime;
  }

  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }

  public DetailedSegmentEffort startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * The start index of this effort in its activity&#x27;s stream
   * @return startIndex
  **/
  @Schema(description = "The start index of this effort in its activity's stream")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public DetailedSegmentEffort endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

   /**
   * The end index of this effort in its activity&#x27;s stream
   * @return endIndex
  **/
  @Schema(description = "The end index of this effort in its activity's stream")
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public DetailedSegmentEffort averageCadence(Float averageCadence) {
    this.averageCadence = averageCadence;
    return this;
  }

   /**
   * The effort&#x27;s average cadence
   * @return averageCadence
  **/
  @Schema(description = "The effort's average cadence")
  public Float getAverageCadence() {
    return averageCadence;
  }

  public void setAverageCadence(Float averageCadence) {
    this.averageCadence = averageCadence;
  }

  public DetailedSegmentEffort averageWatts(Float averageWatts) {
    this.averageWatts = averageWatts;
    return this;
  }

   /**
   * The average wattage of this effort
   * @return averageWatts
  **/
  @Schema(description = "The average wattage of this effort")
  public Float getAverageWatts() {
    return averageWatts;
  }

  public void setAverageWatts(Float averageWatts) {
    this.averageWatts = averageWatts;
  }

  public DetailedSegmentEffort deviceWatts(Boolean deviceWatts) {
    this.deviceWatts = deviceWatts;
    return this;
  }

   /**
   * For riding efforts, whether the wattage was reported by a dedicated recording device
   * @return deviceWatts
  **/
  @Schema(description = "For riding efforts, whether the wattage was reported by a dedicated recording device")
  public Boolean isDeviceWatts() {
    return deviceWatts;
  }

  public void setDeviceWatts(Boolean deviceWatts) {
    this.deviceWatts = deviceWatts;
  }

  public DetailedSegmentEffort averageHeartrate(Float averageHeartrate) {
    this.averageHeartrate = averageHeartrate;
    return this;
  }

   /**
   * The heart heart rate of the athlete during this effort
   * @return averageHeartrate
  **/
  @Schema(description = "The heart heart rate of the athlete during this effort")
  public Float getAverageHeartrate() {
    return averageHeartrate;
  }

  public void setAverageHeartrate(Float averageHeartrate) {
    this.averageHeartrate = averageHeartrate;
  }

  public DetailedSegmentEffort maxHeartrate(Float maxHeartrate) {
    this.maxHeartrate = maxHeartrate;
    return this;
  }

   /**
   * The maximum heart rate of the athlete during this effort
   * @return maxHeartrate
  **/
  @Schema(description = "The maximum heart rate of the athlete during this effort")
  public Float getMaxHeartrate() {
    return maxHeartrate;
  }

  public void setMaxHeartrate(Float maxHeartrate) {
    this.maxHeartrate = maxHeartrate;
  }

  public DetailedSegmentEffort segment(SummarySegment segment) {
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @Schema(description = "")
  public SummarySegment getSegment() {
    return segment;
  }

  public void setSegment(SummarySegment segment) {
    this.segment = segment;
  }

  public DetailedSegmentEffort komRank(Integer komRank) {
    this.komRank = komRank;
    return this;
  }

   /**
   * The rank of the effort on the global leaderboard if it belongs in the top 10 at the time of upload
   * minimum: 1
   * maximum: 10
   * @return komRank
  **/
  @Schema(description = "The rank of the effort on the global leaderboard if it belongs in the top 10 at the time of upload")
  public Integer getKomRank() {
    return komRank;
  }

  public void setKomRank(Integer komRank) {
    this.komRank = komRank;
  }

  public DetailedSegmentEffort prRank(Integer prRank) {
    this.prRank = prRank;
    return this;
  }

   /**
   * The rank of the effort on the athlete&#x27;s leaderboard if it belongs in the top 3 at the time of upload
   * minimum: 1
   * maximum: 3
   * @return prRank
  **/
  @Schema(description = "The rank of the effort on the athlete's leaderboard if it belongs in the top 3 at the time of upload")
  public Integer getPrRank() {
    return prRank;
  }

  public void setPrRank(Integer prRank) {
    this.prRank = prRank;
  }

  public DetailedSegmentEffort hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Whether this effort should be hidden when viewed within an activity
   * @return hidden
  **/
  @Schema(description = "Whether this effort should be hidden when viewed within an activity")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedSegmentEffort detailedSegmentEffort = (DetailedSegmentEffort) o;
    return Objects.equals(this.name, detailedSegmentEffort.name) &&
        Objects.equals(this.activity, detailedSegmentEffort.activity) &&
        Objects.equals(this.athlete, detailedSegmentEffort.athlete) &&
        Objects.equals(this.movingTime, detailedSegmentEffort.movingTime) &&
        Objects.equals(this.startIndex, detailedSegmentEffort.startIndex) &&
        Objects.equals(this.endIndex, detailedSegmentEffort.endIndex) &&
        Objects.equals(this.averageCadence, detailedSegmentEffort.averageCadence) &&
        Objects.equals(this.averageWatts, detailedSegmentEffort.averageWatts) &&
        Objects.equals(this.deviceWatts, detailedSegmentEffort.deviceWatts) &&
        Objects.equals(this.averageHeartrate, detailedSegmentEffort.averageHeartrate) &&
        Objects.equals(this.maxHeartrate, detailedSegmentEffort.maxHeartrate) &&
        Objects.equals(this.segment, detailedSegmentEffort.segment) &&
        Objects.equals(this.komRank, detailedSegmentEffort.komRank) &&
        Objects.equals(this.prRank, detailedSegmentEffort.prRank) &&
        Objects.equals(this.hidden, detailedSegmentEffort.hidden) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, activity, athlete, movingTime, startIndex, endIndex, averageCadence, averageWatts, deviceWatts, averageHeartrate, maxHeartrate, segment, komRank, prRank, hidden, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSegmentEffort {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    averageCadence: ").append(toIndentedString(averageCadence)).append("\n");
    sb.append("    averageWatts: ").append(toIndentedString(averageWatts)).append("\n");
    sb.append("    deviceWatts: ").append(toIndentedString(deviceWatts)).append("\n");
    sb.append("    averageHeartrate: ").append(toIndentedString(averageHeartrate)).append("\n");
    sb.append("    maxHeartrate: ").append(toIndentedString(maxHeartrate)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    komRank: ").append(toIndentedString(komRank)).append("\n");
    sb.append("    prRank: ").append(toIndentedString(prRank)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
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
