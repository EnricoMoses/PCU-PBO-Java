module com.example.nameage {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.nameage to javafx.fxml;
  exports com.example.nameage;
}