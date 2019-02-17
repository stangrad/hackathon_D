package user.view;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;
import user.UserMain;

public class UserMainScreenController {

	UserMain driver;

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
	
	XYChart.Series<String, Double> seriesLineChart = new XYChart.Series<>();
	XYChart.Series<String, Double> seriesbarChart = new XYChart.Series<>();
	
	private ObservableList<String> energyLevelLineChartProduction;
	private ObservableList<String> energyLevelLineChartUsage;
	private ObservableList<String> energyLevelBarChart;

	public void initialize() {
		accorPane.setExpandedPane(titledPane1);
	}
	
	public void getLineChart() {
	}
	
	public void getBarChart() {
		
	}

	/*
	public static ArrayList<PowerUsage> loadHistoricUsage(int userId) throws IOException
    {
        ArrayList<PowerUsage> historicUsage = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("res/HistoricUsage.txt"));
        String line = br.readLine();
        line = br.readLine();
        while(line != null)
        {
            String[] column = line.split(",");
            if (Integer.parseInt(column[0]) == userId)
                historicUsage.add(new PowerUsage(Integer.parseInt(column[0]), column[1], column[2], Double.parseDouble(column[3]), Double.parseDouble(column[4])));

            line = br.readLine();
        }
        br.close();
        return historicUsage;
    }
    */
	
	public void setAppDriver(UserMain driver)
	{
		this.driver = driver;
	}
}
