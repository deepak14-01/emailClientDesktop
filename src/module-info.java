module EmailClientDesktop {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires java.mail;
    requires activation;

    opens com.dee;
    opens com.dee.view;
    opens com.dee.controller;
}