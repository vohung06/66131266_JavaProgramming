package application;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		
		tfNumber1.setPrefColumnCount(3);
		tfNumber2.setPrefColumnCount(3);
		tfResult.setPrefColumnCount(3);
		
		pane.getChildren().addAll(new Label("Number 1: "), tfNumber1, new Label("Number 2: "), tfNumber2, new Label("Result: "), tfResult);
		
		HBox hBox = new HBox(5);
		Button btAdd = new Button("Add");
		Button btSub = new Button("Subtract");
		Button btMul = new Button("Multiply");
		Button btDiv = new Button("Divide");
		
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(btAdd, btSub, btMul, btDiv);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		
		Scene scn = new Scene(borderPane, 350, 150);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
