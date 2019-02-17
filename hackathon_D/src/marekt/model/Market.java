package marekt.model;

import java.util.ArrayList;

public class Market {

	String date;
	String hour;
	double totalMaxPowerProduction;
	double totalCurrentPowerProduction;
	double marketPrice;

	public Market(String date, String hour, double totalMaxPowerProduction, double totalCurrentPowerProduction,
			double marketPrice) {
		super();
		this.date = date;
		this.hour = hour;
		this.totalMaxPowerProduction = totalMaxPowerProduction;
		this.totalCurrentPowerProduction = totalCurrentPowerProduction;
		this.marketPrice = marketPrice;
	}

	public ArrayList<Price> getHistoryPrice() {
		ArrayList<Price> historyPrice = new ArrayList<Price>();
		historyPrice.add(new Price(date, totalCurrentPowerProduction, totalMaxPowerProduction, marketPrice));
		return historyPrice;
	}

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public double getTotalMaxPowerProduction() {
		return totalMaxPowerProduction;
	}

	public void setTotalMaxPowerProduction(double totalMaxPowerProduction) {
		this.totalMaxPowerProduction = totalMaxPowerProduction;
	}

	public double getTotalCurrentPowerProduction() {
		return totalCurrentPowerProduction;
	}

	public void setTotalCurrentPowerProduction(double totalCurrentPowerProduction) {
		this.totalCurrentPowerProduction = totalCurrentPowerProduction;
	}

	@Override
	public String toString() {
		return "Market [date=" + date + ", hour=" + hour + ", totalMaxPowerProduction=" + totalMaxPowerProduction
				+ ", totalCurrentPowerProduction=" + totalCurrentPowerProduction + "]";
	}

}
