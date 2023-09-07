package Pro2_64011041;

// import javafx.application.Application;
// import javafx.geometry.Insets;
// import javafx.scene.Scene;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.GridPane;
// import javafx.stage.Stage;

// public class App extends Application {
//     public static void main(String[] args) {
//         Application.launch(args);
//     }

//     @Override
//     public void start(Stage primaryStage) {
//         GridPane gridPane = new GridPane();
//         gridPane.setPadding(new Insets(3,3,3,3));

//         for (int y = 0; y < 10; y++) {
//             for (int x = 0; x < 10; x++) {
//                 TextField tField = new TextField();
//                 tField.setPrefColumnCount(1); //กำหนดความยาวช่อง
//                 tField.setText(String.valueOf((int)(Math.random()*2)));
//                 gridPane.add(tField,x,y);
//             }
//         }

//         //Create scne & pane on stage
//         Scene scene =new Scene(gridPane);
//         primaryStage.setTitle("RandNum/>0</");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }
// }
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class App extends Application{
    //OverridethestartmethodintheApplicationclass
    public void start(Stage primaryStage){
        //Createapaneandsetitsproperties
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5,12.5,13.5,14.5));
        pane.setHgap(5.5);pane.setVgap(5.5);
        //Placenodesinthepane
        pane.add(new Label("First Name:"),0,0);
        pane.add(new TextField(),1,0);
        pane.add(new Label("MI:"),0,1);
        pane.add(new TextField(),1,1);
        pane.add(new Label("Last Name:"),0,2);
        pane.add(new TextField(),1,2);
        Button btAdd=new Button("Add Name");
        pane.add(btAdd,1,3);
        GridPane.setHalignment(btAdd,HPos.RIGHT);
        //Createasceneandplaceitinthestage
        Scene scene=new Scene(pane);
        primaryStage.setTitle("ShowGridPane");//Setthestagetitle
        primaryStage.setScene(scene);//Placethesceneinthestage
        primaryStage.show();//Displaythestage
    }
}
