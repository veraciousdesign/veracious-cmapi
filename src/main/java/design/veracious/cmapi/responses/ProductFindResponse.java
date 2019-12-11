package design.veracious.cmapi.responses;

import java.util.List;

import design.veracious.cmapi.entities.ProductEntity;
import design.veracious.cmapi.responses.base.AbstractResponseImpl;

/**
 * Implementation of the response for the /products/find endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Find_Products
 *
 */
public class ProductFindResponse extends AbstractResponseImpl<List<ProductEntity>> {

	public List<ProductEntity> getProduct() {
		return getData();
	}

	public void setProduct(List<ProductEntity> product) {
		setData(product);
	}

}