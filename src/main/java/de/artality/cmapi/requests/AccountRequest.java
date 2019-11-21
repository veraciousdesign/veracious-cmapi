package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;

public class AccountRequest extends AbstractRequestImpl {

	public AccountRequest(CMApi api) {
		super(api);
	}

	@Override
	public void submit() {
		api.request("GET", "/account");
	}

}
