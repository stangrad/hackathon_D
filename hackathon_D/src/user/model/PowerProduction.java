package user.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PowerProduction {

	String date;
	String hour;
	double powerAmount;
	double price;
	int userId;

	public PowerProduction(String date, String hour, double powerAmount, double price, int userId) {
		this.date = date;
		this.hour = hour;
		this.powerAmount = powerAmount;
		this.price = price;
		this.userId = userId;
	}

//	private void initData() throws FileNotFoundException {..
//		FileReader fr = new FileReader(new File("/res/chargingData.txt"));
//		String line = "8878,01-Jan-2019,00:10:00,0, 3.50 ";..d
//		String[] field = line.split(",");
//		setUserId(Integer.parseInt(field[0]));
//		setDate(field[1]);
//		sethour(field[2]);
//		setPowerAmount(Double.parseDouble(field[3]));
//		setPrice(Double.parseDouble(field[4]));
//	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String gethour() {
		return hour;
	}

	public void sethour(String hour) {
		this.hour = hour;
	}

	public double getPowerAmount() {
		return powerAmount;
	}

	public void setPowerAmount(double powerAmount) {
		this.powerAmount = powerAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "PowerCharging [date=" + date + ", powerAmount=" + powerAmount + ", price=" + price + ", userId="
				+ userId + "]";
	}

}
