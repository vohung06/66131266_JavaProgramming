package gh06;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Text text1 = new Text("Email");
		Text text2 = new Text("Password");
		
		TextField tf1 = new TextField();
		PasswordField tf2 = new PasswordField();
		
		Button button1 = new Button("Submit");
		Button button2 = new Button("Clear");
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
