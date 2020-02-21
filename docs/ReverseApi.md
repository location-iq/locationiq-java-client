# ReverseApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reverse**](ReverseApi.md#reverse) | **GET** /reverse.php | Reverse Geocoding


<a name="reverse"></a>
# **reverse**
> Location reverse(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, statecode, showdistance, postaladdress)

Reverse Geocoding

Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.

### Example
```java
// Import classes:
import com.locationiq.client.ApiClient;
import com.locationiq.client.ApiException;
import com.locationiq.client.Configuration;
import com.locationiq.client.auth.*;
import com.locationiq.client.models.*;
import com.locationiq.client.api.ReverseApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu1.locationiq.com/v1");
    
    // Configure API key authorization: key
    ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
    key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //key.setApiKeyPrefix("Token");

    ReverseApi apiInstance = new ReverseApi(defaultClient);
    BigDecimal lat = 40.7487727; // BigDecimal | Latitude of the location to generate an address for.
    BigDecimal lon = -73.9849336; // BigDecimal | Longitude of the location to generate an address for.
    String format = "json"; // String | Format to geocode. Only JSON supported for SDKs
    Integer normalizecity = 1; // Integer | Normalizes village to city level data to city
    Integer addressdetails = 1; // Integer | Include a breakdown of the address into elements. Defaults to 1.
    String acceptLanguage = "en"; // String | Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language=native
    Integer namedetails = 0; // Integer | Include a list of alternative names in the results. These may include language variants, references, operator and brand.
    Integer extratags = 0; // Integer | Include additional information in the result if available, e.g. wikipedia link, opening hours.
    Integer statecode = 0; // Integer | Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0
    Integer showdistance = 0; // Integer | Returns the straight line distance (meters) between the input location and the result's location. Value is set in the distance key of the response. Defaults to 0 [0,1]
    Integer postaladdress = 0; // Integer | Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1]
    try {
      Location result = apiInstance.reverse(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags, statecode, showdistance, postaladdress);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseApi#reverse");
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
 **lat** | **BigDecimal**| Latitude of the location to generate an address for. |
 **lon** | **BigDecimal**| Longitude of the location to generate an address for. |
 **format** | **String**| Format to geocode. Only JSON supported for SDKs | [enum: json]
 **normalizecity** | **Integer**| Normalizes village to city level data to city | [enum: 1]
 **addressdetails** | **Integer**| Include a breakdown of the address into elements. Defaults to 1. | [optional] [default to 1] [enum: 0, 1]
 **acceptLanguage** | **String**| Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native | [optional]
 **namedetails** | **Integer**| Include a list of alternative names in the results. These may include language variants, references, operator and brand. | [optional] [enum: 0, 1]
 **extratags** | **Integer**| Include additional information in the result if available, e.g. wikipedia link, opening hours. | [optional] [enum: 0, 1]
 **statecode** | **Integer**| Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 | [optional] [enum: 0, 1]
 **showdistance** | **Integer**| Returns the straight line distance (meters) between the input location and the result&#39;s location. Value is set in the distance key of the response. Defaults to 0 [0,1] | [optional]
 **postaladdress** | **Integer**| Returns address inside the postaladdress key, that is specifically formatted for each country. Currently supported for addresses in Germany. Defaults to 0 [0,1] | [optional]

### Return type

[**Location**](Location.md)

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

