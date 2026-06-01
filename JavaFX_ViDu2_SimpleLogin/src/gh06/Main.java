package gh06;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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
		
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(400, 200);
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.add(text1, 0, 0);
		gridPane.add(tf1, 1, 0);
		gridPane.add(text2, 0, 1);
		gridPane.add(tf2, 1, 1);
		gridPane.add(button1, 0, 2);
		gridPane.add(button2, 1, 2);
		
		button1.setStyle("-fx-background-color: darkslateblue; -fx");
		button2.setStyle("-fx-background-color: darkslateblue; -fx");
		text1.setStyle("-fx-font: normal bold 20px 'serif' ");
		text2.setStyle("-fx-font: normal bold 20px 'serif' ");
		gridPane.setStyle("-fx-background-color: BEIGE;");
		
		Scene scn = new Scene(gridPane);
		primaryStage.setTitle("Login");
		primaryStage.setScene(scn);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
