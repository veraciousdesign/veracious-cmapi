package de.artality.cmapi.requests;

/**
 * Basic abstraction of the requests that are needed for the api calls
 *
 * @param <T> type of the response
 */
public interface Request {

	/**
	 * starts the api request
	 */
	public void submit();

}
