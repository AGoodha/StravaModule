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

import io.swagger.client.ApiException;
import io.swagger.client.model.DetailedSegmentEffort;
import io.swagger.client.model.Fault;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SegmentEffortsApi
 */
@Ignore
public class SegmentEffortsApiTest {

    private final SegmentEffortsApi api = new SegmentEffortsApi();

    /**
     * List Segment Efforts
     *
     * Returns a set of the authenticated athlete&#x27;s segment efforts for a given segment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEffortsBySegmentIdTest() throws ApiException {
        Integer id = null;
        Integer page = null;
        Integer perPage = null;
        List<DetailedSegmentEffort> response = api.getEffortsBySegmentId(id, page, perPage);

        // TODO: test validations
    }
    /**
     * Get Segment Effort
     *
     * Returns a segment effort from an activity that is owned by the authenticated athlete.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSegmentEffortByIdTest() throws ApiException {
        Long id = null;
        DetailedSegmentEffort response = api.getSegmentEffortById(id);

        // TODO: test validations
    }
}