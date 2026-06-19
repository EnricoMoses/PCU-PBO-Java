package com.example.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class LoginController {
  @FXML private TextField usernameField;
  @FXML private PasswordField passwordField;
  @FXML private Label messageLabel;

  @FXML
  private void handleLogin(ActionEvent event) {
    String user = usernameField.getText();
    String pass = passwordField.getText();

    if(UserRepository.isValidUser(user, pass)) {
      try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("success.fxml"));
        Scene registerScene = new Scene(loader.load(), 300, 200);
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.setScene(registerScene);
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      messageLabel.setText("Username atau password salah");
    }
  }

  @FXML
  private void handleRegister(ActionEvent event) {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("register.fxml"));
      Scene registerScene = new Scene(loader.load(), 300, 200);
      Stage stage = (Stage) usernameField.getScene().getWindow();
      stage.setScene(registerScene);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
