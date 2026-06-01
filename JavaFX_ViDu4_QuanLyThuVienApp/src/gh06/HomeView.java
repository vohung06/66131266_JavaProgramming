package gh06;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeView {
	public Scene createScene(Stage stage) {
		VBox root = new VBox();
		return new Scene(root, 500, 350);
	}
}
