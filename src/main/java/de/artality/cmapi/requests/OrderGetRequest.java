package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;
import de.artality.cmapi.requests.base.AbstractRequestImpl;
import de.artality.cmapi.requests.base.Request;
import de.artality.cmapi.responses.OrderGetResponse;

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
