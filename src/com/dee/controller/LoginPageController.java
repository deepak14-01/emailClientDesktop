package com.dee.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPageController {

    @FXML
    private TextField emailId;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signIn;

    @FXML
    void signInButtonAction() {
        System.out.println("click");
    }

}
