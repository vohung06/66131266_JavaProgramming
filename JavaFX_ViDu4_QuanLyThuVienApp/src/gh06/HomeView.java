package gh06;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeView {
	public Scene createScene(Stage stage) {
		VBox root = new VBox(10);
		
		Label lbTitle = new Label("ĐĂNG NHẬP HỆ THỐNG");
		Label lbName = new Label("Tên đăng nhập: ");
		Label lbPass = new Label("Mật khẩu: ");
		
		TextField tfName = new TextField();
		PasswordField pfPass = new PasswordField();
		
		GridPane gPane = new GridPane();
		gPane.setVgap(10);
		gPane.setHgap(10);
		gPane.add(lbName, 0, 0);
		gPane.add(lbPass, 0, 1);
		gPane.add(tfName, 1, 0);
		gPane.add(pfPass, 1, 1);
		
		Button btn = new Button("Đăng nhập");
		
		root.getChildren().addAll(lbTitle, gPane, btn);
		
		
		return new Scene(root, 450, 350);
	}
}
