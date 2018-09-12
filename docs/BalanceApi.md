# BalanceApi

All URIs are relative to *https://eu1.locationiq.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**balance**](BalanceApi.md#balance) | **GET** /balance.php | 


<a name="balance"></a>
# **balance**
> Balance balance()



The Balance API provides a count of request credits left in the user&#39;s account for the day. Balance is reset at midnight UTC everyday (00:00 UTC).

### Example
```java
// Import classes:
//import LocationIq.ApiClient;
//import LocationIq.ApiException;
//import LocationIq.Configuration;
//import LocationIq.auth.*;
//import com.locationiq.client.api.BalanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: key
ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("key");
key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//key.setApiKeyPrefix("Token");

BalanceApi apiInstance = new BalanceApi();
try {
    Balance result = apiInstance.balance();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BalanceApi#balance");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Balance**](Balance.md)

### Authorization

[key](../README.md#key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

