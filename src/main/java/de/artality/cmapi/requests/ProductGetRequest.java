package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;
import de.artality.cmapi.responses.ProductResponse;

/**
 * Implementation of the request for the GET /products/:idProduct endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Product
 */
public class GetProductRequest extends AbstractRequestImpl<ProductResponse> {

	private int idProduct;

	public GetProductRequest(CMApi api, int idProduct) {
		super(ProductResponse.class, api);
		this.idProduct = idProduct;
	}

	@Override
	public void submit() {
		api.request("GET", "/products/" + idProduct);
	}

}
