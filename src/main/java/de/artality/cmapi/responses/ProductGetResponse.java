package de.artality.cmapi.responses;

import de.artality.cmapi.entities.ProductEntity;
import de.artality.cmapi.responses.base.AbstractResponseImpl;

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
