package com.dee.controller;

import com.dee.EmailManager;
import com.dee.view.ColorTheme;
import com.dee.view.FontSize;
import com.dee.view.ViewFactory;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class OptionsWindowController extends BaseController implements Initializable {

    public OptionsWindowController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    private ChoiceBox<FontSize> fontSizePicker;

    @FXML
    private ChoiceBox<ColorTheme> themePicker;


    @FXML
    void applybtnAction(ActionEvent event) {
        viewFactory.setFontSize(fontSizePicker.getValue());
        viewFactory.setColorTheme(themePicker.getValue());
        viewFactory.updateStyles();
//        System.out.println(viewFactory.getColorTheme());
//        System.out.println(viewFactory.getFontSize());
    }

    @FXML
    void cancelButtonAction(ActionEvent event) {
        Stage stage = (Stage) fontSizePicker.getScene().getWindow();
        viewFactory.closeStage(stage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setUpThemePicker();
        setUpSizePicker();
    }

    private void setUpSizePicker() {
        fontSizePicker.setItems(FXCollections.observableArrayList(FontSize.values()));
        fontSizePicker.setValue(viewFactory.getFontSize());
    }

    private void setUpThemePicker() {
        themePicker.setItems(FXCollections.observableArrayList(ColorTheme.values()));
        themePicker.setValue(viewFactory.getColorTheme());
    }
}
