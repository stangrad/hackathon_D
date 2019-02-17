package user.view;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.shape.Rectangle;
import user.UserMain;
import user.model.PowerUsage;
import user.model.Production;
import user.model.User;
import user.model.UserController;

public class UserMainScreenController {

	public UserMain driver;
	public User user;

	@FXML
	private Accordion accorPane;
	@FXML
	private TitledPane titledPane1;
	@FXML
	private TitledPane titledPane2;
	@FXML
	private TitledPane titledPane3;
	@FXML
	private LineChart<String, Number> lineChart;
	@FXML
	private BarChart<String, Number> barChart;
	@FXML
	private Label id;
	@FXML
	private Label todayDate;
	@FXML
	private Rectangle barUsage;
	@FXML
	private Rectangle barProduction;

	// private CategoryAxis xAxis;
	// private Axis<Double> yAxis;

	public void initialize() {
		accorPane.setExpandedPane(titledPane1);
		id.setText(UserController.getUser("1530").getId());// Hard code
		getLineChart();

		instantiateUser();
		getBarChart();
	}

	public void getLineChart() {
		lineChart.getData().clear();
		XYChart.Series<String, Number> seriesProduction = new XYChart.Series<String, Number>();
		XYChart.Series<String, Number> seriesUsage = new XYChart.Series<String, Number>();

		ArrayList<Production> historicProduction = new ArrayList<>();
		ArrayList<PowerUsage> historicUsage = new ArrayList<>();
		try {
			historicProduction = UserController.getHistoricProduction("8878");
			historicUsage = UserController.getHistoricUsage("8878");
			for (Production p : historicProduction) {
				seriesProduction.getData()
						.add(new XYChart.Data<String, Number>(p.getDate(), (Number) (p.getPowerAmount() * 100)));
			}
			for (PowerUsage u : historicUsage) {
				seriesUsage.getData()
						.add(new XYChart.Data<String, Number>(u.getDate(), (Number) (u.getPowerAmount() * 1000)));
			}
			// seriesProduction.setName("History");
			lineChart.getData().add(seriesProduction);
			lineChart.getData().add(seriesUsage);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void instantiateUser() {
		this.user = new User();
	}

	public void getBarChart() {
		Random rand = new Random();
		/*
		barChart.getData().clear();

		barChart.setTitle("Realtime Monitor");

		Thread thread = new Thread(new Runnable() {

			public void run() {
				while (true) {
					barChart.getData().clear();
					final XYChart.Series<String, Number> seriesProduction = new XYChart.Series<>();
					final XYChart.Series<String, Number> seriesUsage = new XYChart.Series<>();
					seriesProduction.getData().add(new XYChart.Data<String, Number>("Production", rand.nextInt(50)));
					seriesUsage.getData().add(new XYChart.Data<String, Number>("Usage", rand.nextInt(200)));

					barChart.getData().add(seriesProduction);
					barChart.getData().add(seriesUsage);
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("loop done");
				}
			}

		});
		thread.start();
		*/
		Thread thread = new Thread(new Runnable() {

			public void run() {
				while (true) {
					barChart.getData().clear();
					barUsage.setHeight(0);
					barUsage.setHeight(barUsage.getHeight() + rand.nextInt(100));
					barProduction.setHeight(0);
					barProduction.setHeight(barProduction.getHeight() + rand.nextInt(100));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});
		thread.start();
	}

	// Do not touch below
	public void setAppDriver(UserMain driver) {
		this.driver = driver;
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, YYYY");
		Calendar now = Calendar.getInstance();
		todayDate.setText(dateFormat.format(now.getTime()));
	}
}
