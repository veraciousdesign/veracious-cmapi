package design.veracious.cmapi.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpansionEntity {

	private int idExpansion;
	private String enName;
	private List<LocalizationEntity> localization;
	private String abbreviation;
	private int icon;
	private Date releaseDate;
	private boolean isReleased;
	private int idGame;
	private List<LinkEntity> links;

	public ExpansionEntity(int idExpansion, int idGame, String enName, String abbreviation, Date releaseDate) {
		this.idExpansion = idExpansion;
		this.idGame = idGame;
		this.enName = enName;
		this.abbreviation = abbreviation;
		this.releaseDate = releaseDate;
	}

	public ExpansionEntity() {
	}

	public int getIdExpansion() {
		return idExpansion;
	}

	public void setIdExpansion(int idExpansion) {
		this.idExpansion = idExpansion;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public List<LocalizationEntity> getLocalization() {
		return localization;
	}

	public void setLocalization(List<LocalizationEntity> localization) {
		this.localization = localization;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isReleased() {
		return isReleased;
	}

	public void setReleased(boolean isReleased) {
		this.isReleased = isReleased;
	}

	public int getIdGame() {
		return idGame;
	}

	public void setIdGame(int idGame) {
		this.idGame = idGame;
	}

	public List<LinkEntity> getLinks() {
		return links;
	}

	public void setLinks(List<LinkEntity> links) {
		this.links = links;
	}

}
