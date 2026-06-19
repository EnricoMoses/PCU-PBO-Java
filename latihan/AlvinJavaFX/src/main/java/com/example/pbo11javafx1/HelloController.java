package com.example.pbo11javafx1;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField nameText;
    @FXML
    private Button helloButton;
    private boolean clicked = false;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        if (!clicked) {
            helloButton.setText("Button clicked!");
            clicked = true;
        }
        else {
            helloButton.setText("Button unclicked!");
            clicked = false;
        }
    }

    @FXML
    public void onAlertButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert");
        alert.setContentText("Alert content");
        alert.setHeaderText("Alert header");
        alert.show();
    }
    @FXML
    public void onHelloButton2Click() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Hello, " + nameText.getText() + "!");
        alert.show();
    }
}