package de.artality.cmapi.requests;

import de.artality.cmapi.CMApi;
import de.artality.cmapi.responses.ExpansionsResponse;

/**
 * Implementation of the request for the /games/:idGame/expansions endpoint
 * 
 * @see https://api.cardmarket.com/ws/documentation/API_2.0:Expansions
 */
public class ExpansionRequest extends AbstractRequestImpl<ExpansionsResponse> {

	private int idGame;

	public ExpansionRequest(CMApi api, int idGame) {
		super(ExpansionsResponse.class, api);
		this.idGame = idGame;
	}

	@Override
	public void submit() {
		api.request("GET", "/games/" + idGame + "/expansions");
	}

}
