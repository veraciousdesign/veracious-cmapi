package design.veracious.cmapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MoneyDetailsEntity {

	private double totalBalance;
	private double moneyBalance;
	private double bonusBalance;
	private double unpaidAmount;
	private double providerRechargeAmount;
	
	public MoneyDetailsEntity() {
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}

	public double getMoneyBalance() {
		return moneyBalance;
	}

	public void setMoneyBalance(double moneyBalance) {
		this.moneyBalance = moneyBalance;
	}

	public double getBonusBalance() {
		return bonusBalance;
	}

	public void setBonusBalance(double bonusBalance) {
		this.bonusBalance = bonusBalance;
	}

	public double getUnpaidAmount() {
		return unpaidAmount;
	}

	public void setUnpaidAmount(double unpaidAmount) {
		this.unpaidAmount = unpaidAmount;
	}

	public double getProviderRechargeAmount() {
		return providerRechargeAmount;
	}

	public void setProviderRechargeAmount(double providerRechargeAmount) {
		this.providerRechargeAmount = providerRechargeAmount;
	}

}
