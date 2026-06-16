package com.example.nameage;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableController {
  @FXML
  protected TableView<Person> personTable;
  @FXML
  protected TableColumn<Person, Integer> nameColumn;
  @FXML
  protected TableColumn<Person, Integer> ageColumn;
  @FXML
  protected TextField nameField;
  @FXML
  protected TextField ageField;

  private ObservableList<Person> personList = FXCollections.observableArrayList();

  @FXML
  public void initialize() {
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
    personTable.setItems(personList);

    personList.add(new Person("James", 19));
    personList.add(new Person("Rex", 10));
  }

  @FXML
  private void handleAdd() {
    String name = nameField.getText();

    if(name.isEmpty()) {
      return;
    }

    int age = Integer.parseInt(ageField.getText());

    personList.add(new Person(name, age));
    nameField.clear();
    ageField.clear();
  }

  @FXML
  private void handleDeleteFirst() {
    if(!personList.isEmpty()) {
      personList.removeFirst();
    }
  }

  @FXML
  private void handleDeleteLast() {
    if(!personList.isEmpty()) {
      personList.removeLast();
    }
  }
}
