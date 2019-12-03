package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;
import de.artality.cmapi.responses.AbstractResponseImpl;
import de.artality.cmapi.utils.Headers;

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

	@Override
	public T getResponse() {
		return api.getResponse(clazz);
	}

	@Override
	public int getRequestsLeft() {
		try {
			int reqCount = Integer.valueOf(api.getHeader(Headers.REQUEST_COUNT));
			int reqMax = Integer.valueOf(api.getHeader(Headers.REQUEST_MAX));
			return reqMax - reqCount;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public abstract void submit();

}
