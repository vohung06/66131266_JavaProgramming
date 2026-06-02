package gh06;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HomeView {
	public Scene createScene(Stage stage) {
		BorderPane root = new BorderPane();
		
		Label lbTitle = new Label("QUẢN LÝ THƯ VIỆN");
		
		Image img = new Image("file:images/header_home.png");
		ImageView iv = new ImageView(img);
		iv.setFitHeight(150);
		iv.setFitWidth(150);
		
		HBox headerBox = new HBox(20);
		headerBox.getChildren().addAll(lbTitle, iv);
	
		
		return new Scene(root, 500, 350);
	}
}
