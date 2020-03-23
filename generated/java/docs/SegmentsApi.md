# SegmentsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exploreSegments**](SegmentsApi.md#exploreSegments) | **GET** /segments/explore | Explore segments
[**getLeaderboardBySegmentId**](SegmentsApi.md#getLeaderboardBySegmentId) | **GET** /segments/{id}/leaderboard | Get Segment Leaderboard
[**getLoggedInAthleteStarredSegments**](SegmentsApi.md#getLoggedInAthleteStarredSegments) | **GET** /segments/starred | List Starred Segments
[**getSegmentById**](SegmentsApi.md#getSegmentById) | **GET** /segments/{id} | Get Segment
[**starSegment**](SegmentsApi.md#starSegment) | **PUT** /segments/{id}/starred | Star Segment

<a name="exploreSegments"></a>
# **exploreSegments**
> ExplorerResponse exploreSegments(bounds, activityType, minCat, maxCat)

Explore segments

Returns the top 10 segments matching a specified query.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
List<Float> bounds = Arrays.asList(3.4F); // List<Float> | The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude]
String activityType = "activityType_example"; // String | Desired activity type.
Integer minCat = 56; // Integer | The minimum climbing category.
Integer maxCat = 56; // Integer | The maximum climbing category.
try {
    ExplorerResponse result = apiInstance.exploreSegments(bounds, activityType, minCat, maxCat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#exploreSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bounds** | [**List&lt;Float&gt;**](Float.md)| The latitude and longitude for two points describing a rectangular boundary for the search: [southwest corner latitutde, southwest corner longitude, northeast corner latitude, northeast corner longitude] |
 **activityType** | **String**| Desired activity type. | [optional] [enum: running, riding]
 **minCat** | **Integer**| The minimum climbing category. | [optional] [enum: ]
 **maxCat** | **Integer**| The maximum climbing category. | [optional] [enum: ]

### Return type

[**ExplorerResponse**](ExplorerResponse.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLeaderboardBySegmentId"></a>
# **getLeaderboardBySegmentId**
> SegmentLeaderboard getLeaderboardBySegmentId(id, gender, ageGroup, weightClass, following, clubId, dateRange, contextEntries, page, perPage)

Get Segment Leaderboard

Returns the specified segment leaderboard.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
Long id = 789L; // Long | The identifier of the segment leaderboard.
String gender = "gender_example"; // String | Filter by gender.
String ageGroup = "ageGroup_example"; // String | Summit Feature. Filter by age group.
String weightClass = "weightClass_example"; // String | Summit Feature. Filter by weight class.
Boolean following = true; // Boolean | Filter by friends of the authenticated athlete.
Long clubId = 789L; // Long | Filter by club.
String dateRange = "dateRange_example"; // String | Filter by date range, will be in the athlete's timezone
Integer contextEntries = 56; // Integer | 
Integer page = 56; // Integer | Page number.
Integer perPage = 56; // Integer | Number of items per page. Defaults to 30.
try {
    SegmentLeaderboard result = apiInstance.getLeaderboardBySegmentId(id, gender, ageGroup, weightClass, following, clubId, dateRange, contextEntries, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getLeaderboardBySegmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the segment leaderboard. |
 **gender** | **String**| Filter by gender. | [optional] [enum: M, F]
 **ageGroup** | **String**| Summit Feature. Filter by age group. | [optional] [enum: 0_19, 20_24, 25_34, 35_44, 45_54, 55_64, 65_69, 70_74, 75_plus]
 **weightClass** | **String**| Summit Feature. Filter by weight class. | [optional] [enum: 0_124, 125_149, 150_164, 165_179, 180_199, 200_224, 225_249, 250_plus, 0_54, 55_64, 65_74, 75_84, 85_94, 95_104, 105_114, 115_plus]
 **following** | **Boolean**| Filter by friends of the authenticated athlete. | [optional]
 **clubId** | **Long**| Filter by club. | [optional]
 **dateRange** | **String**| Filter by date range, will be in the athlete&#x27;s timezone | [optional] [enum: this_year, this_month, this_week, today]
 **contextEntries** | **Integer**|  | [optional]
 **page** | **Integer**| Page number. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional]

### Return type

[**SegmentLeaderboard**](SegmentLeaderboard.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLoggedInAthleteStarredSegments"></a>
# **getLoggedInAthleteStarredSegments**
> List&lt;SummarySegment&gt; getLoggedInAthleteStarredSegments(page, perPage)

List Starred Segments

List of the authenticated athlete&#x27;s starred segments. Private segments are filtered out unless requested by a token with read_all scope.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
Integer page = 56; // Integer | Page number.
Integer perPage = 56; // Integer | Number of items per page. Defaults to 30.
try {
    List<SummarySegment> result = apiInstance.getLoggedInAthleteStarredSegments(page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getLoggedInAthleteStarredSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Page number. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional]

### Return type

[**List&lt;SummarySegment&gt;**](SummarySegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentById"></a>
# **getSegmentById**
> DetailedSegment getSegmentById(id)

Get Segment

Returns the specified segment. read_all scope required in order to retrieve athlete-specific segment information, or to retrieve private segments.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
Long id = 789L; // Long | The identifier of the segment.
try {
    DetailedSegment result = apiInstance.getSegmentById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#getSegmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the segment. |

### Return type

[**DetailedSegment**](DetailedSegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="starSegment"></a>
# **starSegment**
> DetailedSegment starSegment(starred, id)

Star Segment

Stars/Unstars the given segment for the authenticated athlete. Requires profile:write scope.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentsApi apiInstance = new SegmentsApi();
Boolean starred = true; // Boolean | 
Long id = 789L; // Long | The identifier of the segment to star.
try {
    DetailedSegment result = apiInstance.starSegment(starred, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentsApi#starSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **starred** | **Boolean**|  |
 **id** | **Long**| The identifier of the segment to star. |

### Return type

[**DetailedSegment**](DetailedSegment.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

