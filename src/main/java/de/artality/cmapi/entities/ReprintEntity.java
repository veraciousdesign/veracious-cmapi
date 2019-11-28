package de.artality.cmapi.entities;

public class ReprintEntity {
	
	private long idProduct;
	private String expansion;
	private int expansionIcon;
	
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

	public int getExpansionIcon() {
		return expansionIcon;
	}

	public void setExpansionIcon(int expansionIcon) {
		this.expansionIcon = expansionIcon;
	}
	
	

}
