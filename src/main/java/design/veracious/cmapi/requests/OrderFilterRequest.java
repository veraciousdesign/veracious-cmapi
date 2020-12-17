package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.OrderFilterResponse;

public class OrderFilterRequest extends AbstractRequestImpl<OrderFilterResponse> {

	private int actor;
	private int state;

	private int start;

//	  actor
//
//    Actor of the order
//    Type: either integer or string
//    Mandatory
//        seller or 1
//        buyer or 2
//
//	  state
//
//    State of the order
//    Type: either integer or string
//    Mandatory
//        bought or 1
//        paid or 2
//        sent or 4
//        received or 8
//        lost or 32
//        cancelled or 128

	public OrderFilterRequest(CMApi api, int actor, int state) {
		super(OrderFilterResponse.class, api);
		this.actor = actor;
		this.state = state;
	}

	public void setStart(int start) {
		this.start = start;
	}

	@Override
	public OrderFilterRequest submit() {
		String endpoint = "/orders/" + actor + "/" + state;
		if (start > 0) {
			endpoint += "/" + start;
		}
		api.request("GET", endpoint);
		return this;
	}

}
