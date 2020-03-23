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

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.DetailedSegmentEffort;
import io.swagger.client.model.Fault;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SegmentEffortsApi {
    private ApiClient apiClient;

    public SegmentEffortsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SegmentEffortsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getEffortsBySegmentId
     * @param id The identifier of the segment. (required)
     * @param page Page number. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getEffortsBySegmentIdCall(Integer id, Integer page, Integer perPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/segments/{id}/all_efforts"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (perPage != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("per_page", perPage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "strava_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getEffortsBySegmentIdValidateBeforeCall(Integer id, Integer page, Integer perPage, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEffortsBySegmentId(Async)");
        }
        
        com.squareup.okhttp.Call call = getEffortsBySegmentIdCall(id, page, perPage, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Segment Efforts
     * Returns a set of the authenticated athlete&#x27;s segment efforts for a given segment.
     * @param id The identifier of the segment. (required)
     * @param page Page number. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional)
     * @return List&lt;DetailedSegmentEffort&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<DetailedSegmentEffort> getEffortsBySegmentId(Integer id, Integer page, Integer perPage) throws ApiException {
        ApiResponse<List<DetailedSegmentEffort>> resp = getEffortsBySegmentIdWithHttpInfo(id, page, perPage);
        return resp.getData();
    }

    /**
     * List Segment Efforts
     * Returns a set of the authenticated athlete&#x27;s segment efforts for a given segment.
     * @param id The identifier of the segment. (required)
     * @param page Page number. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional)
     * @return ApiResponse&lt;List&lt;DetailedSegmentEffort&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<DetailedSegmentEffort>> getEffortsBySegmentIdWithHttpInfo(Integer id, Integer page, Integer perPage) throws ApiException {
        com.squareup.okhttp.Call call = getEffortsBySegmentIdValidateBeforeCall(id, page, perPage, null, null);
        Type localVarReturnType = new TypeToken<List<DetailedSegmentEffort>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Segment Efforts (asynchronously)
     * Returns a set of the authenticated athlete&#x27;s segment efforts for a given segment.
     * @param id The identifier of the segment. (required)
     * @param page Page number. (optional)
     * @param perPage Number of items per page. Defaults to 30. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEffortsBySegmentIdAsync(Integer id, Integer page, Integer perPage, final ApiCallback<List<DetailedSegmentEffort>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEffortsBySegmentIdValidateBeforeCall(id, page, perPage, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<DetailedSegmentEffort>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSegmentEffortById
     * @param id The identifier of the segment effort. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSegmentEffortByIdCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/segment_efforts/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "strava_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSegmentEffortByIdValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSegmentEffortById(Async)");
        }
        
        com.squareup.okhttp.Call call = getSegmentEffortByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Segment Effort
     * Returns a segment effort from an activity that is owned by the authenticated athlete.
     * @param id The identifier of the segment effort. (required)
     * @return DetailedSegmentEffort
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DetailedSegmentEffort getSegmentEffortById(Long id) throws ApiException {
        ApiResponse<DetailedSegmentEffort> resp = getSegmentEffortByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get Segment Effort
     * Returns a segment effort from an activity that is owned by the authenticated athlete.
     * @param id The identifier of the segment effort. (required)
     * @return ApiResponse&lt;DetailedSegmentEffort&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DetailedSegmentEffort> getSegmentEffortByIdWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getSegmentEffortByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<DetailedSegmentEffort>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Segment Effort (asynchronously)
     * Returns a segment effort from an activity that is owned by the authenticated athlete.
     * @param id The identifier of the segment effort. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSegmentEffortByIdAsync(Long id, final ApiCallback<DetailedSegmentEffort> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSegmentEffortByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DetailedSegmentEffort>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
