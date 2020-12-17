package design.veracious.cmapi.entities;

public class ShippingMethodEntity {

	private int idShippingMethod;
	private String name;
	private double price;
	private boolean isLetter;
	private boolean isInsured;

	public ShippingMethodEntity() {
	}

	public int getIdShippingMethod() {
		return idShippingMethod;
	}

	public void setIdShippingMethod(int idShippingMethod) {
		this.idShippingMethod = idShippingMethod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getIsLetter() {
		return isLetter;
	}

	public void setIsLetter(boolean isLetter) {
		this.isLetter = isLetter;
	}

	public boolean getIsInsured() {
		return isInsured;
	}

	public void setIsInsured(boolean isInsured) {
		this.isInsured = isInsured;
	}

}
