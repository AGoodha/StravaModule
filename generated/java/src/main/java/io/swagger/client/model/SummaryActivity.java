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
import io.swagger.client.model.ActivityType;
import io.swagger.client.model.LatLng;
import io.swagger.client.model.MetaActivity;
import io.swagger.client.model.MetaAthlete;
import io.swagger.client.model.PolylineMap;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * SummaryActivity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-22T22:11:32.894352-06:00[America/Denver]")
public class SummaryActivity extends MetaActivity {
  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("upload_id")
  private Long uploadId = null;

  @SerializedName("athlete")
  private MetaAthlete athlete = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("distance")
  private Float distance = null;

  @SerializedName("moving_time")
  private Integer movingTime = null;

  @SerializedName("elapsed_time")
  private Integer elapsedTime = null;

  @SerializedName("total_elevation_gain")
  private Float totalElevationGain = null;

  @SerializedName("elev_high")
  private Float elevHigh = null;

  @SerializedName("elev_low")
  private Float elevLow = null;

  @SerializedName("type")
  private ActivityType type = null;

  @SerializedName("start_date")
  private OffsetDateTime startDate = null;

  @SerializedName("start_date_local")
  private OffsetDateTime startDateLocal = null;

  @SerializedName("timezone")
  private String timezone = null;

  @SerializedName("start_latlng")
  private LatLng startLatlng = null;

  @SerializedName("end_latlng")
  private LatLng endLatlng = null;

  @SerializedName("achievement_count")
  private Integer achievementCount = null;

  @SerializedName("kudos_count")
  private Integer kudosCount = null;

  @SerializedName("comment_count")
  private Integer commentCount = null;

  @SerializedName("athlete_count")
  private Integer athleteCount = null;

  @SerializedName("photo_count")
  private Integer photoCount = null;

  @SerializedName("total_photo_count")
  private Integer totalPhotoCount = null;

  @SerializedName("map")
  private PolylineMap map = null;

  @SerializedName("trainer")
  private Boolean trainer = null;

  @SerializedName("commute")
  private Boolean commute = null;

  @SerializedName("manual")
  private Boolean manual = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("flagged")
  private Boolean flagged = null;

  @SerializedName("workout_type")
  private Integer workoutType = null;

  @SerializedName("upload_id_str")
  private String uploadIdStr = null;

  @SerializedName("average_speed")
  private Float averageSpeed = null;

  @SerializedName("max_speed")
  private Float maxSpeed = null;

  @SerializedName("has_kudoed")
  private Boolean hasKudoed = null;

  @SerializedName("gear_id")
  private String gearId = null;

  @SerializedName("kilojoules")
  private Float kilojoules = null;

  @SerializedName("average_watts")
  private Float averageWatts = null;

  @SerializedName("device_watts")
  private Boolean deviceWatts = null;

  @SerializedName("max_watts")
  private Integer maxWatts = null;

  @SerializedName("weighted_average_watts")
  private Integer weightedAverageWatts = null;

  public SummaryActivity externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The identifier provided at upload time
   * @return externalId
  **/
  @Schema(description = "The identifier provided at upload time")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public SummaryActivity uploadId(Long uploadId) {
    this.uploadId = uploadId;
    return this;
  }

   /**
   * The identifier of the upload that resulted in this activity
   * @return uploadId
  **/
  @Schema(description = "The identifier of the upload that resulted in this activity")
  public Long getUploadId() {
    return uploadId;
  }

  public void setUploadId(Long uploadId) {
    this.uploadId = uploadId;
  }

  public SummaryActivity athlete(MetaAthlete athlete) {
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

  public SummaryActivity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the activity
   * @return name
  **/
  @Schema(description = "The name of the activity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SummaryActivity distance(Float distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The activity&#x27;s distance, in meters
   * @return distance
  **/
  @Schema(description = "The activity's distance, in meters")
  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public SummaryActivity movingTime(Integer movingTime) {
    this.movingTime = movingTime;
    return this;
  }

   /**
   * The activity&#x27;s moving time, in seconds
   * @return movingTime
  **/
  @Schema(description = "The activity's moving time, in seconds")
  public Integer getMovingTime() {
    return movingTime;
  }

  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }

  public SummaryActivity elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The activity&#x27;s elapsed time, in seconds
   * @return elapsedTime
  **/
  @Schema(description = "The activity's elapsed time, in seconds")
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public SummaryActivity totalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
    return this;
  }

   /**
   * The activity&#x27;s total elevation gain.
   * @return totalElevationGain
  **/
  @Schema(description = "The activity's total elevation gain.")
  public Float getTotalElevationGain() {
    return totalElevationGain;
  }

  public void setTotalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
  }

  public SummaryActivity elevHigh(Float elevHigh) {
    this.elevHigh = elevHigh;
    return this;
  }

   /**
   * The activity&#x27;s highest elevation, in meters
   * @return elevHigh
  **/
  @Schema(description = "The activity's highest elevation, in meters")
  public Float getElevHigh() {
    return elevHigh;
  }

  public void setElevHigh(Float elevHigh) {
    this.elevHigh = elevHigh;
  }

  public SummaryActivity elevLow(Float elevLow) {
    this.elevLow = elevLow;
    return this;
  }

   /**
   * The activity&#x27;s lowest elevation, in meters
   * @return elevLow
  **/
  @Schema(description = "The activity's lowest elevation, in meters")
  public Float getElevLow() {
    return elevLow;
  }

  public void setElevLow(Float elevLow) {
    this.elevLow = elevLow;
  }

  public SummaryActivity type(ActivityType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public ActivityType getType() {
    return type;
  }

  public void setType(ActivityType type) {
    this.type = type;
  }

  public SummaryActivity startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The time at which the activity was started.
   * @return startDate
  **/
  @Schema(description = "The time at which the activity was started.")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public SummaryActivity startDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
    return this;
  }

   /**
   * The time at which the activity was started in the local timezone.
   * @return startDateLocal
  **/
  @Schema(description = "The time at which the activity was started in the local timezone.")
  public OffsetDateTime getStartDateLocal() {
    return startDateLocal;
  }

  public void setStartDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
  }

  public SummaryActivity timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone of the activity
   * @return timezone
  **/
  @Schema(description = "The timezone of the activity")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public SummaryActivity startLatlng(LatLng startLatlng) {
    this.startLatlng = startLatlng;
    return this;
  }

   /**
   * Get startLatlng
   * @return startLatlng
  **/
  @Schema(description = "")
  public LatLng getStartLatlng() {
    return startLatlng;
  }

  public void setStartLatlng(LatLng startLatlng) {
    this.startLatlng = startLatlng;
  }

  public SummaryActivity endLatlng(LatLng endLatlng) {
    this.endLatlng = endLatlng;
    return this;
  }

   /**
   * Get endLatlng
   * @return endLatlng
  **/
  @Schema(description = "")
  public LatLng getEndLatlng() {
    return endLatlng;
  }

  public void setEndLatlng(LatLng endLatlng) {
    this.endLatlng = endLatlng;
  }

  public SummaryActivity achievementCount(Integer achievementCount) {
    this.achievementCount = achievementCount;
    return this;
  }

   /**
   * The number of achievements gained during this activity
   * @return achievementCount
  **/
  @Schema(description = "The number of achievements gained during this activity")
  public Integer getAchievementCount() {
    return achievementCount;
  }

  public void setAchievementCount(Integer achievementCount) {
    this.achievementCount = achievementCount;
  }

  public SummaryActivity kudosCount(Integer kudosCount) {
    this.kudosCount = kudosCount;
    return this;
  }

   /**
   * The number of kudos given for this activity
   * @return kudosCount
  **/
  @Schema(description = "The number of kudos given for this activity")
  public Integer getKudosCount() {
    return kudosCount;
  }

  public void setKudosCount(Integer kudosCount) {
    this.kudosCount = kudosCount;
  }

  public SummaryActivity commentCount(Integer commentCount) {
    this.commentCount = commentCount;
    return this;
  }

   /**
   * The number of comments for this activity
   * @return commentCount
  **/
  @Schema(description = "The number of comments for this activity")
  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }

  public SummaryActivity athleteCount(Integer athleteCount) {
    this.athleteCount = athleteCount;
    return this;
  }

   /**
   * The number of athletes for taking part in a group activity
   * minimum: 1
   * @return athleteCount
  **/
  @Schema(description = "The number of athletes for taking part in a group activity")
  public Integer getAthleteCount() {
    return athleteCount;
  }

  public void setAthleteCount(Integer athleteCount) {
    this.athleteCount = athleteCount;
  }

  public SummaryActivity photoCount(Integer photoCount) {
    this.photoCount = photoCount;
    return this;
  }

   /**
   * The number of Instagram photos for this activity
   * @return photoCount
  **/
  @Schema(description = "The number of Instagram photos for this activity")
  public Integer getPhotoCount() {
    return photoCount;
  }

  public void setPhotoCount(Integer photoCount) {
    this.photoCount = photoCount;
  }

  public SummaryActivity totalPhotoCount(Integer totalPhotoCount) {
    this.totalPhotoCount = totalPhotoCount;
    return this;
  }

   /**
   * The number of Instagram and Strava photos for this activity
   * @return totalPhotoCount
  **/
  @Schema(description = "The number of Instagram and Strava photos for this activity")
  public Integer getTotalPhotoCount() {
    return totalPhotoCount;
  }

  public void setTotalPhotoCount(Integer totalPhotoCount) {
    this.totalPhotoCount = totalPhotoCount;
  }

  public SummaryActivity map(PolylineMap map) {
    this.map = map;
    return this;
  }

   /**
   * Get map
   * @return map
  **/
  @Schema(description = "")
  public PolylineMap getMap() {
    return map;
  }

  public void setMap(PolylineMap map) {
    this.map = map;
  }

  public SummaryActivity trainer(Boolean trainer) {
    this.trainer = trainer;
    return this;
  }

   /**
   * Whether this activity was recorded on a training machine
   * @return trainer
  **/
  @Schema(description = "Whether this activity was recorded on a training machine")
  public Boolean isTrainer() {
    return trainer;
  }

  public void setTrainer(Boolean trainer) {
    this.trainer = trainer;
  }

  public SummaryActivity commute(Boolean commute) {
    this.commute = commute;
    return this;
  }

   /**
   * Whether this activity is a commute
   * @return commute
  **/
  @Schema(description = "Whether this activity is a commute")
  public Boolean isCommute() {
    return commute;
  }

  public void setCommute(Boolean commute) {
    this.commute = commute;
  }

  public SummaryActivity manual(Boolean manual) {
    this.manual = manual;
    return this;
  }

   /**
   * Whether this activity was created manually
   * @return manual
  **/
  @Schema(description = "Whether this activity was created manually")
  public Boolean isManual() {
    return manual;
  }

  public void setManual(Boolean manual) {
    this.manual = manual;
  }

  public SummaryActivity _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Whether this activity is private
   * @return _private
  **/
  @Schema(description = "Whether this activity is private")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public SummaryActivity flagged(Boolean flagged) {
    this.flagged = flagged;
    return this;
  }

   /**
   * Whether this activity is flagged
   * @return flagged
  **/
  @Schema(description = "Whether this activity is flagged")
  public Boolean isFlagged() {
    return flagged;
  }

  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }

  public SummaryActivity workoutType(Integer workoutType) {
    this.workoutType = workoutType;
    return this;
  }

   /**
   * The activity&#x27;s workout type
   * @return workoutType
  **/
  @Schema(description = "The activity's workout type")
  public Integer getWorkoutType() {
    return workoutType;
  }

  public void setWorkoutType(Integer workoutType) {
    this.workoutType = workoutType;
  }

  public SummaryActivity uploadIdStr(String uploadIdStr) {
    this.uploadIdStr = uploadIdStr;
    return this;
  }

   /**
   * The unique identifier of the upload in string format
   * @return uploadIdStr
  **/
  @Schema(description = "The unique identifier of the upload in string format")
  public String getUploadIdStr() {
    return uploadIdStr;
  }

  public void setUploadIdStr(String uploadIdStr) {
    this.uploadIdStr = uploadIdStr;
  }

  public SummaryActivity averageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
    return this;
  }

   /**
   * The activity&#x27;s average speed, in meters per second
   * @return averageSpeed
  **/
  @Schema(description = "The activity's average speed, in meters per second")
  public Float getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public SummaryActivity maxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

   /**
   * The activity&#x27;s max speed, in meters per second
   * @return maxSpeed
  **/
  @Schema(description = "The activity's max speed, in meters per second")
  public Float getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public SummaryActivity hasKudoed(Boolean hasKudoed) {
    this.hasKudoed = hasKudoed;
    return this;
  }

   /**
   * Whether the logged-in athlete has kudoed this activity
   * @return hasKudoed
  **/
  @Schema(description = "Whether the logged-in athlete has kudoed this activity")
  public Boolean isHasKudoed() {
    return hasKudoed;
  }

  public void setHasKudoed(Boolean hasKudoed) {
    this.hasKudoed = hasKudoed;
  }

  public SummaryActivity gearId(String gearId) {
    this.gearId = gearId;
    return this;
  }

   /**
   * The id of the gear for the activity
   * @return gearId
  **/
  @Schema(description = "The id of the gear for the activity")
  public String getGearId() {
    return gearId;
  }

  public void setGearId(String gearId) {
    this.gearId = gearId;
  }

  public SummaryActivity kilojoules(Float kilojoules) {
    this.kilojoules = kilojoules;
    return this;
  }

   /**
   * The total work done in kilojoules during this activity. Rides only
   * @return kilojoules
  **/
  @Schema(description = "The total work done in kilojoules during this activity. Rides only")
  public Float getKilojoules() {
    return kilojoules;
  }

  public void setKilojoules(Float kilojoules) {
    this.kilojoules = kilojoules;
  }

  public SummaryActivity averageWatts(Float averageWatts) {
    this.averageWatts = averageWatts;
    return this;
  }

   /**
   * Average power output in watts during this activity. Rides only
   * @return averageWatts
  **/
  @Schema(description = "Average power output in watts during this activity. Rides only")
  public Float getAverageWatts() {
    return averageWatts;
  }

  public void setAverageWatts(Float averageWatts) {
    this.averageWatts = averageWatts;
  }

  public SummaryActivity deviceWatts(Boolean deviceWatts) {
    this.deviceWatts = deviceWatts;
    return this;
  }

   /**
   * Whether the watts are from a power meter, false if estimated
   * @return deviceWatts
  **/
  @Schema(description = "Whether the watts are from a power meter, false if estimated")
  public Boolean isDeviceWatts() {
    return deviceWatts;
  }

  public void setDeviceWatts(Boolean deviceWatts) {
    this.deviceWatts = deviceWatts;
  }

  public SummaryActivity maxWatts(Integer maxWatts) {
    this.maxWatts = maxWatts;
    return this;
  }

   /**
   * Rides with power meter data only
   * @return maxWatts
  **/
  @Schema(description = "Rides with power meter data only")
  public Integer getMaxWatts() {
    return maxWatts;
  }

  public void setMaxWatts(Integer maxWatts) {
    this.maxWatts = maxWatts;
  }

  public SummaryActivity weightedAverageWatts(Integer weightedAverageWatts) {
    this.weightedAverageWatts = weightedAverageWatts;
    return this;
  }

   /**
   * Similar to Normalized Power. Rides with power meter data only
   * @return weightedAverageWatts
  **/
  @Schema(description = "Similar to Normalized Power. Rides with power meter data only")
  public Integer getWeightedAverageWatts() {
    return weightedAverageWatts;
  }

  public void setWeightedAverageWatts(Integer weightedAverageWatts) {
    this.weightedAverageWatts = weightedAverageWatts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryActivity summaryActivity = (SummaryActivity) o;
    return Objects.equals(this.externalId, summaryActivity.externalId) &&
        Objects.equals(this.uploadId, summaryActivity.uploadId) &&
        Objects.equals(this.athlete, summaryActivity.athlete) &&
        Objects.equals(this.name, summaryActivity.name) &&
        Objects.equals(this.distance, summaryActivity.distance) &&
        Objects.equals(this.movingTime, summaryActivity.movingTime) &&
        Objects.equals(this.elapsedTime, summaryActivity.elapsedTime) &&
        Objects.equals(this.totalElevationGain, summaryActivity.totalElevationGain) &&
        Objects.equals(this.elevHigh, summaryActivity.elevHigh) &&
        Objects.equals(this.elevLow, summaryActivity.elevLow) &&
        Objects.equals(this.type, summaryActivity.type) &&
        Objects.equals(this.startDate, summaryActivity.startDate) &&
        Objects.equals(this.startDateLocal, summaryActivity.startDateLocal) &&
        Objects.equals(this.timezone, summaryActivity.timezone) &&
        Objects.equals(this.startLatlng, summaryActivity.startLatlng) &&
        Objects.equals(this.endLatlng, summaryActivity.endLatlng) &&
        Objects.equals(this.achievementCount, summaryActivity.achievementCount) &&
        Objects.equals(this.kudosCount, summaryActivity.kudosCount) &&
        Objects.equals(this.commentCount, summaryActivity.commentCount) &&
        Objects.equals(this.athleteCount, summaryActivity.athleteCount) &&
        Objects.equals(this.photoCount, summaryActivity.photoCount) &&
        Objects.equals(this.totalPhotoCount, summaryActivity.totalPhotoCount) &&
        Objects.equals(this.map, summaryActivity.map) &&
        Objects.equals(this.trainer, summaryActivity.trainer) &&
        Objects.equals(this.commute, summaryActivity.commute) &&
        Objects.equals(this.manual, summaryActivity.manual) &&
        Objects.equals(this._private, summaryActivity._private) &&
        Objects.equals(this.flagged, summaryActivity.flagged) &&
        Objects.equals(this.workoutType, summaryActivity.workoutType) &&
        Objects.equals(this.uploadIdStr, summaryActivity.uploadIdStr) &&
        Objects.equals(this.averageSpeed, summaryActivity.averageSpeed) &&
        Objects.equals(this.maxSpeed, summaryActivity.maxSpeed) &&
        Objects.equals(this.hasKudoed, summaryActivity.hasKudoed) &&
        Objects.equals(this.gearId, summaryActivity.gearId) &&
        Objects.equals(this.kilojoules, summaryActivity.kilojoules) &&
        Objects.equals(this.averageWatts, summaryActivity.averageWatts) &&
        Objects.equals(this.deviceWatts, summaryActivity.deviceWatts) &&
        Objects.equals(this.maxWatts, summaryActivity.maxWatts) &&
        Objects.equals(this.weightedAverageWatts, summaryActivity.weightedAverageWatts) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, uploadId, athlete, name, distance, movingTime, elapsedTime, totalElevationGain, elevHigh, elevLow, type, startDate, startDateLocal, timezone, startLatlng, endLatlng, achievementCount, kudosCount, commentCount, athleteCount, photoCount, totalPhotoCount, map, trainer, commute, manual, _private, flagged, workoutType, uploadIdStr, averageSpeed, maxSpeed, hasKudoed, gearId, kilojoules, averageWatts, deviceWatts, maxWatts, weightedAverageWatts, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryActivity {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    totalElevationGain: ").append(toIndentedString(totalElevationGain)).append("\n");
    sb.append("    elevHigh: ").append(toIndentedString(elevHigh)).append("\n");
    sb.append("    elevLow: ").append(toIndentedString(elevLow)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startLatlng: ").append(toIndentedString(startLatlng)).append("\n");
    sb.append("    endLatlng: ").append(toIndentedString(endLatlng)).append("\n");
    sb.append("    achievementCount: ").append(toIndentedString(achievementCount)).append("\n");
    sb.append("    kudosCount: ").append(toIndentedString(kudosCount)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    athleteCount: ").append(toIndentedString(athleteCount)).append("\n");
    sb.append("    photoCount: ").append(toIndentedString(photoCount)).append("\n");
    sb.append("    totalPhotoCount: ").append(toIndentedString(totalPhotoCount)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    trainer: ").append(toIndentedString(trainer)).append("\n");
    sb.append("    commute: ").append(toIndentedString(commute)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    workoutType: ").append(toIndentedString(workoutType)).append("\n");
    sb.append("    uploadIdStr: ").append(toIndentedString(uploadIdStr)).append("\n");
    sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    hasKudoed: ").append(toIndentedString(hasKudoed)).append("\n");
    sb.append("    gearId: ").append(toIndentedString(gearId)).append("\n");
    sb.append("    kilojoules: ").append(toIndentedString(kilojoules)).append("\n");
    sb.append("    averageWatts: ").append(toIndentedString(averageWatts)).append("\n");
    sb.append("    deviceWatts: ").append(toIndentedString(deviceWatts)).append("\n");
    sb.append("    maxWatts: ").append(toIndentedString(maxWatts)).append("\n");
    sb.append("    weightedAverageWatts: ").append(toIndentedString(weightedAverageWatts)).append("\n");
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
