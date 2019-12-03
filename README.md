# arality-cmapi

[Read the specifications on the Cardmarket API.](https://api.cardmarket.com/ws/documentation/API_2.0:Main_Page)

CMapi is a simple and easy way to connect to the Cardmarket API.
It is written in Java 11 to take advantage of some of the new features, but still having access to a long enough support cycle.


### Sample Code

1) Create an API connector

```Java
String url = "https://api.cardmarket.com/ws/v2.0/output.json/";
String appToken = "";
String appSecret = "";
String accessToken = "";
String accessTokenSecret = "";

CMApi api = new CMApi(
	url,
	appToken,
	appSecret,
	accessToken,
	accessTokenSecret
);
```

2) Submit a request and fetch the response

```Java
int idProduct = 1234;
GetProductRequest req = new GetProductRequest(api, idProduct);
req.submit();
ProductResponse res = req.getResponse();
```


### TODO

* Implementing the remaining Requests/Responses
* Adding a nice and convenient way to check the success of the request directly inside the Request

****

That's about it. Post any bugs or feature requests to the issue tracker. :grin: 
