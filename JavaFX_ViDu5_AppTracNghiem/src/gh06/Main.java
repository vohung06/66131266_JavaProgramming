package gh06;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox(20);
		Label lbQues = new Label();
	
		RadioButton rb1 = new RadioButton();
		RadioButton rb2 = new RadioButton();
		RadioButton rb3 = new RadioButton();
		RadioButton rb4 = new RadioButton();
		
		ToggleGroup tg = new ToggleGroup();
		rb1.setToggleGroup(tg);
		rb1.setToggleGroup(tg);
		rb1.setToggleGroup(tg);
		rb1.setToggleGroup(tg);
		rb1.setToggleGroup(tg);
		
		HBox btnBox = new HBox(25);
		Button btn1 = new Button("Kiểm tra");
		Button btn2 = new Button("Câu tiếp theo");
		Button btn3 = new Button("Thoát");
		btnBox.getChildren().addAll(btn1, btn2, btn3);
		
		root.getChildren().addAll(lbQues, rb1, rb2, rb3, rb4, btnBox);
		
		Scene scn = new Scene(root, 500, 300);
		primaryStage.setTitle("App trắc nghiệm");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
