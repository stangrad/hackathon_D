package marekt.model;

public class Price {
	String date;

	double totalCurrentPowerProduction;
	double totalMaxPowerProduction;

	double marketPrice;
//d
	public Price(String date, double totalCurrentPowerProduction, double totalMaxPowerProduction, double marketPrice) {
		this.date = date;
		this.totalCurrentPowerProduction = totalCurrentPowerProduction;
		this.totalMaxPowerProduction = totalMaxPowerProduction;
		this.marketPrice = marketPrice;
	}

	public double marketPrice() {
		marketPrice = 3.85 - (getTotalCurrentPowerProduction() / getTotalMaxPowerProduction() * 0.77);
		return marketPrice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getTotalCurrentPowerProduction() {
		return totalCurrentPowerProduction;
	}

	public void setTotalCurrentPowerProduction(double totalCurrentPowerProduction) {
		this.totalCurrentPowerProduction = totalCurrentPowerProduction;
	}

	public double getTotalMaxPowerProduction() {
		return totalMaxPowerProduction;
	}

	public void setTotalMaxPowerProduction(double totalMaxPowerProduction) {
		this.totalMaxPowerProduction = totalMaxPowerProduction;
	}

	@Override
	public String toString() {
		return "Price [date=" + date + ", totalCurrentPowerProduction=" + totalCurrentPowerProduction
				+ ", totalMaxPowerProduction=" + totalMaxPowerProduction + ", marketPrice=" + marketPrice + "]";
	}

	
	
}
