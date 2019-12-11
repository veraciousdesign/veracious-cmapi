package design.veracious.cmapi.responses;

import design.veracious.cmapi.entities.OrderEntity;
import design.veracious.cmapi.responses.base.AbstractResponseImpl;

/**
 * Implementation of the response for the /order/:idOrder endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Order
 *
 */
public class OrderGetResponse extends AbstractResponseImpl<OrderEntity> {

	public OrderEntity getOrder() {
		return getData();
	}

	public void setOrder(OrderEntity order) {
		setData(order);
	}

}
