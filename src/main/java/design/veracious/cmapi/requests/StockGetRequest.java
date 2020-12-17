package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.StockGetResponse;

/**
 * Implementation of the request for the /stock endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Stock
 */
public class StockGetRequest extends AbstractRequestImpl<StockGetResponse> {

	public StockGetRequest(CMApi api) {
		super(StockGetResponse.class, api);
	}

	@Override
	public StockGetRequest submit() {
		api.request("GET", "/stock");
		return this;
	}

}
