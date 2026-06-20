package pbo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;

public class ShowController extends Controller {
    private static Student currentStudent;

    @FXML private Label nrpLabel;
    @FXML private Label utsLabel;
    @FXML private Label tesLabel;
    @FXML private Label uasLabel;
    @FXML private Label praktikumLabel;
    @FXML private Label nilaiAkhirLabel;

    public static void setCurrentStudent(Student student) {
        currentStudent = student;
    }

    @FXML
    public void initialize() {
        if (currentStudent != null) {
            nrpLabel.setText(currentStudent.getNrp());
            utsLabel.setText(String.valueOf(currentStudent.getUts()));
            tesLabel.setText(String.valueOf(currentStudent.getTest()));
            uasLabel.setText(String.valueOf(currentStudent.getUas()));
            praktikumLabel.setText(String.valueOf(currentStudent.getPraktikum()));

            double nilaiAkhir = (currentStudent.getUts() + currentStudent.getTest() + currentStudent.getUas() + currentStudent.getPraktikum()) / 4;

            nilaiAkhirLabel.setText(String.valueOf(nilaiAkhir));
        }
    }

    @FXML
    public void onBackButtonClick() throws IOException {
        switchView("home-view.fxml", "Home");
    }
}