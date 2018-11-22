package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Main extends Application {
    //Define
    Stage window;
    Scene homeScene;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        homeScene = new Scene(root, 1920, 1080);
        //homeScene.setRoot(root); //set root of hierarchy

        //Main Window
        window = primaryStage;
        window.setTitle("Superheroes 2");
        window.setScene(homeScene);
        window.isFullScreen();
        window.show();

    }
}
