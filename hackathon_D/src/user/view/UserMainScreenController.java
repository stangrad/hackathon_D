package user.view;

import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.TitledPane;

public class UserMainScreenController {
	@FXML
	private Accordion accorPane;
	@FXML
	private TitledPane titledPane1;
	@FXML
	private TitledPane titledPane2;
	@FXML
	private TitledPane titledPane3;
	
	public void initialize() {
		accorPane.setExpandedPane(titledPane1);
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
}
