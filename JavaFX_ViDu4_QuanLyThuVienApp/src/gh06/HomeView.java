package gh06;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HomeView {
	public Scene createScene(Stage stage) {
		BorderPane root = new BorderPane();
		
		Image img = new Image("file:images/header_home.png");
		ImageView iv = new ImageView(img);
		iv.setFitHeight(80);
		iv.setFitWidth(80);
		
		Label lbTitle = new Label("QUẢN LÝ THƯ VIỆN");
				
		HBox headerBox = new HBox(20);
		headerBox.getChildren().addAll(iv, lbTitle);
		
		Button btnAdd = new Button("Thêm sách");
		Button btnList = new Button("Danh sách sách");
		Button btnLogOut = new Button("Đăng xuất");
		
		HBox btnBox = new HBox(15);
		btnBox.getChildren().addAll(btnAdd, btnList, btnLogOut);
			
		root.setTop(headerBox);
		root.setLeft(btnAdd);
		root.setCenter(btnList);
		root.setRight(btnLogOut);
		
		lbTitle.setStyle("-fx-font-weight:bold; -fx-text-fill:navy; -fx-font-size: 20px");
		return new Scene(root, 500, 350);
	}
}
