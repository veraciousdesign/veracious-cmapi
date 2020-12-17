package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.entities.xml.TrackingRequest;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.OrderGetResponse;

/**
 * Implementation of the request for the order/:idOrder/tracking endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Order_TrackingNumber
 */
public class OrderTrackingRequest extends AbstractRequestImpl<OrderGetResponse> {

	private int idOrder;
	private String trackingNumber;

	public OrderTrackingRequest(CMApi api, int idOrder, String trackingNumber) {
		super(OrderGetResponse.class, api);
		this.idOrder = idOrder;
		this.trackingNumber = trackingNumber;
	}

	@Override
	public OrderTrackingRequest submit() {
		String xml = createXML(new TrackingRequest(trackingNumber));
		api.request("PUT", "/order/" + idOrder + "/tracking", xml);
		return this;
	}

}
