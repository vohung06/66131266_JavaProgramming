package gh06;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		LoginView login = new LoginView();
		
		primaryStage.setScene(login.createScene(primaryStage));
		primaryStage.setTitle("Đăng nhập");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
