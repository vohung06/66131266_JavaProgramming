package gh06;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeView {
	public Scene createScene(Stage stage) {
		VBox root = new VBox(20);
		
		Image img = new Image("file:images/logo_home.png");
		ImageView iv = new ImageView(img);
		iv.setFitHeight(80);
		iv.setFitWidth(80);
		
		Label lbTitle = new Label("QUẢN LÝ THƯ VIỆN");
				
		HBox headerBox = new HBox(20);
		headerBox.getChildren().addAll(iv, lbTitle);
		
		Button btnAdd = new Button("  Thêm sách");
		Button btnList = new Button("  Danh sách sách");
		Button btnLogOut = new Button("  Đăng xuất");
		
		HBox btnBox = new HBox(25);
		btnBox.getChildren().addAll(btnAdd, btnList, btnLogOut);
		
		ImageView ivIconAdd = new ImageView(new Image("file:images/icon_add_home.png"));
		ivIconAdd.setFitWidth(30);
		ivIconAdd.setFitHeight(30);
		btnAdd.setGraphic(ivIconAdd);
		
		ImageView ivIconList = new ImageView(new Image("file:images/icon_list_home.png"));
		ivIconList.setFitWidth(30);
		ivIconList.setFitHeight(30);
		btnList.setGraphic(ivIconList);
		
		ImageView ivIconLogOut = new ImageView(new Image("file:images/icon_logout_home.png"));
		ivIconLogOut.setFitWidth(30);
		ivIconLogOut.setFitHeight(30);
		btnLogOut.setGraphic(ivIconLogOut);
		
		
		root.getChildren().addAll(headerBox, btnBox);
		
		//Xử lý sự kiện
		btnAdd.setOnAction(e -> {
			AddBookView addView = new AddBookView();
			stage.setScene(addView.createScene(stage));
			stage.setTitle("Thêm sách");
		});
		
		btnList.setOnAction(e -> {
			BookListView bookListView = new BookListView();
			stage.setScene(bookListView.createScene(stage));
			stage.setTitle("Danh sách sách");
		});
		
		btnLogOut.setOnAction(e -> {
			LoginView homeView = new LoginView();
			stage.setScene(homeView.createScene(stage));
			stage.setTitle("Đăng nhập");
		});
		
		//Chỉnh sửa giao diện		
		lbTitle.setStyle("-fx-font-weight:bold; -fx-text-fill:navy; -fx-font-size: 24px");
		headerBox.setStyle("-fx-background-color: skyblue");
		headerBox.setAlignment(Pos.CENTER);
		btnBox.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(20));
		headerBox.setPadding(new Insets(10));
		btnAdd.setStyle("-fx-background-color: #eeeeee; -fx-text-fill: black; -fx-font-size: 16px; -fx-font-weight: bold;");
		btnList.setStyle("-fx-background-color: #eeeeee; -fx-text-fill: black; -fx-font-size: 16px; -fx-font-weight: bold;");
		btnLogOut.setStyle("-fx-background-color: #eeeeee; -fx-text-fill: black; -fx-font-size: 16px; -fx-font-weight: bold;");
		return new Scene(root, 600, 250);
	}
}
