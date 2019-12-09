package de.artality.cmapi.responses;

import de.artality.cmapi.entities.ProductEntity;

/**
 * Implementation of the response for the /products/:idProduct endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Product
 *
 */
public class ProductResponse extends AbstractResponseImpl<ProductEntity> {

	public ProductResponse() {

	}

	public ProductEntity getProduct() {
		return getData();
	}

	public void setProduct(ProductEntity product) {
		setData(product);
	}

}
