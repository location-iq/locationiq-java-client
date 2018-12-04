# SearchApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **GET** /search.php | Forward Geocoding


<a name="search"></a>
# **search**
> List&lt;Location&gt; search(q, format, normalizecity, addressdetails, viewbox, bounded, limit, acceptLanguage, countrycodes, namedetails, dedupe, extratags, statecode)

Forward Geocoding

The Search API allows converting addresses, such as a street address, into geographic coordinates (latitude and longitude). These coordinates can serve various use-cases, from placing markers on a map to helping algorithms determine nearby bus stops. This process is also known as Forward Geocoding.

### Example
```java
// Import classes:
//import LocationIq.ApiClient;
//import LocationIq.ApiException;
//import LocationIq.Configuration;
//import LocationIq.auth.*;
//import com.locationiq.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: key
ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//key.setApiKeyPrefix("Token");

SearchApi apiInstance = new SearchApi();
String q = "Empire state building"; // String | Address to geocode
String format = "json"; // String | Format to geocode. Only JSON supported for SDKs
Integer normalizecity = 1; // Integer | For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs.
Integer addressdetails = 1; // Integer | Include a breakdown of the address into elements. Defaults to 0.
String viewbox = "-132.84908,47.69382,-70.44674,30.82531"; // String | The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - `max_lon,max_lat,min_lon,min_lat` or `min_lon,min_lat,max_lon,max_lat` - are accepted in any order as long as they span a real box. 
Integer bounded = 1; // Integer | Restrict the results to only items contained with the viewbox
Integer limit = 10; // Integer | Limit the number of returned results. Default is 10.
String acceptLanguage = "en"; // String | Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language=native
String countrycodes = "us"; // String | Limit search to a list of countries.
Integer namedetails = 1; // Integer | Include a list of alternative names in the results. These may include language variants, references, operator and brand.
Integer dedupe = 1; // Integer | Sometimes you have several objects in OSM identifying the same place or object in reality. The simplest case is a street being split in many different OSM ways due to different characteristics. Nominatim will attempt to detect such duplicates and only return one match; this is controlled by the dedupe parameter which defaults to 1. Since the limit is, for reasons of efficiency, enforced before and not after de-duplicating, it is possible that de-duplicating leaves you with less results than requested.
Integer extratags = 0; // Integer | Include additional information in the result if available, e.g. wikipedia link, opening hours.
Integer statecode = 0; // Integer | Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0
try {
    List<Location> result = apiInstance.search(q, format, normalizecity, addressdetails, viewbox, bounded, limit, acceptLanguage, countrycodes, namedetails, dedupe, extratags, statecode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Address to geocode |
 **format** | **String**| Format to geocode. Only JSON supported for SDKs | [enum: json]
 **normalizecity** | **Integer**| For responses with no city value in the address section, the next available element in this order - city_district, locality, town, borough, municipality, village, hamlet, quarter, neighbourhood - from the address section will be normalized to city. Defaults to 1 for SDKs. | [enum: 1]
 **addressdetails** | **Integer**| Include a breakdown of the address into elements. Defaults to 0. | [optional] [enum: 0, 1]
 **viewbox** | **String**| The preferred area to find search results.  To restrict results to those within the viewbox, use along with the bounded option. Tuple of 4 floats. Any two corner points of the box - &#x60;max_lon,max_lat,min_lon,min_lat&#x60; or &#x60;min_lon,min_lat,max_lon,max_lat&#x60; - are accepted in any order as long as they span a real box.  | [optional]
 **bounded** | **Integer**| Restrict the results to only items contained with the viewbox | [optional] [enum: 0, 1]
 **limit** | **Integer**| Limit the number of returned results. Default is 10. | [optional] [default to 10]
 **acceptLanguage** | **String**| Preferred language order for showing search results, overrides the value specified in the Accept-Language HTTP header. Defaults to en. To use native language for the response when available, use accept-language&#x3D;native | [optional]
 **countrycodes** | **String**| Limit search to a list of countries. | [optional]
 **namedetails** | **Integer**| Include a list of alternative names in the results. These may include language variants, references, operator and brand. | [optional] [enum: 0, 1]
 **dedupe** | **Integer**| Sometimes you have several objects in OSM identifying the same place or object in reality. The simplest case is a street being split in many different OSM ways due to different characteristics. Nominatim will attempt to detect such duplicates and only return one match; this is controlled by the dedupe parameter which defaults to 1. Since the limit is, for reasons of efficiency, enforced before and not after de-duplicating, it is possible that de-duplicating leaves you with less results than requested. | [optional] [enum: 0, 1]
 **extratags** | **Integer**| Include additional information in the result if available, e.g. wikipedia link, opening hours. | [optional] [enum: 0, 1]
 **statecode** | **Integer**| Adds state or province code when available to the statecode key inside the address element. Currently supported for addresses in the USA, Canada and Australia. Defaults to 0 | [optional] [enum: 0, 1]

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

[key](../README.md#key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

