package de.artality.cmapi.requests;

import java.util.HashMap;
import java.util.Map;

import de.artality.cmapi.CMApi;
import de.artality.cmapi.responses.FindProductResponse;

/**
 * Implementation of the request for the /products/find endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Find_Products
 */
public class FindProductRequest extends AbstractRequestImpl<FindProductResponse> {

	private Map<String, String> optionalParams;

	public FindProductRequest(CMApi api, String search) {
		super(FindProductResponse.class, api);
		optionalParams = new HashMap<>();
		optionalParams.put("search", search);
	}

	public void setExact(boolean exact) {
		optionalParams.put("exact", String.valueOf(exact));
	}

	public void setIdGame(int idGame) {
		optionalParams.put("idGame", String.valueOf(idGame));
	}

	public void setIdLanguage(int idLanguage) {
		optionalParams.put("idLanguage", String.valueOf(idLanguage));
	}

	public void setStart(int start) {
		optionalParams.put("start", String.valueOf(start));
	}

	public void setMaxResults(int maxResults) {
		optionalParams.put("maxResults", String.valueOf(maxResults));
	}

	@Override
	public void submit() {
		api.request("GET", "/products/find", optionalParams);
	}

}