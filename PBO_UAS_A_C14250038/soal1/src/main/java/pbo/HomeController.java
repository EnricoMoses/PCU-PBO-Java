package pbo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class HomeController extends Controller {
    private static ArrayList<Student> studentList = new ArrayList<>();

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }

    @FXML
    private TextField searchNrp;

    @FXML
    public void onAddButtonClick() throws IOException {
        switchView("add-view.fxml", "Add Student");
    }

    @FXML
    public void onShowButtonClick() throws IOException {
        String searchNrp = this.searchNrp.getText();
        boolean found = false;

        for (Student s : studentList) {
            if (s.getNrp().equals(searchNrp)) {
                found = true;
                ShowController.setCurrentStudent(s);
                switchView("show-view.fxml", "Show Student");
                break;
            }
        }

        if (!found) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("NRP tidak ditemukan!");
            alert.showAndWait();
        }
    }
}