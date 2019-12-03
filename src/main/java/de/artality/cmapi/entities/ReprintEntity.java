package de.artality.cmapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReprintEntity {

	private long idProduct;
	private String expansion;
	private int expIcon;

	public ReprintEntity() {
	}

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}

	public String getExpansion() {
		return expansion;
	}

	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}

	public int getExpIcon() {
		return expIcon;
	}

	public void setExpIcon(int expIcon) {
		this.expIcon = expIcon;
	}

}
