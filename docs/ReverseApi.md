# ReverseApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reverse**](ReverseApi.md#reverse) | **GET** /reverse.php | Reverse Geocoding


<a name="reverse"></a>
# **reverse**
> Location reverse(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags)

Reverse Geocoding

Reverse geocoding is the process of converting a coordinate or location (latitude, longitude) to a readable address or place name. This permits the identification of nearby street addresses, places, and/or area subdivisions such as a neighborhood, county, state, or country.

### Example
```java
// Import classes:
//import LocationIq.ApiClient;
//import LocationIq.ApiException;
//import LocationIq.Configuration;
//import LocationIq.auth.*;
//import com.locationiq.client.api.ReverseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: key
ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//key.setApiKeyPrefix("Token");

ReverseApi apiInstance = new ReverseApi();
BigDecimal lat = 17.24; // BigDecimal | Latitude of the location to generate an address for.
BigDecimal lon = 74.25; // BigDecimal | Longitude of the location to generate an address for.
String format = json; // String | Format to geocode. Only JSON supported for SDKs
Integer normalizecity = 1; // Integer | Normalizes village to city level data to city
Integer addressdetails = 1; // Integer | Include a breakdown of the address into elements. Defaults to 1.
String acceptLanguage = en; // String | Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language=native
Integer namedetails = 0; // Integer | Include a list of alternative names in the results. These may include language variants, references, operator and brand.
Integer extratags = 0; // Integer | Include additional information in the result if available, e.g. wikipedia link, opening hours.
try {
    Location result = apiInstance.reverse(lat, lon, format, normalizecity, addressdetails, acceptLanguage, namedetails, extratags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReverseApi#reverse");
    e.printStackTrace();
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

### Return type

[**Location**](Location.md)

### Authorization

[key](../README.md#key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

