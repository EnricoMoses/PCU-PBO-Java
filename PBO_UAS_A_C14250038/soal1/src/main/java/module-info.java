module pbo {
    requires javafx.controls;
    requires javafx.fxml;

    opens pbo to javafx.fxml;
    exports pbo;
}