package de.artality.cmapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimpleExpansionEntity {
	
	private long idExpansion;
	private String enName;
	private int expansionIcon;

	public long getIdExpansion() {
		return idExpansion;
	}

	public void setIdExpansion(long idExpansion) {
		this.idExpansion = idExpansion;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public int getExpansionIcon() {
		return expansionIcon;
	}

	public void setExpansionIcon(int expansionIcon) {
		this.expansionIcon = expansionIcon;
	}

}
