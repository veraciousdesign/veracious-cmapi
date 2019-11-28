package de.artality.cmapi.requests;

import de.artality.cmapi.responses.AbstractResponseImpl;

/**
 * Basic abstraction of the requests that are needed for the api calls
 *
 * @param <T> type of the response
 */
public interface Request<T extends AbstractResponseImpl<?>> {

	/**
	 * starts the api request
	 */
	public void submit();

	/**
	 * returns the response from the api call
	 * 
	 * @return T
	 */
	public abstract T getResponse();

}
