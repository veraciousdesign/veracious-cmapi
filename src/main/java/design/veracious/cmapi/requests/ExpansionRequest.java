package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.ExpansionsResponse;

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
	public ExpansionRequest submit() {
		api.request("GET", "/games/" + idGame + "/expansions");
		return this;
	}

}
