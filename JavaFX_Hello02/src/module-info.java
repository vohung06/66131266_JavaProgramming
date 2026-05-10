module JavaFX_Hello02 {
	requires javafx.controls;
	
	opens gh06 to javafx.graphics, javafx.fxml;
}
