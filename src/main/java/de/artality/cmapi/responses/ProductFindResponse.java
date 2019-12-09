package de.artality.cmapi.responses;

import java.util.List;

import de.artality.cmapi.entities.ProductEntity;
/**
 * Implementation of the response for the /products/find endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Find_Products
 *
 */
public class FindProductResponse extends AbstractResponseImpl<List<ProductEntity>> {

	public FindProductResponse() {

	}

	public List<ProductEntity> getProduct() {
		return getData();
	}

	public void setProduct(List<ProductEntity> product) {
		setData(product);
	}

}