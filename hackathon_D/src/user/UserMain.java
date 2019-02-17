package user;

import java.io.IOException;
<<<<<<< HEAD
=======
import java.text.SimpleDateFormat;
import java.util.Calendar;
>>>>>>> refs/remotes/origin/master

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
<<<<<<< HEAD
import user.model.PowerUsage;
=======
import user.view.UserMainScreenController;
import user.model.*;
>>>>>>> refs/remotes/origin/master

public class UserMain extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
<<<<<<< HEAD
=======
	private String dateStamp;
	
<<<<<<< HEAD
	public ObservableList<PowerUsage> powerUseage = FXCollections.observableArrayList();
//..
=======
	public ObservableList<PowerUsage> historicUseage = FXCollections.observableArrayList();
>>>>>>> refs/remotes/origin/master
	
	public PowerProduction powerProduction;
	public PowerUsage powerUsage;
	public UserInfomation userInfomation;
	public UserList me;

	public ObservableList<PowerUsage> historicUsage = FXCollections.observableArrayList();
	
>>>>>>> refs/remotes/origin/master
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
	

	
	//Methods
	public void fetchMe() {
	}


	//Do not touch below
	public String getToday() {
		System.out.println("debug");
		SimpleDateFormat dateFormat  = new SimpleDateFormat("MM dd, YYYY");
		Calendar now = Calendar.getInstance();
		return dateFormat.format(now.getTime());
	}
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	public static void main(String[] args) {
		launch(args);
	}
}
