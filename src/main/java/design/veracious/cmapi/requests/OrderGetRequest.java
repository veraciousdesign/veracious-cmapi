package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.requests.base.Request;
import design.veracious.cmapi.responses.OrderGetResponse;

/**
 * Implementation of the request for the /order/:idOrder endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Order
 */
public class OrderGetRequest extends AbstractRequestImpl<OrderGetResponse> {

	private int idOrder;

	public OrderGetRequest(CMApi api, int idOrder) {
		super(OrderGetResponse.class, api);
		this.idOrder = idOrder;
	}

	@Override
	public Request<OrderGetResponse> submit() {
		api.request("GET", "/order/" + idOrder);
		return this;
	}

}
