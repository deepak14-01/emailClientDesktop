module EmailClientDesktop {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens com.dee;
    opens com.dee.view;
    opens com.dee.controller;
}