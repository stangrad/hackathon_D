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

}
