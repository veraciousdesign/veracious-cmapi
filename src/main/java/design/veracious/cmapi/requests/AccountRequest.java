package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.AccountResponse;

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
	public AccountRequest submit() {
		api.request("GET", "/account");
		return this;
	}
}
