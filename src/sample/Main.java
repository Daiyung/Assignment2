package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


import java.net.Socket;

public class Main extends Application {
    private Stage window;
    private BorderPane layout;
    private TextArea textArea1;

    @Override
    public void start(Stage primaryStage) throws Exception{


        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Group root = new Group();

        BorderPane borderPane = new BorderPane();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        //Scene scene = new Scene(borderPane, 800, 600);

        //Download Button
        Button downloadButton = new Button();
        downloadButton.setText("Download");
        downloadButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DOWNLOAD();
            }
        });

        //Upload Button

        Button uploadButton = new Button();
        uploadButton.setText("Upload");
        uploadButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                UPLOAD();
            }
        });

        //format layout
        gridPane.add(downloadButton, 1,1);
        gridPane.add(uploadButton, 2, 1);
        /*
        HBox hBox = new HBox(10);
        hBox.getChildren().add(downloadButton);
        //gridPane.add(hBox,1 , 1);
        //root.getChildren().addAll(downloadButton);
        borderPane.setTop(hBox);
        */

        layout = new BorderPane();
        layout.setTop(gridPane);
        Scene scene = new Scene(layout, 600, 600);
        primaryStage.setTitle("File Sharer v1.0");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


    //Methods

    public void DIR() {

    }

    public void UPLOAD() {
        System.out.println("upload button pressed");
    }

    public void DOWNLOAD() {
        System.out.println("dowmload button pressed");
    }
}




