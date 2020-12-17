package design.veracious.cmapi.entities;

import java.util.List;

public class GameEntity {

	private int idGame;
	private String name;
	private String abbreviation;
	private List<LinkEntity> links;

	public GameEntity(int idGame, String name, String abbreviation, List<LinkEntity> links) {
		super();
		this.idGame = idGame;
		this.name = name;
		this.abbreviation = abbreviation;
		this.links = links;
	}

	public GameEntity() {

	}

	public int getIdGame() {
		return idGame;
	}

	public void setIdGame(int idGame) {
		this.idGame = idGame;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public List<LinkEntity> getLinks() {
		return links;
	}

	public void setLinks(List<LinkEntity> links) {
		this.links = links;
	}

}
