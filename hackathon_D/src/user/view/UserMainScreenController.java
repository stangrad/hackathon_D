package user.view;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import user.UserMain;
import user.model.PowerUsage;
import user.model.Production;
import user.model.UserController;

public class UserMainScreenController {

	public UserMain driver;

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
	private Label id;
	@FXML
	private Label todayDate;

	// private CategoryAxis xAxis;
	// private Axis<Double> yAxis;

	public void initialize() {
		accorPane.setExpandedPane(titledPane1);
		id.setText(UserController.getUser("1530").getId());// Hard code
		getLineChart();
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
						.add(new XYChart.Data<String, Number>(p.getDate(), (Number) p.getPowerAmount()));
			}
			for (PowerUsage u : historicUsage)
			{
				seriesUsage.getData().add(new XYChart.Data<String, Number>(u.getDate(), (Number) (u.getPowerAmount() * 1000)));
			}
//			seriesProduction.setName("History");
			lineChart.getData().add(seriesProduction);
			lineChart.getData().add(seriesUsage);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	// Do not touch below
	public void setAppDriver(UserMain driver) {
		this.driver = driver;
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, YYYY");
		Calendar now = Calendar.getInstance();
		todayDate.setText(dateFormat.format(now.getTime()));
	}
}
