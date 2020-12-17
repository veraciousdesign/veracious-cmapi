package design.veracious.cmapi.responses;

import java.util.List;

import design.veracious.cmapi.entities.GameEntity;
import design.veracious.cmapi.responses.base.AbstractResponseImpl;

public class GamesResponse extends AbstractResponseImpl<List<GameEntity>>  {
	
	public List<GameEntity> getGame() {
		return getData();
	}
	
	public void setGame(List<GameEntity> game) {
		setData(game);
	}

}
