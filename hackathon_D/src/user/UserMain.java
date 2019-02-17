package user;

import java.io.IOException;
<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.util.Calendar;
=======
import user.model.PowerUsage;
>>>>>>> branch 'master' of https://github.com/stangrad/hackathon_D

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
<<<<<<< HEAD
import user.model.PowerProduction;
import user.model.PowerUsage;
import user.model.Production;
import user.model.UserInfomation;
import user.model.UserList;
import user.view.UserMainScreenController;
=======
<<<<<<< HEAD
import user.model.PowerUsage;
=======
import user.model.*;
>>>>>>> branch 'master' of https://github.com/stangrad/hackathon_D.git
>>>>>>> branch 'master' of https://github.com/stangrad/hackathon_D

public class UserMain extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private String dateStamp;
	
	public ObservableList<PowerUsage> historicUseage = FXCollections.observableArrayList();
	
	public PowerProduction powerProduction;
	public PowerUsage powerUsage;
	public Production production;
	public UserInfomation userInfomation;
	public UserList userList;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Energy Market Manager");

		initRootLayout();
		showMainScreen();
	}

	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(UserMain.class.getResource("view/UserRootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showMainScreen() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(UserMain.class.getResource("view/UserMainScreen.fxml"));
			AnchorPane personOverview = (AnchorPane) loader.load();
			rootLayout.setCenter(personOverview);
			UserMainScreenController controller = loader.getController();
			controller.setAppDriver(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setDateStamp() {
		SimpleDateFormat format  = new SimpleDateFormat("MM dd, YYYY");
		Calendar now = Calendar.getInstance();
		this.dateStamp = format.format(now.getTime());
	}
	
	public String getDatestamp() {
		return dateStamp;
	}
	
	public void loadHistoricUsage() {
//		dddsss
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
