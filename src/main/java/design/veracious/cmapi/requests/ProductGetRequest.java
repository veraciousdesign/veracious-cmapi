package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.ProductGetResponse;

/**
 * Implementation of the request for the GET /products/:idProduct endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Product
 */
public class ProductGetRequest extends AbstractRequestImpl<ProductGetResponse> {

	private int idProduct;

	public ProductGetRequest(CMApi api, int idProduct) {
		super(ProductGetResponse.class, api);
		this.idProduct = idProduct;
	}

	@Override
	public ProductGetRequest submit() {
		api.request("GET", "/products/" + idProduct);
		return this;
	}

}
