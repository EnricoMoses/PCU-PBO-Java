module com.example.pbo11javafx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pbo11javafx1 to javafx.fxml;
    exports com.example.pbo11javafx1;
}