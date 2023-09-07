import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        LoanCalculator loanCalculator = new LoanCalculator();
        loanCalculator.start(arg0);
    }
 
}