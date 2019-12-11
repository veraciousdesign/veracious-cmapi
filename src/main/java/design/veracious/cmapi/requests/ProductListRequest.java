package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.ProductListResponse;

/**
 * Implementation of the request for the /productlist endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Productlist
 */
public class ProductListRequest extends AbstractRequestImpl<ProductListResponse> {

	public ProductListRequest(CMApi api) {
		super(ProductListResponse.class, api);
	}

	@Override
	public ProductListRequest submit() {
		api.request("GET", "/productlist");
		return this;
	}

}
