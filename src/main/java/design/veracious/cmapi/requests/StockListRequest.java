package design.veracious.cmapi.requests;

import java.util.HashMap;
import java.util.Map;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.StockListResponse;

/**
 * Implementation of the request for the /stock/file endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Stock_File
 */
public class StockListRequest extends AbstractRequestImpl<StockListResponse> {

	private Map<String, String> params;

	public StockListRequest(CMApi api, int idGame, boolean isSealed) {
		super(StockListResponse.class, api);

		params = new HashMap<String, String>();
		params.put("idGame", String.valueOf(idGame));
		params.put("isSealed", String.valueOf(isSealed));
	}

	@Override
	public StockListRequest submit() {
		api.request("GET", "/stock/file", params);
		return this;
	}

}
