package gh06;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView {
	public Scene createScene(Stage stage) {
		HBox root = new HBox(20);
		VBox loginBox = new VBox(10);
		
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
		
		loginBox.getChildren().addAll(lbTitle, gPane, btn);
		
		Image img = new Image("file:images/logo.png");
		ImageView iv = new ImageView(img);
		iv.setFitHeight(120);
		iv.setFitWidth(120);
		root.getChildren().addAll(iv, loginBox);
		
		//Chỉnh sửa giao diện
		root.setPadding(new Insets(20));
		lbTitle.setStyle("-fx-font-weight:bold; -fx-text-fill:navy; -fx-font-size: 20px");
		lbName.setStyle("-fx-font-size: 14px");
		lbPass.setStyle("-fx-font-size: 14px");
		tfName.setStyle("-fx-font-size: 14px");
		pfPass.setStyle("-fx-font-size: 14px");
		btn.setStyle("-fx-background-color: navy; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold;");
		return new Scene(root, 500, 350);
	}
}
