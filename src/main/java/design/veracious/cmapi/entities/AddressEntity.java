package design.veracious.cmapi.entities;

import java.beans.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressEntity {

	private String name;
	private String extra;
	private String street;
	private String zip;
	private String city;
	private String country;

	public AddressEntity() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Transient
	public String getVorname() {
		try {
			return getName().split(" ")[0];
		} catch (Exception e) {
			return "";
		}
	}

	@Transient
	public String getNachname() {
		try {
			return getName().split(" ")[1];
		} catch (Exception e) {
			return "";
		}
	}

	@Transient
	public String getCountryISO() {
		return "D".equals(getCountry()) ? "DE" : getCountry();
	}

}
