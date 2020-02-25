# MatchingApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matching**](MatchingApi.md#matching) | **GET** /matching/driving/{coordinates} | Matching Service


<a name="matching"></a>
# **matching**
> DirectionsMatching matching(coordinates, generateHints, approaches, exclude, bearings, radiuses, steps, annotations, geometries, overview, timestamps, gaps, tidy, waypoints)

Matching Service

Matching API matches or snaps given GPS points to the road network in the most plausible way.  Please note the request might result multiple sub-traces.  Large jumps in the timestamps (&gt; 60s) or improbable transitions lead to trace splits if a complete matching could not be found. The algorithm might not be able to match all points. Outliers are removed if they can not be matched successfully.

### Example
```java
// Import classes:
import LocationIq.ApiClient;
import LocationIq.ApiException;
import LocationIq.Configuration;
import LocationIq.auth.*;
import LocationIq.models.*;
import com.locationiq.client.api.MatchingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu1.locationiq.com/v1");
    
    // Configure API key authorization: key
    ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
    key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //key.setApiKeyPrefix("Token");

    MatchingApi apiInstance = new MatchingApi(defaultClient);
    String coordinates = "-0.16102,51.523854;-0.15797,51.52326;-0.161593,51.522550"; // String | String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google's polyline format with precision 5
    String generateHints = "false"; // String | Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String
    String approaches = "curb;curb;curb"; // String | Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default)
    String exclude = "toll"; // String | Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none.
    String bearings = "None"; // String | Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180
    String radiuses = "None"; // String | Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double >= 0 or unlimited (default)
    String steps = "true"; // String | Returned route steps for each route leg [ true, false (default) ]
    String annotations = "false"; // String | Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ]
    String geometries = "polyline"; // String | Returned route geometry format (influences overview and per step) [ polyline (default), polyline6, geojson ]
    String overview = "simplified"; // String | Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all. [ simplified (default), full, false ]
    String timestamps = "200;300;900"; // String | Timestamps for the input locations in seconds since UNIX epoch. Timestamps need to be monotonically increasing. [ {timestamp};{timestamp}[;{timestamp} ...]  integer seconds since UNIX epoch
    String gaps = "ignore"; // String | Allows the input track splitting based on huge timestamp gaps between points. [ split (default), ignore ]
    String tidy = "false"; // String | Allows the input track modification to obtain better matching quality for noisy tracks. [ true, false (default) ]
    String waypoints = "0;1;2"; // String | Treats input coordinates indicated by given indices as waypoints in returned Match object. Default is to treat all input coordinates as waypoints. [ {index};{index};{index}... ]
    try {
      DirectionsMatching result = apiInstance.matching(coordinates, generateHints, approaches, exclude, bearings, radiuses, steps, annotations, geometries, overview, timestamps, gaps, tidy, waypoints);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatchingApi#matching");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coordinates** | **String**| String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google&#39;s polyline format with precision 5 |
 **generateHints** | **String**| Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String | [optional]
 **approaches** | **String**| Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) | [optional]
 **exclude** | **String**| Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. | [optional]
 **bearings** | **String**| Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 | [optional]
 **radiuses** | **String**| Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) | [optional]
 **steps** | **String**| Returned route steps for each route leg [ true, false (default) ] | [optional]
 **annotations** | **String**| Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ] | [optional] [default to &quot;\&quot;false\&quot;&quot;]
 **geometries** | **String**| Returned route geometry format (influences overview and per step) [ polyline (default), polyline6, geojson ] | [optional] [default to &quot;\&quot;polyline\&quot;&quot;]
 **overview** | **String**| Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all. [ simplified (default), full, false ] | [optional] [default to &quot;\&quot;simplified\&quot;&quot;]
 **timestamps** | **String**| Timestamps for the input locations in seconds since UNIX epoch. Timestamps need to be monotonically increasing. [ {timestamp};{timestamp}[;{timestamp} ...]  integer seconds since UNIX epoch | [optional]
 **gaps** | **String**| Allows the input track splitting based on huge timestamp gaps between points. [ split (default), ignore ] | [optional] [default to &quot;\&quot;split\&quot;&quot;]
 **tidy** | **String**| Allows the input track modification to obtain better matching quality for noisy tracks. [ true, false (default) ] | [optional] [default to &quot;\&quot;false\&quot;&quot;]
 **waypoints** | **String**| Treats input coordinates indicated by given indices as waypoints in returned Match object. Default is to treat all input coordinates as waypoints. [ {index};{index};{index}... ] | [optional]

### Return type

[**DirectionsMatching**](DirectionsMatching.md)

### Authorization

[key](../README.md#key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | The request has been made from an unauthorized domain. |  -  |
**404** | No location or places were found for the given input |  -  |
**429** | Request exceeded the rate-limits set on your account |  -  |
**500** | Internal Server Error |  -  |

