package gh06;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
		
		HBox btnBox = new HBox(30);
		Button btn1 = new Button("  Lưu");
		Button btn2 = new Button("  Quay lại");
		btnBox.getChildren().addAll(btn1, btn2);
		
		ImageView ivIconSave = new ImageView(new Image("file:images/icon_save_addbook.png"));
		ivIconSave.setFitWidth(30);
		ivIconSave.setFitHeight(30);
		btn1.setGraphic(ivIconSave);
		
		ImageView ivIconBack = new ImageView(new Image("file:images/icon_back_addbook.png"));
		ivIconBack.setFitWidth(30);
		ivIconBack.setFitHeight(30);
		btn2.setGraphic(ivIconBack);
		
		root.getChildren().addAll(lbTitle, gPane, btnBox);
		
		//Xử lý sự kiện
		btn1.setOnAction(e -> {
			if(tfMa.getText().trim().isEmpty() ||
			   tfTen.getText().trim().isEmpty() ||
			   cbTheLoai.getValue().isEmpty() ||
			   tgTinhTrang.getSelectedToggle() == null ||
			   tfGhiChu.getText().trim().isEmpty()) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setTitle("Thao tác thất bại!");
				alert.setHeaderText(null);
				alert.setContentText("Vui lòng nhập đầy đủ các thông tin.");
				alert.showAndWait();
				return;
			}
			//lấy dữ liệu nhập
			String ma = tfMa.getText();
			String ten = tfTen.getText();
			String theLoai = cbTheLoai.getValue();
			boolean tinhTrang = rbCon.isSelected();
			String ghiChu = tfGhiChu.getText();
			//tạo đối tượng sách mới và thêm vào danh sách sách
			Book book = new Book(ma, ten, theLoai, tinhTrang, ghiChu);
			DataStore.books.add(book);
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
		gPane.setHgap(25);
		gPane.setVgap(20);
		tfMa.setPrefWidth(350);
		tfTen.setPrefWidth(350);
		cbTheLoai.setPrefWidth(350);
		tfGhiChu.setPrefWidth(350);
		btn1.setStyle("-fx-background-color: navy; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold;");
		btn2.setStyle("-fx-background-color: #eeeeee; -fx-text-fill: black; -fx-font-size: 16px; -fx-font-weight: bold;");
		root.setStyle("-fx-font-size: 14px");
		btnBox.setAlignment(Pos.CENTER);
		btnBox.setPadding(new Insets(10, 0, 0, 0));
		return new Scene(root, 600, 400);
	}
}
