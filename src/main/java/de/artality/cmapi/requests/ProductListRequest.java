package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;
import de.artality.cmapi.responses.ProductListResponse;

/**
 * Implementation of the request for the /productlist endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Productlist
 */
public class ProductListRequest extends AbstractRequestImpl<ProductListResponse> {

	public ProductListRequest(CMApi api) {
		super(ProductListResponse.class, api);
	}

	public void submit() {
		api.request("GET", "/productlist");
	}
}
