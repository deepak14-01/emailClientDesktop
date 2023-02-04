package com.dee.controller;

import com.dee.EmailManager;
import com.dee.controller.services.LoginService;
import com.dee.model.EmailAccount;
import com.dee.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginWindowController extends BaseController {

    @FXML
    private Button errorLabel;

    @FXML
    private TextField emailAddressField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signIn;

    public LoginWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void loginButtonAction() {
        if(fieldsAreValid()){
            EmailAccount emailAccount = new EmailAccount(emailAddressField.getText(), passwordField.getText());
            LoginService loginService = new LoginService(emailAccount, emailManager);
            EmailLoginResult emailLoginResult= loginService.login();

            switch (emailLoginResult) {
                case SUCCESS:
                    System.out.println("login successful!!!" + emailAccount);
                    return;
            }
        }

        System.out.println("Login Click");
        Stage stage = (Stage) signIn.getScene().getWindow();
        viewFactory.closeStage(stage);
        viewFactory.showMainWindow();
    }

    private boolean fieldsAreValid() {
        if(emailAddressField.getText().isEmpty()) {
            errorLabel.setText("Please fill email");
            return false;
        }
        if(passwordField.getText().isEmpty()) {
            errorLabel.setText("Please fill password");
            return false;
        }

        return true;

    }


}
