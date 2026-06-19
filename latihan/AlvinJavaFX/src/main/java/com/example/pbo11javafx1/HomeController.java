package com.example.pbo11javafx1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController extends Controller {
    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> nameCol;
    @FXML
    private TableColumn<Person, Integer> ageCol;

    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));

        ObservableList<Person> personList = FXCollections.observableArrayList();
        personList.add(new Person("A", 20));
        personList.add(new Person("B", 21));
        personList.add(new Person("C", 22));
        personTable.setItems(personList);
    }
    public void onLogoutButtonClick() throws IOException {
        switchStage("login-view.fxml", "Login");
    }
}
