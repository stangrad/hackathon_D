package user.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import user.UserMain;

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
    private BarChart<String, Double> barChart;
	@FXML
    private LineChart<String, Double> lineChart;
	@FXML
	private CategoryAxis xAxisLineChart;
	@FXML
	private CategoryAxis xAxisBarChart;
	@FXML
	private Label todayDate;
	
	XYChart.Series<String, Double> seriesLineChart = new XYChart.Series<>();
	XYChart.Series<String, Double> seriesbarChart = new XYChart.Series<>();
	
	private ObservableList<String> energyLevelLineChartProduction;
	private ObservableList<String> energyLevelLineChartUsage;
	private ObservableList<String> energyLevelBarChart;

	public void initialize() {
		accorPane.setExpandedPane(titledPane1);
		//
	}
	
	public void setAppDriver(UserMain driver)
	{
		this.driver = driver;
		SimpleDateFormat dateFormat  = new SimpleDateFormat("MMMM dd, YYYY");
		Calendar now = Calendar.getInstance();
		todayDate.setText(dateFormat.format(now.getTime()));
	}
}
