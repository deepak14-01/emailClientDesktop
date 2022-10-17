package com.dee;

import javafx.application.Application;
//import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//import static javafx.fxml.FXMLLoader.*;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("view/LoginPage.fxml"));
        Scene scene = new Scene(parent, 329, 247);
        stage.setScene(scene);

        stage.show();
    }
}
