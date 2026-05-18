package gh06;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleCalculator {
	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		
		tfNumber1.setPrefColumnCount(3);
		tfNumber2.setPrefColumnCount(3);
		tfResult.setPrefColumnCount(3);
		
		pane.getChildren().addAll(new Label("Number 1"), tfNumber1, new Label("Number 2"), tfNumber2, new Label("Result: "), tfResult);
		
		HBox hBox = new HBox(5);
		Button btAdd = new Button("Add");
		Button btSub = new Button("Subtract");
		Button btMul = new Button("Multioly");
		Button btDiv = new Button("Divide");
	}
}
