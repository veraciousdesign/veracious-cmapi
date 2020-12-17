package design.veracious.cmapi.requests;

import design.veracious.cmapi.CMApi;
import design.veracious.cmapi.requests.base.AbstractRequestImpl;
import design.veracious.cmapi.responses.GamesResponse;

public class GamesRequest extends AbstractRequestImpl<GamesResponse> {

	public GamesRequest(CMApi api) {
		super(GamesResponse.class, api);
	}

	@Override
	public GamesRequest submit() {
		api.request("GET", "/games");
		return this;
	}

}
