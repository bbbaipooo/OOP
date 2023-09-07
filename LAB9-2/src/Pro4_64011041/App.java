package Pro4_64011041;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class App extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override 
	public void start(Stage primaryStage) {
		CarPane pane = new CarPane();

		pane.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				pane.pause();
			}
		});
		pane.setOnMouseReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				pane.play();
			}
		});

		pane.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent e) {
				if (e.getCode() == KeyCode.RIGHT) {
					pane.increaseSpeed();
				} else if (e.getCode() == KeyCode.LEFT) {
					pane.decreaseSpeed();
				}
			}
		});

		Scene scene = new Scene(pane, 600, 100);
		primaryStage.setTitle("PA PA PASTEL CAR/>0</"); 
		primaryStage.setScene(scene);
		primaryStage.show(); 

		pane.requestFocus(); 
	}
}