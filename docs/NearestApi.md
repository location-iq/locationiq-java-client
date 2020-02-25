# NearestApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**nearest**](NearestApi.md#nearest) | **GET** /nearest/driving/{coordinates} | Nearest Service


<a name="nearest"></a>
# **nearest**
> DirectionsNearest nearest(coordinates, generateHints, exclude, bearings, radiuses, approaches, number)

Nearest Service

Snaps a coordinate to the street network and returns the nearest n matches. Where coordinates only supports a single {longitude},{latitude} entry.

### Example
```java
// Import classes:
import LocationIq.ApiClient;
import LocationIq.ApiException;
import LocationIq.Configuration;
import LocationIq.auth.*;
import LocationIq.models.*;
import com.locationiq.client.api.NearestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu1.locationiq.com/v1");
    
    // Configure API key authorization: key
    ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
    key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //key.setApiKeyPrefix("Token");

    NearestApi apiInstance = new NearestApi(defaultClient);
    String coordinates = "-0.16102,51.523854"; // String | String of format {longitude},{latitude};{longitude},{latitude}[;{longitude},{latitude} ...] or polyline({polyline}) or polyline6({polyline6}). polyline follows Google's polyline format with precision 5
    String generateHints = "false"; // String | Adds a Hint to the response which can be used in subsequent requests, see hints parameter. Input Value - true (default), false Format - Base64 String
    String exclude = "toll"; // String | Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none.
    String bearings = "10,20"; // String | Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180
    String radiuses = "1000"; // String | Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double >= 0 or unlimited (default)
    String approaches = "curb"; // String | Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default)
    Integer number = 3; // Integer | Number of nearest segments that should be returned. [ integer >= 1 (default 1) ]
    try {
      DirectionsNearest result = apiInstance.nearest(coordinates, generateHints, exclude, bearings, radiuses, approaches, number);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NearestApi#nearest");
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
 **exclude** | **String**| Additive list of classes to avoid, order does not matter. input Value - {class}[,{class}] Format - A class name determined by the profile or none. | [optional]
 **bearings** | **String**| Limits the search to segments with given bearing in degrees towards true north in clockwise direction. List of positive integer pairs separated by semi-colon and bearings array should be equal to length of coordinate array. Input Value :- {bearing};{bearing}[;{bearing} ...] Bearing follows the following format : bearing {value},{range} integer 0 .. 360,integer 0 .. 180 | [optional]
 **radiuses** | **String**| Limits the search to given radius in meters Radiuses array length should be same as coordinates array, eaach value separated by semi-colon. Input Value - {radius};{radius}[;{radius} ...] Radius has following format :- double &gt;&#x3D; 0 or unlimited (default) | [optional]
 **approaches** | **String**| Keep waypoints on curb side. Input Value - {approach};{approach}[;{approach} ...] Format - curb or unrestricted (default) | [optional]
 **number** | **Integer**| Number of nearest segments that should be returned. [ integer &gt;&#x3D; 1 (default 1) ] | [optional]

### Return type

[**DirectionsNearest**](DirectionsNearest.md)

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

