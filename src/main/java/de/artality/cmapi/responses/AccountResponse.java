package de.artality.cmapi.responses;

import de.artality.cmapi.models.entities.AccountEntity;

/**
 * Implementation of the response for the /account endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Account
 */
public class AccountResponse extends AbstractResponseImpl<AccountEntity> {

	public AccountResponse() {
	}

	public AccountEntity getAccount() {
		return getData();
	}

	public void setAccount(AccountEntity account) {
		setData(account);
	}

}
