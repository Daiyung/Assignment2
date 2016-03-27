package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.Socket;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("File Sharer v1.0");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();





        Socket socket = new Socket("127.0.0.1", 8080);



    }


    public static void main(String[] args) {
        launch(args);
    }


    //Methods

    public void DIR() {

    }

    public void UPLOAD() {

    }

    public void DOWNLOAD() {

    }
}




