package design.veracious.cmapi.responses;

import java.util.List;

import design.veracious.cmapi.entities.OrderEntity;
import design.veracious.cmapi.responses.base.AbstractResponseImpl;

public class OrderFilterResponse extends AbstractResponseImpl<List<OrderEntity>> {

	public List<OrderEntity> getOrder() {
		return getData();
	}

	public void setOrder(List<OrderEntity> order) {
		setData(order);
	}


}
