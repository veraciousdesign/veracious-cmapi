package de.artality.cmapi.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceGuideEntity {

	// SELL: Average price of articles ever sold of this product
	private double sell;
	// LOW: Current lowest non-foil price (all conditions)
	private double low;
	// LOWEX+: Current lowest non-foil price (condition EX and better)
	private double lowEx;
	// LOWFOIL: Current lowest foil price
	private double lowFoil;
	// AVG: Current average non-foil price of all available articles of this product
	private double avg;
	// TREND: Current trend price
	private double trend;
	// TRENDFOIL: Current foil trend price
	private double trendFoil;

	public PriceGuideEntity() {
	}

	@JsonProperty("SELL")
	public double getSell() {
		return sell;
	}

	public void setSell(double sell) {
		this.sell = sell;
	}

	@JsonProperty("LOW")
	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	@JsonProperty("LOWEX")
	public double getLowEx() {
		return lowEx;
	}

	public void setLowEx(double lowEx) {
		this.lowEx = lowEx;
	}

	@JsonProperty("LOWFOIL")
	public double getLowFoil() {
		return lowFoil;
	}

	public void setLowFoil(double lowFoil) {
		this.lowFoil = lowFoil;
	}

	@JsonProperty("AVG")
	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@JsonProperty("TREND")
	public double getTrend() {
		return trend;
	}

	public void setTrend(double trend) {
		this.trend = trend;
	}

	@JsonProperty("TRENDFOIL")
	public double getTrendFoil() {
		return trendFoil;
	}

	public void setTrendFoil(double trendFoil) {
		this.trendFoil = trendFoil;
	}

}
