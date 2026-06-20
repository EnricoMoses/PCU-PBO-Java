package pbo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;

public class AddController extends Controller {
    @FXML private TextField nrpField;
    @FXML private TextField utsField;
    @FXML private TextField tesField;
    @FXML private TextField uasField;
    @FXML private TextField praktikumField;

    @FXML
    public void onSaveButtonClick() throws IOException {
        String nrp = nrpField.getText();
        double uts = Double.parseDouble(utsField.getText());
        double tes = Double.parseDouble(tesField.getText());
        double uas = Double.parseDouble(uasField.getText());
        double praktikum = Double.parseDouble(praktikumField.getText());

        Student newStudent = new Student(nrp, uts, tes, uas, praktikum);
        HomeController.getStudentList().add(newStudent);

        switchView("home-view.fxml", "Home");
    }
}