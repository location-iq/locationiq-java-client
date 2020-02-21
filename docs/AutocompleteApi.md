# AutocompleteApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autocomplete**](AutocompleteApi.md#autocomplete) | **GET** /autocomplete.php | 


<a name="autocomplete"></a>
# **autocomplete**
> List&lt;Object&gt; autocomplete(q, normalizecity, limit, viewbox, bounded, countrycodes, acceptLanguage, tag)



The Autocomplete API is a variant of the Search API that returns place predictions in response to an HTTP request.  The request specifies a textual search string and optional geographic bounds.  The service can be used to provide autocomplete functionality for text-based geographic searches, by returning places such as businesses, addresses and points of interest as a user types. The Autocomplete API can match on full words as well as substrings. Applications can therefore send queries as the user types, to provide on-the-fly place predictions.

### Example
```java
// Import classes:
import com.locationiq.client.ApiClient;
import com.locationiq.client.ApiException;
import com.locationiq.client.Configuration;
import com.locationiq.client.auth.*;
import com.locationiq.client.models.*;
import com.locationiq.client.api.AutocompleteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu1.locationiq.com/v1");
    
    // Configure API key authorization: key
    ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
    key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //key.setApiKeyPrefix("Token");

    AutocompleteApi apiInstance = new AutocompleteApi(defaultClient);
    String q = "Empire state"; // String | Address to geocode
    Integer normalizecity = 1; // Integer | For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs.
    Integer limit = 10; // Integer | Limit the number of returned results. Default is 10.
    String viewbox = "-132.84908,47.69382,-70.44674,30.82531"; // String | The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - `max_lon,max_lat,min_lon,min_lat` or `min_lon,min_lat,max_lon,max_lat` - are accepted in any order as long as they span a real box. 
    Integer bounded = 1; // Integer | Restrict the results to only items contained with the viewbox
    String countrycodes = "us"; // String | Limit search to a list of countries.
    String acceptLanguage = "en"; // String | Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language=native
    String tag = "place"; // String | Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag=place:city, To restrict the results to all of OSM class place: tag=place
    try {
      List<Object> result = apiInstance.autocomplete(q, normalizecity, limit, viewbox, bounded, countrycodes, acceptLanguage, tag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutocompleteApi#autocomplete");
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
 **q** | **String**| Address to geocode |
 **normalizecity** | **Integer**| For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. | [enum: 1]
 **limit** | **Integer**| Limit the number of returned results. Default is 10. | [optional] [default to 10]
 **viewbox** | **String**| The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  | [optional]
 **bounded** | **Integer**| Restrict the results to only items contained with the viewbox | [optional] [enum: 0, 1]
 **countrycodes** | **String**| Limit search to a list of countries. | [optional]
 **acceptLanguage** | **String**| Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native | [optional]
 **tag** | **String**| Restricts the autocomplete search results to elements of specific OSM class and type.  Example - To restrict results to only class place and type city: tag&#x3D;place:city, To restrict the results to all of OSM class place: tag&#x3D;place | [optional]

### Return type

**List&lt;Object&gt;**

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

