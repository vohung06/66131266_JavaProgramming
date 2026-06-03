package gh06;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BookListView {
	public Scene createScene(Stage stage) {
		VBox root = new VBox(10);
		
		Label lbTitle = new Label("DANH SÁCH SÁCH");
		
		//sử dụng TableView để tạo bảng hiển thị thông tin đẹp
		TableView<Book> table = new TableView<>();
		TableColumn<Book, String> colMa = new TableColumn<>("Mã sách");
		TableColumn<Book, String> colTen = new TableColumn<>("Tên sách");
		TableColumn<Book, String> colTheLoai = new TableColumn<>("Thể loại");
		TableColumn<Book, String> colTinhTrang = new TableColumn<>("Tình trạng");
		TableColumn<Book, String> colGhiChu = new TableColumn<>("Ghi chú");
		//liên kết cột với Book
		colMa.setCellValueFactory(new PropertyValueFactory<>("maSach"));
		colTen.setCellValueFactory(new PropertyValueFactory<>("tenSach"));
		colTheLoai.setCellValueFactory(new PropertyValueFactory<>("theLoai"));
		colTinhTrang.setCellValueFactory(new PropertyValueFactory<>("tinhTrang"));
		colGhiChu.setCellValueFactory(new PropertyValueFactory<>("ghiChu"));
		return null;
	}
}
