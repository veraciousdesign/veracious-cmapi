package de.artality.cmapi.requests.base;

import de.artality.cmapi.responses.base.AbstractResponseImpl;

/**
 * Basic abstraction of the requests that are needed for the api calls
 *
 * @param <T> type of the response
 */
public interface Request<T extends AbstractResponseImpl<?>> {

	/**
	 * Starts the API call
	 */
	public Request<T> submit();

	/**
	 * Returns if the last API call was successful. A successful call has a Status
	 * Code of 2xx.
	 * 
	 * @return <b>boolean</b>
	 */
	public boolean isSuccess();

	/**
	 * Returns the Error Message of the last API call.
	 * 
	 * @return <b>String</b>
	 */
	public String getError();

	/**
	 * Returns the Response from the last API call
	 * 
	 * @return T
	 */
	public T getResponse();

	/**
	 * Returns the amount of api calls you have left in the current timeframe
	 * (usually the current day)
	 * 
	 * @return <b>int</b>
	 */
	public int getRemainingRequests();

}
