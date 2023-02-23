module EmailClientDesktop {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires java.mail;
    requires activation;
    requires java.desktop;

    opens com.dee;
    opens com.dee.view;
    opens com.dee.controller;
    opens com.dee.model;

}