package gh06;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddBookView {
	public Scene createScene(Stage stage) {
		VBox root = new VBox(15);
		
		Label lbTitle = new Label("THÊM SÁCH MỚI");
		
		GridPane gPane = new GridPane();
		Label lbMa = new Label("Mã sách: ");
		Label lbTen = new Label("Tên sách: ");
		Label lbTheLoai = new Label("Thể loại");
		Label lbTinhTrang = new Label("Tình trạng: ");
		Label lbGhiChu = new Label("Ghi chú: ");
		
		TextField tfMa = new TextField();
		TextField tfTen = new TextField();
		ComboBox<String> cbTheLoai = new ComboBox<>();
		cbTheLoai.getItems().addAll("Tiểu thuyết", "Văn học", "Kinh tế", "Lịch sử", "Ngoại ngữ", "Công nghệ thông tin");
		ToggleGroup tgTinhTrang = new ToggleGroup();
		RadioButton rbCon = new RadioButton("Còn hàng");
		RadioButton rbHet = new RadioButton("Hết hàng");
		rbCon.setToggleGroup(tgTinhTrang);
		rbHet.setToggleGroup(tgTinhTrang);
		HBox hbTinhTrang = new HBox(40);
		hbTinhTrang.getChildren().addAll(rbCon, rbHet);
		TextField tfGhiChu = new TextField();
		
		gPane.add(lbMa, 0, 0);
		gPane.add(lbTen, 0, 1);
		gPane.add(lbTheLoai, 0, 2);
		gPane.add(lbTinhTrang, 0, 3);
		gPane.add(lbGhiChu, 0, 4);
		gPane.add(tfMa, 1, 0);
		gPane.add(tfTen, 1, 1);
		gPane.add(cbTheLoai, 1, 2);
		gPane.add(hbTinhTrang, 1, 3);
		gPane.add(tfGhiChu, 1, 4);
		
		HBox btnBox = new HBox(20);
		Button btn1 = new Button("Lưu");
		Button btn2 = new Button("Quay lại");
		btnBox.getChildren().addAll(btn1, btn2);
		
		root.getChildren().addAll(lbTitle, gPane, btnBox);
		
		//Xử lý sự kiện
		btn1.setOnAction(e -> {
			String ma = tfMa.getText();
			
		});
		return new Scene(root, 600, 400);
	}
}
