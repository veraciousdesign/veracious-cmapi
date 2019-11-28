package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;
import de.artality.cmapi.responses.AccountResponse;

/**
 * Implementation of the request for the /account endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Account
 */
public class AccountRequest extends AbstractRequestImpl<AccountResponse> {

	public AccountRequest(CMApi api) {
		super(AccountResponse.class, api);
	}

	@Override
	public void submit() {
		api.request("GET", "/account");
	}
}
