package com.example.pbo11javafx1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController extends Controller {
    @FXML
    private TextField usernameText;
    @FXML
    private PasswordField passwordText;
    @FXML
    public void onLoginButtonClick() throws IOException {
        if (usernameText.getText().equals("admin") &&
            passwordText.getText().equals("password")) {
            switchStage("home-view.fxml", "Home");
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Login failed");
            alert.show();
        }
    }
}
