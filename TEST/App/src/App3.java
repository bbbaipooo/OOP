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

public class App3 extends Application{
    public static void main(String[] args) throws Exception{
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
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
        primaryStage.setTitle("Media64011041Kittaporn");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
