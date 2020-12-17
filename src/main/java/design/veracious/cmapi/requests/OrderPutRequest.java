package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.entities.xml.OrderRequest;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.OrderGetResponse;

/**
 * Implementation of the request for the /order/:idOrder endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Order
 */
public class OrderPutRequest extends AbstractRequestImpl<OrderGetResponse> {

	private int idOrder;

	// Action to be performed to change the state of the order
	private String action;

	// The reason for the cancellation request; only applicable, if action =
	// requestCancellation
	private String reason;

	// true|false, only applicable (and optional):
	// - if action = requestCancellation and the actor is the seller of the order,
	// or
	// - if action = acceptCancellation and the actor is the seller of the order
	private boolean relistItems;

	public OrderPutRequest(CMApi api, int idOrder) {
		super(OrderGetResponse.class, api);
		this.idOrder = idOrder;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setRelistItems(boolean relistItems) {
		this.relistItems = relistItems;
	}

	@Override
	public OrderPutRequest submit() {
		String xml = createXML(new OrderRequest(action, reason, relistItems));
		api.request("PUT", "/order/" + idOrder, xml);
		return this;
	}

}
