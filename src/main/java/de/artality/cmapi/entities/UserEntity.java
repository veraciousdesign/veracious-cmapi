package de.artality.cmapi.entities;

import java.sql.Date;
import java.util.List;

public class UserEntity {

	private int idUser;

	private String username;

	private Date registrationDate;

	// 0: private user
	// 1: commercial user
	// 2: powerseller
	private int isCommercial;

	private boolean isSeller;

	private NameEntity name;
	private AddressEntity address;
	private String phone;
	private String email;

	private String vat;

	// 0: no risk
	// 1: low risk
	// 2: high risk
	private int riskGroup;

	// 0: not enough sells to rate
	// 1: outstanding seller
	// 2: very good seller
	// 3: good seller
	// 4: average seller
	// 5: bad seller
	private int reputation;

	private int shipsFast;
	private int sellCount;
	private int soldItems;

	private double avgShippingTime;

	private boolean onVacation;

	private List<LinkEntity> links;

	public UserEntity() {
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getIsCommercial() {
		return isCommercial;
	}

	public void setIsCommercial(int isCommercial) {
		this.isCommercial = isCommercial;
	}

	public boolean isSeller() {
		return isSeller;
	}

	public void setSeller(boolean isSeller) {
		this.isSeller = isSeller;
	}

	public NameEntity getName() {
		return name;
	}

	public void setName(NameEntity name) {
		this.name = name;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public int getRiskGroup() {
		return riskGroup;
	}

	public void setRiskGroup(int riskGroup) {
		this.riskGroup = riskGroup;
	}

	public int getReputation() {
		return reputation;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

	public int getShipsFast() {
		return shipsFast;
	}

	public void setShipsFast(int shipsFast) {
		this.shipsFast = shipsFast;
	}

	public int getSellCount() {
		return sellCount;
	}

	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}

	public int getSoldItems() {
		return soldItems;
	}

	public void setSoldItems(int soldItems) {
		this.soldItems = soldItems;
	}

	public double getAvgShippingTime() {
		return avgShippingTime;
	}

	public void setAvgShippingTime(double avgShippingTime) {
		this.avgShippingTime = avgShippingTime;
	}

	public boolean isOnVacation() {
		return onVacation;
	}

	public void setOnVacation(boolean onVacation) {
		this.onVacation = onVacation;
	}

	public List<LinkEntity> getLinks() {
		return links;
	}

	public void setLinks(List<LinkEntity> links) {
		this.links = links;
	}

}
