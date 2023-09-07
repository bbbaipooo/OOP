package Pro1_64011041;
// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.image.*;
// import javafx.scene.layout.*;
// import javafx.stage.*;

// public class App extends Application {
//     public static void main(String[] args) {
//         Application.launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) throws Exception {
//         GridPane grid = new GridPane();

//         ImageView photo1 = new ImageView(new Image("D:/KMITL/year1/term2/OOP/LAB9-2/src/Pro1_64011041/Peppa_Pig1.png"));
//         photo1.setFitWidth(300);
//         photo1.setFitHeight(200);
//         grid.add(photo1, 0, 0);

//         ImageView photo2 = new ImageView(new Image("D:/KMITL/year1/term2/OOP/LAB9-2/src/Pro1_64011041/Peppa_Pig2.png"));
//         photo2.setFitWidth(300);
//         photo2.setFitHeight(200);
//         grid.add(photo2, 1, 0);

//         ImageView photo3 = new ImageView(new Image("D:/KMITL/year1/term2/OOP/LAB9-2/src/Pro1_64011041/Peppa_Pig3.png"));
//         photo3.setFitWidth(300);
//         photo3.setFitHeight(200);
//         grid.add(photo3, 0, 1);

//         ImageView photo4 = new ImageView(new Image("D:/KMITL/year1/term2/OOP/LAB9-2/src/Pro1_64011041/Peppa_Pig4.jpg"));
//         photo4.setFitWidth(300);
//         photo4.setFitHeight(200);
//         grid.add(photo4, 1, 1);

//         Scene scene = new Scene(grid);
//         primaryStage.setTitle("PEPPA PIG/>0</");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }
// }
import javafx.util.Duration;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class App extends Application{
    
    @Override
    public void start(Stage primaryStage) {
        File file = new File("vdo.mp4");
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView =new MediaView(mediaPlayer);

        Button playButton=new Button(">");
        playButton.setOnAction(e->{
            if(playButton.getText().equals(">")){
                mediaPlayer.play();
                playButton.setText("||");
            }else{
                mediaPlayer.pause();
                playButton.setText(">");
            }
        });

        Button rewindButton=new Button("<<");
        rewindButton.setOnAction(e->mediaPlayer.seek(Duration.ZERO));

        Slider slVolume=new Slider();
        slVolume.setPrefWidth(150);
        slVolume.setMaxWidth(Region.USE_PREF_SIZE);
        slVolume.setMinWidth(30);
        slVolume.setValue(50);
        mediaPlayer.volumeProperty().divide(100);

        HBox hbox =new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(playButton,rewindButton,new Label("Volume"),slVolume);

        BorderPane pane=new BorderPane();
        pane.setCenter(mediaView);
        pane.setBottom(hbox);

        Scene scene = new Scene (pane,650,500);
        primaryStage.setTitle("MediaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

