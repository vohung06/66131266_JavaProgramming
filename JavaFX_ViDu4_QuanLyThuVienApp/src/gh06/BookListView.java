package gh06;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
		
		root.getChildren().addAll(lbTitle, listView, btnBox);
		
		return new Scene(root, 600, 400);
	}
}
