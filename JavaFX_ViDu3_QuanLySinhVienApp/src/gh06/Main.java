package gh06;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
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
		
		GridPane grid = new GridPane();
		grid.add(lb1, 0, 0);
		grid.add(tf1, 1, 0);
		grid.add(lb2, 0, 1);
		grid.add(tf2, 1, 1);
		
		HBox hbBtn = new HBox(15);
		Button btn1 = new Button("Thêm");
		Button btn2 = new Button("Xoá");
		
		hbBtn.getChildren().addAll(btn1, btn2);
		
		ListView<String> listView = new ListView<>();
		
		root.getChildren().addAll(grid, hbBtn, listView);
		
		btn1.setOnAction(e -> {
			//xử lí trường hợp rỗng trước khi thêm
			if(tf1.getText().trim().isEmpty() || tf2.getText().trim().isEmpty()) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Không được để trống!");
				alert.setHeaderText(null);
				alert.setContentText("Vui lòng nhập đầy đủ mã số sinh viên và họ tên.");
				alert.showAndWait();
				return;
			}
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
		
		//chỉnh sửa giao diện
		root.setPadding(new Insets(15));
		grid.setHgap(15);
		grid.setVgap(10);
		tf1.setPrefWidth(300);
		lb1.setStyle("-fx-font-weight:bold");
		tf2.setPrefWidth(300);
		lb2.setStyle("-fx-font-weight:bold");
		hbBtn.setAlignment(Pos.CENTER);
		btn1.setPrefWidth(100);
		btn2.setPrefWidth(100);
		btn1.setStyle("-fx-font-weight:bold; -fx-background-color: green");
		btn2.setStyle("-fx-font-weight:bold; -fx-background-color: red");
		
		Scene scn = new Scene(root, 500, 500);
		primaryStage.setTitle("Quản lý sinh viên");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
