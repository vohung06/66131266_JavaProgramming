package gh06;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox(10); //10 là spacing giữa các phần tử
		
		Label lb1 = new Label("MSSV: ");
		Label lb2 = new Label("Họ và tên: ");
		
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		
		HBox hb1 = new HBox(10);
		HBox hb2 = new HBox(10);
		
		hb1.getChildren().addAll(lb1, tf1);
		hb2.getChildren().addAll(lb2, tf2);
		
		
		HBox hbBtn = new HBox(10);
		Button btn1 = new Button("Thêm");
		Button btn2 = new Button("Xoá");
		
		hbBtn.getChildren().addAll(btn1, btn2);
		
		ListView<String> listView = new ListView<>();
		
		root.getChildren().addAll(hb1, hb2, hbBtn, listView);
		
		btn1.setOnAction(e -> {
			String mssv = tf1.getText();
			String hoTen = tf2.getText();
			String sv = mssv + " - " + hoTen;
			listView.getItems().add(sv);
			tf1.clear();
			tf2.clear();
		});
		

		
		btn2.setOnAction(e -> {
			String selected = listView.getSelectionModel().getSelectedItem();
			listView.getItems().remove(selected);
		});
		
		Scene scn = new Scene(root, 500, 500);
		primaryStage.setTitle("Quản lý sinh viên");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
