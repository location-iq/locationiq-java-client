# MatrixApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**matrix**](MatrixApi.md#matrix) | **GET** /matrix/driving/{coordinates} | Matrix Service


<a name="matrix"></a>
# **matrix**
> DirectionsMatrix matrix(coordinates, bearings, radiuses, generateHints, approaches, exclude, annotations, sources, destinations, fallbackSpeed, fallbackCoordinate)

Matrix Service

Computes duration of the fastest route between all pairs of supplied coordinates. Returns the durations or distances or both between the coordinate pairs. Note that the distances are not the shortest distance between two coordinates, but rather the distances of the fastest routes.

### Example
```java
// Import classes:
import com.locationiq.client.ApiClient;
import com.locationiq.client.ApiException;
import com.locationiq.client.Configuration;
import com.locationiq.client.auth.*;
import com.locationiq.client.models.*;
import com.locationiq.client.api.MatrixApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu1.locationiq.com/v1");
    
    // Configure API key authorization: key
    ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
    key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //key.setApiKeyPrefix("Token");

    MatrixApi apiInstance = new MatrixApi(defaultClient);
    String coordinates = "-0.16102,51.523854;-0.15797,51.52326;-0.161593,51.522550"; // String | String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google's polyline format with precision 5
    String bearings = "10,20;40,30;30,9"; // String | Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180
    String radiuses = "500;200;300"; // String | Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double >= 0 or unlimited (default)
    String generateHints = "false"; // String | Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String
    String approaches = "curb;curb;curb"; // String | Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default)
    String exclude = "toll"; // String | Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none.
    String annotations = "distance"; // String | Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ]
    Integer sources = 0; // Integer | Use location with given index as source. [ {index};{index}[;{index} ...] or all (default) ] => index  0 <= integer < #locations
    Integer destinations = 2; // Integer | Use location with given index as destination. [ {index};{index}[;{index} ...] or all (default) ]
    BigDecimal fallbackSpeed = 25.65; // BigDecimal | If no route found between a source/destination pair, calculate the as-the-crow-flies distance,  then use this speed to estimate duration. double > 0
    String fallbackCoordinate = "snapped"; // String | When using a fallback_speed, use the user-supplied coordinate (input), or the snapped location (snapped) for calculating distances. [ input (default), or snapped ]
    try {
      DirectionsMatrix result = apiInstance.matrix(coordinates, bearings, radiuses, generateHints, approaches, exclude, annotations, sources, destinations, fallbackSpeed, fallbackCoordinate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MatrixApi#matrix");
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
 **bearings** | **String**| Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 | [optional]
 **radiuses** | **String**| Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) | [optional]
 **generateHints** | **String**| Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String | [optional]
 **approaches** | **String**| Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) | [optional]
 **exclude** | **String**| Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. | [optional]
 **annotations** | **String**| Returns additional metadata for each coordinate along the route geometry.  [ true, false (default), nodes, distance, duration, datasources, weight, speed ] | [optional]
 **sources** | **Integer**| Use location with given index as source. [ {index};{index}[;{index} ...] or all (default) ] &#x3D;&gt; index  0 &lt;&#x3D; integer &lt; #locations | [optional]
 **destinations** | **Integer**| Use location with given index as destination. [ {index};{index}[;{index} ...] or all (default) ] | [optional]
 **fallbackSpeed** | **BigDecimal**| If no route found between a source/destination pair, calculate the as-the-crow-flies distance,  then use this speed to estimate duration. double &gt; 0 | [optional]
 **fallbackCoordinate** | **String**| When using a fallback_speed, use the user-supplied coordinate (input), or the snapped location (snapped) for calculating distances. [ input (default), or snapped ] | [optional] [default to &quot;\&quot;input\&quot;&quot;]

### Return type

[**DirectionsMatrix**](DirectionsMatrix.md)

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

