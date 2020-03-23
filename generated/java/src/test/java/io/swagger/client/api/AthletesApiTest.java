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
import io.swagger.client.model.ActivityStats;
import io.swagger.client.model.DetailedAthlete;
import io.swagger.client.model.Fault;
import io.swagger.client.model.Zones;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AthletesApi
 */
@Ignore
public class AthletesApiTest {

    private final AthletesApi api = new AthletesApi();

    /**
     * Get Authenticated Athlete
     *
     * Returns the currently authenticated athlete. Tokens with profile:read_all scope will receive a detailed athlete representation; all others will receive a summary representation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoggedInAthleteTest() throws ApiException {
        DetailedAthlete response = api.getLoggedInAthlete();

        // TODO: test validations
    }
    /**
     * Get Zones
     *
     * Returns the the authenticated athlete&#x27;s heart rate and power zones. Requires profile:read_all.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLoggedInAthleteZonesTest() throws ApiException {
        Zones response = api.getLoggedInAthleteZones();

        // TODO: test validations
    }
    /**
     * Get Athlete Stats
     *
     * Returns the activity stats of an athlete. Only includes data from activities set to Everyone visibilty.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatsTest() throws ApiException {
        Integer id = null;
        ActivityStats response = api.getStats(id);

        // TODO: test validations
    }
    /**
     * Update Athlete
     *
     * Update the currently authenticated athlete. Requires profile:write scope.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLoggedInAthleteTest() throws ApiException {
        Float weight = null;
        DetailedAthlete response = api.updateLoggedInAthlete(weight);

        // TODO: test validations
    }
}
