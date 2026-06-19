package com.example.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class RegisterController {
  @FXML private TextField usernameField;
  @FXML private PasswordField passwordField;
  @FXML private Label messageLabel;

  @FXML
  private void handleRegister(ActionEvent event) {
    String user = usernameField.getText();
    String pass = passwordField.getText();

    if (!user.isEmpty() && !pass.isEmpty()) {
      UserRepository.addUser(new User(user, pass));
      messageLabel.setText("Registration successful!");

      // Return to login scene
      try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        Scene loginScene = new Scene(loader.load(), 300, 200);
        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.setScene(loginScene);
      } catch (Exception e) {
        e.printStackTrace();
      }
    } else {
      messageLabel.setText("Please fill all fields.");
    }
  }
}
