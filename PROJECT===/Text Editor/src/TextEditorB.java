import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.attribute.*;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.util.Duration;
import java.util.logging.Logger;
import static java.util.logging.Level.SEVERE;

import java.util.logging.Level;
import javafx.scene.Scene;

public class TextEditorB extends Application {
    private int isNew = 1;
    private int statusReadOnly = 0;
    public String inputFileName;

    private File loadedFileReference;
    private FileTime lastModifiedTime;

    // Main pane
    public BorderPane borderPane = new BorderPane();

    // Top of pane
    public MenuBar menuBar = new MenuBar();
    public Menu text = new Menu("Tools");
    public MenuItem newMn = new MenuItem("new");
    public MenuItem openMn = new MenuItem("open");
    public MenuItem saveMn = new MenuItem("save");
    public MenuItem closeMn = new MenuItem("close");
    public MenuItem clearMn = new MenuItem("clear");

    // Center of pane
    public AnchorPane anchorPane = new AnchorPane();
    public TextArea textArea = new TextArea();
    public TextField textField = new TextField();

    // Bottom of pane
    public HBox mainHBox = new HBox();
    public HBox hBox1 = new HBox();
    public HBox hBox2 = new HBox();
    // public HBox textFieldBox = new HBox();
    public Label statusMessage = new Label("Checking for Changes..."); // Label is useful for displaying text that is
                                                                       // required to fit within a specific space
    public ProgressBar progressBar = new ProgressBar(0.0);
    public Button loadChangesButton = new Button("Load Changes");

    public TextEditorB(Stage primaryStage) {
        start(primaryStage);
    }

    @Override
    public void start(Stage primaryStage) {
        initUI(primaryStage);
        newMn.setOnAction(e -> {
            try {
                newFileMethod();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        openMn.setOnAction(e -> {
            openFile();
        });
        saveMn.setOnAction(e -> {
            switch (isNew) {
                case 0:
                    try {
                        saveFile();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                    break;
                case 1:
                    FileChooser fileChooser = new FileChooser();

                    // Set extension filter
                    FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)",
                            "*.txt");
                    fileChooser.getExtensionFilters().add(extFilter);

                    // Show save file dialog
                    File file = fileChooser.showSaveDialog(primaryStage);

                    if (file != null) {
                        saveFileNew(textArea.getText(), file);
                    }
                    break;
            }
        });
        closeMn.setOnAction(e -> {
            try {
                closeSystem();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
        clearMn.setOnAction(e -> clear());
    }

    private void newFileMethod() throws IOException {
        isNew = 1;
        textArea.clear();
        textArea.setText("New Text");
        textArea.setEditable(true);
    }

    private void closeSystem() throws IOException {
        if (textArea.getText().isEmpty()) {
            Platform.exit();
        } else if (statusReadOnly == 1) {
            Platform.exit();
        }

        Alert alert = new Alert(
                Alert.AlertType.CONFIRMATION,
                "Exit without saving?",
                ButtonType.YES,
                // ButtonType.NO,
                ButtonType.CANCEL);

        alert.setTitle("Confirm");
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            Platform.exit();
        }
        // if (alert.getResult() == ButtonType.NO) {
        // saveFile();
        // Platform.exit();
        // }
    }

    private void initUI(Stage primaryStage) {
        // Top borderPane Setup
        borderPane.setTop(menuBar);
        // openMn.setGraphic(new ImageView(".png"));
        // saveMn.setGraphic(new ImageView(".png"));
        // closeMn.setGraphic(new ImageView(".png"));
        text.getItems().addAll(newMn, openMn, saveMn, closeMn, clearMn);
        menuBar.getMenus().add(text);

        // Center
        // set textArea font style
        // Font font = new Font("C:/javaProject/Project/OOP_PROJECT/src/FCPalette.otf",
        // 20.0);
        // textArea.setFont(font);
        textArea.setText("New Text");
        anchorPane.getChildren().addAll(textArea);
        textArea.setEditable(true);

        textField.setPrefSize(25, 50);

        // set textArea size
        textArea.setPrefHeight(400.00);
        textArea.prefWidth(600.00);

        AnchorPane.setBottomAnchor(textArea, 5.0);
        AnchorPane.setLeftAnchor(textArea, 5.0);
        AnchorPane.setRightAnchor(textArea, 5.0);
        AnchorPane.setTopAnchor(textArea, 5.0);

        borderPane.setCenter(anchorPane);

        // Bottom
        statusMessage.setPrefWidth(150.00);
        progressBar.setPrefWidth(150.00);

        Insets insets = new Insets(5.0);
        mainHBox.setPadding(insets); // setTRLB

        hBox1.setAlignment(Pos.CENTER_LEFT);
        hBox2.setAlignment(Pos.CENTER_RIGHT);

        hBox1.getChildren().addAll(statusMessage, progressBar);
        hBox2.getChildren().addAll(loadChangesButton);

        mainHBox.getChildren().addAll(hBox1, hBox2);
        borderPane.setBottom(mainHBox);

        Scene scene = new Scene(borderPane, 1080, 720);
        primaryStage.setTitle("OOP : textEditor"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public void initialize() {
        isNew = 0;
        loadChangesButton.setVisible(false);
        textField.setVisible(false);
    }

    public void openFile() {
        FileChooser fileChooser = new FileChooser();
        // only allow text files to be selected using chooser
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt"));
        // set initial directory somewhere user will recognise
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        // let user select file
        File fileToLoad = fileChooser.showOpenDialog(null);
        // if file has been chosen, load it using asynchronous method (define later)
        if (fileToLoad != null) {
            loadFileToTextArea(fileToLoad);
        }
        if (fileToLoad.canWrite()) {
            textArea.setEditable(true);
            statusReadOnly = 0;
        } else {
            textArea.setEditable(false);
            warningCheckReadOnly();
            statusReadOnly = 1;
        }
        isNew = 0;
    }

    private void loadFileToTextArea(File fileToLoad) {
        Task<String> loadTask = fileLoaderTask(fileToLoad);
        progressBar.progressProperty().bind(loadTask.progressProperty());
        loadTask.run();
    }

    private Task<String> fileLoaderTask(File fileToLoad) {
        // Create a task to load the file asynchronously
        Task<String> loadFileTask = new Task<>() {
            @Override
            protected String call() throws Exception {
                BufferedReader reader = new BufferedReader(new FileReader(fileToLoad));
                // Use Files.lines() to calculate total lines - used for progress
                long lineCount;
                try (Stream<String> stream = Files.lines(fileToLoad.toPath())) {
                    lineCount = stream.count();
                }
                // Load in all lines one by one into a StringBuilder separated by "\n" -
                // compatible with TextArea
                String line;
                StringBuilder totalFile = new StringBuilder();
                long linesLoaded = 0;
                while ((line = reader.readLine()) != null) {
                    totalFile.append(line);
                    totalFile.append("\n");
                    updateProgress(++linesLoaded, lineCount);
                }
                reader.close();
                return totalFile.toString();
            }
        };

        loadFileTask.setOnSucceeded(workerStateEvent -> {
            try {
                textArea.setText(loadFileTask.get());
                statusMessage.setText("File loaded: " + fileToLoad.getName());
                loadedFileReference = fileToLoad;
                lastModifiedTime = Files.readAttributes(fileToLoad.toPath(), BasicFileAttributes.class)
                        .lastModifiedTime();
            } catch (InterruptedException | ExecutionException | IOException e) {
                Logger.getLogger(getClass().getName()).log(SEVERE, null, e);
                textArea.setText("Could not load file from:\n " + fileToLoad.getAbsolutePath());
            }
            scheduleFileChecking(loadedFileReference);
        });
        loadFileTask.setOnFailed(workerStateEvent -> {
            textArea.setText("Could not load file from:\n " + fileToLoad.getAbsolutePath());
            statusMessage.setText("Failed to load file");
        });
        return loadFileTask;
    }

    private void scheduleFileChecking(File file) {
        ScheduledService<Boolean> fileChangeCheckingService = createFileChangesCheckingService(file);
        fileChangeCheckingService.setOnSucceeded(workerStateEvent -> {
            if (fileChangeCheckingService.getLastValue() == null)
                return;
            else if (fileChangeCheckingService.getLastValue()) {
                fileChangeCheckingService.cancel();
                notifyUserOfChanges();
            }
        });
        System.out.println("Starting Checking Service...");
        fileChangeCheckingService.start();
    }

    private ScheduledService<Boolean> createFileChangesCheckingService(File file) {
        ScheduledService<Boolean> scheduledService = new ScheduledService<>() {
            @Override
            protected Task<Boolean> createTask() {
                return new Task<>() {
                    @Override
                    protected Boolean call() throws Exception {
                        FileTime lastModifiedAsOfNow = Files.readAttributes(file.toPath(), BasicFileAttributes.class)
                                .lastModifiedTime();
                        return lastModifiedAsOfNow.compareTo(lastModifiedTime) > 0;
                    }
                };
            }
        };
        scheduledService.setPeriod(Duration.seconds(1));
        return scheduledService;
    }

    private void notifyUserOfChanges() {
        loadChangesButton.setVisible(true);
    }

    public void loadChanges(ActionEvent event) {
        loadFileToTextArea(loadedFileReference);
        loadChangesButton.setVisible(false);
    }

    public void saveFile() throws IOException {

        try {
            FileWriter myWriter = new FileWriter(loadedFileReference);
            myWriter.write(textArea.getText());
            myWriter.close();
            lastModifiedTime = FileTime.fromMillis(System.currentTimeMillis() + 3000);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            Logger.getLogger(getClass().getName()).log(SEVERE, null, e);
        }

    }

    private void saveFileNew(String content, File file) {
        try {
            FileWriter fileWriter;

            fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(TextEditorB.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void clear() {
        textArea.clear();
        textArea.setEditable(true);
    }

    public void warningCheckReadOnly() {
        System.out.println("File is in read only mode");
        Alert alert = new Alert(
                Alert.AlertType.WARNING,
                "File is in read only mode",
                ButtonType.CLOSE);

        alert.setTitle("WARNING");
        alert.showAndWait();
    }
}
