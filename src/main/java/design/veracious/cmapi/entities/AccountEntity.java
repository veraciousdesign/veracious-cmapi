package design.veracious.cmapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountEntity {

	private long idUser;
	private String username;
	private String country;

	// 0: private user
	// 1: commercial user
	// 2: powerseller
	private int isCommercial;

	private boolean maySell;

	// 0: no seller activation
	// 1: seller activation requested, but transfers still pending
	// 2: transfers for requests processed
	// 3: activated seller
	private int sellerActivation;

	// 0: no risk
	// 1: low risk
	// 2: high risk
	private int riskGroup;

	private String lossPercentage;

	// 0: not enough sells to rate
	// 1: outstanding seller
	// 2: very good seller
	// 3: good seller
	// 4: average seller
	// 5: bad seller
	private int reputation;

	// 0: normal shipping speed
	// 1: ships very fast
	// 2: ships fast
	private int shipsFast;

	private int sellCount;
	private int soldItems;
	private int avgShippingTime;
	private boolean onVacation;

	// 1: English
	// 2: French
	// 3: German
	// 4: Spanish
	// 5: Italian
	private int idDisplayLanguage;

	private NameEntity name;
	private AddressEntity homeAddress;
	private String email;
	private String phoneNumber;
	private String vat;
	private String legalInformation;
	private String registerDate;
	private boolean isActivated;

	private MoneyDetailsEntity moneyDetails;
	private BankDetailsEntity bankAccount;

	private int articlesInShoppingCart;
	private int unreadMessages;

	public AccountEntity() {
	}

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getIsCommercial() {
		return isCommercial;
	}

	public void setIsCommercial(int isCommercial) {
		this.isCommercial = isCommercial;
	}

	public boolean isMaySell() {
		return maySell;
	}

	public void setMaySell(boolean maySell) {
		this.maySell = maySell;
	}

	public int getSellerActivation() {
		return sellerActivation;
	}

	public void setSellerActivation(int sellerActivation) {
		this.sellerActivation = sellerActivation;
	}

	public int getRiskGroup() {
		return riskGroup;
	}

	public void setRiskGroup(int riskGroup) {
		this.riskGroup = riskGroup;
	}

	public String getLossPercentage() {
		return lossPercentage;
	}

	public void setLossPercentage(String lossPercentage) {
		this.lossPercentage = lossPercentage;
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

	public int getAvgShippingTime() {
		return avgShippingTime;
	}

	public void setAvgShippingTime(int avgShippingTime) {
		this.avgShippingTime = avgShippingTime;
	}

	public boolean isOnVacation() {
		return onVacation;
	}

	public void setOnVacation(boolean onVacation) {
		this.onVacation = onVacation;
	}

	public int getIdDisplayLanguage() {
		return idDisplayLanguage;
	}

	public void setIdDisplayLanguage(int idDisplayLanguage) {
		this.idDisplayLanguage = idDisplayLanguage;
	}

	public NameEntity getName() {
		return name;
	}

	public void setName(NameEntity name) {
		this.name = name;
	}

	public AddressEntity getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(AddressEntity homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getLegalInformation() {
		return legalInformation;
	}

	public void setLegalInformation(String legalInformation) {
		this.legalInformation = legalInformation;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public MoneyDetailsEntity getMoneyDetails() {
		return moneyDetails;
	}

	public void setMoneyDetails(MoneyDetailsEntity moneyDetails) {
		this.moneyDetails = moneyDetails;
	}

	public BankDetailsEntity getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankDetailsEntity bankAccount) {
		this.bankAccount = bankAccount;
	}

	public int getArticlesInShoppingCart() {
		return articlesInShoppingCart;
	}

	public void setArticlesInShoppingCart(int articlesInShoppingCart) {
		this.articlesInShoppingCart = articlesInShoppingCart;
	}

	public int getUnreadMessages() {
		return unreadMessages;
	}

	public void setUnreadMessages(int unreadMessages) {
		this.unreadMessages = unreadMessages;
	}

}
