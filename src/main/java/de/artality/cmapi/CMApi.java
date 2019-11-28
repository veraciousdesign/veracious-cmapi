package de.artality.cmapi;

import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.artality.cmapi.responses.AbstractResponseImpl;
import de.artality.cmapi.utils.PHPUtils;

/**
 * Base implementation of the cardmarket API base endpoint
 */
public class CMApi {

	private static Logger LOGGER = LoggerFactory.getLogger("API");

	/*
	 * Fields needed to connect to the cardmarket api
	 */

	private String apiUrl;
	private String appToken;
	private String appSecret;

	private String accessToken;
	private String accessTokenSecret;

	private String signatureMethod = "HMAC-SHA1";
	private String version = "1.0";

	/*
	 * Fields used to store all the infos recieved from the api after a reqeust
	 */

	private int _status;
	private String _error;
	private Map<String, String> _headers;
	private String _response;

	/**
	 * Basic constructor. Fill parameters according to the given cardmarket profile
	 * app parameters.
	 * 
	 * @param apiUrl            the base url for the api (e.g.
	 *                          https://sandbox.cardmarket.com/ws/v2.0/)
	 * @param appToken
	 * @param appSecret
	 * @param accessToken
	 * @param accessTokenSecret
	 */
	public CMApi(String apiUrl, String appToken, String appSecret, String accessToken, String accessTokenSecret) {
		this.apiUrl = apiUrl;
		this.appToken = appToken;
		this.appSecret = appSecret;
		this.accessToken = accessToken;
		this.accessTokenSecret = accessTokenSecret;
	}

	/**
	 * Base request implementation.
	 * 
	 * @param method             GET|POST|PUT|DELETE
	 * @param endpoint           e.g. "/stock" (with or without the leading "/")
	 * @param optionalParameters all the get parameters needed for the request
	 * @param payload            string representation of the payload that should be
	 *                           transmitted to the endpoint
	 * 
	 * @return <b>CMApi</b> current API object
	 */
	public CMApi request(String method, String endpoint, Map<String, String> optionalParameters, String payload) {

		String url = apiUrl + endpoint.replaceAll("^/+", ""); // remove leading "/"
		String nonce = PHPUtils.uniqid();
		String timestamp = String.valueOf(PHPUtils.time());

		// prepare the parameters

		Map<String, String> params = new TreeMap<String, String>();
		params.put("realm", url);
		params.put("oauth_consumer_key", appToken);
		params.put("oauth_token", accessToken);
		params.put("oauth_nonce", nonce);
		params.put("oauth_timestamp", timestamp);
		params.put("oauth_signature_method", signatureMethod);
		params.put("oauth_version", version);

		// add optional parameters to parameters and the url

		if (optionalParameters != null) {
			params.putAll(optionalParameters);
			url += "?" + PHPUtils.buildQuery(optionalParameters);
		}

		// create Signature

		params.put("oauth_signature", createSignature(method, params));

		// create header params

		String paramString = params.entrySet()
				.stream()
				.map(p -> p.getKey() + "=\"" + p.getValue() + "\"")
				.reduce((p1, p2) -> p1 + ", " + p2)
				.orElse("");

		// DEBUG output

		LOGGER.debug("Nonce: {}", nonce);
		LOGGER.debug("Timestamp: {}", timestamp);
		LOGGER.debug("URL: {}", url);
		LOGGER.debug("Parameter: {}", paramString);

		// create request object

		HttpUriRequest request;
		switch (method.toUpperCase()) {
		case "POST":
			request = new HttpPost(url);
			break;
		case "PUT":
			request = new HttpPut(url);
			break;
		case "DELETE":
			request = new HttpDelete(url);
			break;
		default:
			request = new HttpGet(url);
			break;
		}
		request.setHeader(HttpHeaders.AUTHORIZATION, "OAuth " + paramString);

		// send the request

		try {

			CloseableHttpClient client = HttpClients.createDefault();
			CloseableHttpResponse response = client.execute(request);

			// check response

			StatusLine statusLine = response.getStatusLine();
			_status = statusLine.getStatusCode();
			_error = statusLine.getReasonPhrase();

			// get all the needed information

			_response = EntityUtils.toString(response.getEntity());

			// LOGGER.debug("Response: {}", _response);

			_headers = new HashMap<String, String>();
			for (Header header : response.getAllHeaders()) {
				_headers.put(header.getName(), header.getValue());
			}

			response.close();
			client.close();

		} catch (Exception e) {
			LOGGER.error("Exception thrown during request(): {}", e.getLocalizedMessage());
		}
		return this;
	}

	/**
	 * request implementation without a payload
	 * 
	 * @param method             GET|POST|PUT|DELETE
	 * @param endpoint           e.g. "/stock" (with or without the leading "/")
	 * @param optionalParameters all the get parameters needed for the request
	 * 
	 * @return <b>CMApi</b> current API object
	 */
	public CMApi request(String method, String endpoint, Map<String, String> optionalParameters) {
		return request(method, endpoint, optionalParameters, null);
	}

	/**
	 * request implementation without any additional parameters
	 * 
	 * @param method   GET|POST|PUT|DELETE
	 * @param endpoint e.g. "/stock" (with or without the leading "/")
	 * @param payload  string representation of the payload that should be
	 *                 transmitted to the endpoint
	 * 
	 * @return <b>CMApi</b> current API object
	 */
	public CMApi request(String method, String endpoint, String payload) {
		return request(method, endpoint, null, payload);
	}

	/**
	 * request implementation without additional parameters or payload
	 * 
	 * @param method   GET|POST|PUT|DELETE
	 * @param endpoint e.g. "/stock" (with or without the leading "/")
	 * 
	 * @return <b>CMApi</b> current API object
	 */
	public CMApi request(String method, String endpoint) {
		return request(method, endpoint, null, null);
	}

	/**
	 * creates the signature needed to pass the api security checks
	 * 
	 * @param method get/post/put/delete
	 * @param params
	 * @return signature
	 */
	private String createSignature(String method, Map<String, String> params) {

		String paramString = params.entrySet()
				.stream()
				.filter(p -> !"realm".equals(p.getKey()))
				.map(p -> PHPUtils.rawurlencode(p.getKey()) + "=" + PHPUtils.rawurlencode(p.getValue()))
				.reduce((p1, p2) -> p1 + "&" + p2)
				.orElse("");

		String baseString = method.toUpperCase() + "&" + PHPUtils.rawurlencode(params.get("realm")) + "&"
				+ PHPUtils.rawurlencode(paramString);

		String signingKey = PHPUtils.rawurlencode(appSecret) + "&" + PHPUtils.rawurlencode(accessTokenSecret);

		byte[] rawSignature = Base64.getEncoder()
				.encode(PHPUtils.hmacSHA1(baseString, signingKey));

		String signature = new String(rawSignature);

		// DEBUG Output

		LOGGER.debug("Base String: {}", baseString);
		LOGGER.debug("Signing Key: {}", signingKey);
		LOGGER.debug("Signature: {}", signature);

		return signature;
	}

	/**
	 * returns the status code of the latest request
	 * 
	 * @return <b>int</b> status code
	 */
	public int getStatus() {
		return _status;
	}

	/**
	 * returns the latest error message
	 * 
	 * @return <b>String</b> error message
	 */
	public String getLastError() {
		return _error;
	}

	/**
	 * returns all the headers from the latest request
	 * 
	 * @return <b>Map[String, String]</b>
	 */
	public Map<String, String> getHeaders() {
		return _headers;
	}

	/**
	 * returns a specific header of the latest request null if the header isn't
	 * found
	 * 
	 * @param which
	 * @return <b>String</b> or <b>null</b>
	 */
	public String getHeader(String which) {
		if (_headers.containsKey(which)) {
			return _headers.get(which);
		}
		return null;
	}

	/**
	 * returns the response of the latest request
	 * 
	 * @return the <b>String</b> representation of the response
	 */
	public String getResponse() {
		return _response;
	}

	/**
	 * returns the response of the latest request and converts it into an object of
	 * the given clazz
	 * 
	 * @param <T>   type of the given clazz that is a subclass of
	 *              AbstractResponseImpl
	 * @param clazz the clazz used to convert the response string
	 * 
	 * @return <b>T</b> or <b>null</b>
	 */
	public <T extends AbstractResponseImpl<?>> T getResponse(Class<T> clazz) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(getResponse(), clazz);
		} catch (IOException e) {
			return null;
		}
	}

}
