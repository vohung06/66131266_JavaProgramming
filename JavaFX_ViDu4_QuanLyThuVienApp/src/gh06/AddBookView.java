package gh06;

import javafx.scene.Scene;
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
		ToggleGroup tGroup = new ToggleGroup();
		RadioButton rbCon = new RadioButton("Còn hàng");
		RadioButton rbHet = new RadioButton("Hết hàng");
		rbCon.setToggleGroup(tGroup);
		rbHet.setToggleGroup(tGroup);
		TextField tfGhiChu = new TextField();
		
		
		
		return null;
	}
}
