package user;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import user.model.PowerUsage;

public class UserMain extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	
	public ObservableList<PowerUsage> powerUseage = FXCollections.observableArrayList();

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
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
