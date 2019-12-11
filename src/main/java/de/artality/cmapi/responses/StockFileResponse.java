package de.artality.cmapi.responses;

import de.artality.cmapi.responses.base.AbstractResponseImpl;

/**
 * Implementation of the response for the /stock/file endpoint
 * 
 * The response object and the relevant stock contains a string which is Base64
 * encoded. Decoding it returns a binary string that has to be written to an
 * empty file. This file is gzipped and finally needs to be unpacked to retrieve
 * the CSV file having the following columns:
 * 
 * idProduct    - The product ID of the article 
 * English Name - The English name of the article 
 * Local Name   - The localized name specified by the idLanguage query parameter 
 * Exp.         - The abbreviation for the expansion the product belongs to
 * Price        - The price the article is listed for 
 * Language     - The language of the article is
 * Attribute    - Number of additional attribute fields depending on the game the article is from 
 * comments     - Own comment for the article 
 * amount       - number of listed articles
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Stock_File
 */
public class StockFileResponse extends AbstractResponseImpl<String> {

	protected String mime;

	public String getStock() {
		return getData();
	}

	public void setStock(String stock) {
		setData(stock);
	}

	public String getMime() {
		return mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

}
