package design.veracious.cmapi.responses;

import design.veracious.cmapi.entities.ProductEntity;
import design.veracious.cmapi.responses.base.AbstractResponseImpl;

/**
 * Implementation of the response for the /products/:idProduct endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Product
 *
 */
public class ProductGetResponse extends AbstractResponseImpl<ProductEntity> {

	public ProductEntity getProduct() {
		return getData();
	}

	public void setProduct(ProductEntity product) {
		setData(product);
	}

}
