package design.veracious.cmapi.requests.base;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.responses.base.AbstractResponseImpl;

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
	public abstract Request<T> submit();

	@Override
	public boolean isSuccess() {
		return (api.getStatus() / 100 == 2);
	}

	@Override
	public String getError() {
		return String.format("%d %s", api.getStatus(), api.getLastError());
	}

	@Override
	public T getResponse() {
		return api.getResponse(clazz);
	}

	@Override
	public int getRemainingRequests() {
		return api.getRemainingRequests();
	}

}
