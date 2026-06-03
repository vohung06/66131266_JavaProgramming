package gh06;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookListView {
	public Scene createScene(Stage stage) {
		VBox root = new VBox(10);
		
		Label lbTitle = new Label("DANH SÁCH SÁCH");
		
		
		//sử dụng TableView để tạo bảng hiển thị thông tin đẹp

        ListView<String> listView = new ListView<>();

        for (Book b : DataStore.books) {
            String tt = b.isTinhTrang() ? "Còn hàng" : "Hết hàng";

            listView.getItems().add(
                b.getMaSach() + " | " +
                b.getTenSach() + " | " +
                b.getTheLoai() + " | " +
                tt + " | " +
                b.getGhiChu()
            );
        }
		
		HBox btnBox = new HBox(20);
		Button btn1 = new Button("Xoá");
		Button btn2 = new Button("Quay lại");
		btnBox.getChildren().addAll(btn1, btn2);
		
		ImageView ivIconDelete = new ImageView(new Image("file:images/icon_bin_booklist.png"));
		ivIconDelete.setFitWidth(30);
		ivIconDelete.setFitHeight(30);
		btn1.setGraphic(ivIconDelete);
		
		ImageView ivIconBack = new ImageView(new Image("file:images/icon_back_addbook.png"));
		ivIconBack.setFitWidth(30);
		ivIconBack.setFitHeight(30);
		btn2.setGraphic(ivIconBack);
		
		root.getChildren().addAll(lbTitle, listView, btnBox);
		
		//Xử lý sự kiện
		btn1.setOnAction(e -> {
			String selected = listView.getSelectionModel().getSelectedItem();
			listView.getItems().remove(selected);
		});
		
		btn2.setOnAction(e -> {
			HomeView home = new HomeView();
			stage.setScene(home.createScene(stage));
			stage.setTitle("Trang chủ");
		});
					
		//Chỉnh sửa giao diện
		lbTitle.setStyle("-fx-font-weight:bold; -fx-text-fill:navy; -fx-font-size: 24px");
		lbTitle.setMaxWidth(Double.MAX_VALUE);
		lbTitle.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(20));
		btn1.setStyle("-fx-background-color: red; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold;");
		btn2.setStyle("-fx-background-color: #eeeeee; -fx-text-fill: black; -fx-font-size: 16px; -fx-font-weight: bold;");
		root.setStyle("-fx-font-size: 14px");
		btnBox.setAlignment(Pos.CENTER);
		btnBox.setPadding(new Insets(10, 0, 0, 0));
		
		
		return new Scene(root, 600, 400);
	}
}
