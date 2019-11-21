package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;

/**
 * Abstract implementation of the request interface that contains all the common
 * functionality of all possible requests.
 */
public abstract class AbstractRequestImpl implements Request {

	protected CMApi api;

	public AbstractRequestImpl(CMApi api) {
		this.api = api;
	}

	@Override
	public abstract void submit();

}
