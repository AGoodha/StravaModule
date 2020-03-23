# SegmentEffortsApi

All URIs are relative to *https://www.strava.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEffortsBySegmentId**](SegmentEffortsApi.md#getEffortsBySegmentId) | **GET** /segments/{id}/all_efforts | List Segment Efforts
[**getSegmentEffortById**](SegmentEffortsApi.md#getSegmentEffortById) | **GET** /segment_efforts/{id} | Get Segment Effort

<a name="getEffortsBySegmentId"></a>
# **getEffortsBySegmentId**
> List&lt;DetailedSegmentEffort&gt; getEffortsBySegmentId(id, page, perPage)

List Segment Efforts

Returns a set of the authenticated athlete&#x27;s segment efforts for a given segment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentEffortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentEffortsApi apiInstance = new SegmentEffortsApi();
Integer id = 56; // Integer | The identifier of the segment.
Integer page = 56; // Integer | Page number.
Integer perPage = 56; // Integer | Number of items per page. Defaults to 30.
try {
    List<DetailedSegmentEffort> result = apiInstance.getEffortsBySegmentId(id, page, perPage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentEffortsApi#getEffortsBySegmentId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| The identifier of the segment. |
 **page** | **Integer**| Page number. | [optional]
 **perPage** | **Integer**| Number of items per page. Defaults to 30. | [optional]

### Return type

[**List&lt;DetailedSegmentEffort&gt;**](DetailedSegmentEffort.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSegmentEffortById"></a>
# **getSegmentEffortById**
> DetailedSegmentEffort getSegmentEffortById(id)

Get Segment Effort

Returns a segment effort from an activity that is owned by the authenticated athlete.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SegmentEffortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: strava_oauth
OAuth strava_oauth = (OAuth) defaultClient.getAuthentication("strava_oauth");
strava_oauth.setAccessToken("YOUR ACCESS TOKEN");

SegmentEffortsApi apiInstance = new SegmentEffortsApi();
Long id = 789L; // Long | The identifier of the segment effort.
try {
    DetailedSegmentEffort result = apiInstance.getSegmentEffortById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentEffortsApi#getSegmentEffortById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| The identifier of the segment effort. |

### Return type

[**DetailedSegmentEffort**](DetailedSegmentEffort.md)

### Authorization

[strava_oauth](../README.md#strava_oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

