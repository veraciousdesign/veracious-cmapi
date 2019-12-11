package de.artality.cmapi.responses;

import de.artality.cmapi.entities.OrderEntity;
import de.artality.cmapi.responses.base.AbstractResponseImpl;

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
