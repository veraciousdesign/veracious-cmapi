package de.artality.cmapi.responses;

/**
 * Implementation of the response for the /productlist endpoint
 * 
 * The response object and the relevant productsfile contains a string which is
 * Base64 encoded. Decoding it returns a binary string that has to be written to
 * an empty file. This file is gzipped and finally needs to be unpacked to
 * retrieve the CSV file having the following columns:
 * 
 * "idProduct","Name","Category ID","Category","Expansion ID","Date Added"
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Productlist
 */
public class ProductsFileResponse extends AbstractResponseImpl<String> {

	protected String mime;

	public ProductsFileResponse() {
	}

	public String getProductsfile() {
		return getData();
	}

	public void setProductsfile(String productsfile) {
		setData(productsfile);
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

}
