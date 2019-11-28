package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;
import de.artality.cmapi.responses.AbstractResponseImpl;

/**
 * Abstract implementation of the request interface that contains all the common
 * functionality of all possible requests.
 */
public abstract class AbstractRequestImpl<T extends AbstractResponseImpl<?>> implements Request<T> {

	protected Class<T> clazz;
	protected CMApi api;

	public AbstractRequestImpl(Class<T> clazz, CMApi api) {
		this.clazz = clazz;
		this.api = api;
	}

	/**
	 * Returns the Response object for the Request
	 * 
	 * @return <b>T</b>
	 */
	public T getResponse() {
		return api.getResponse(clazz);
	}

	@Override
	public abstract void submit();

}
