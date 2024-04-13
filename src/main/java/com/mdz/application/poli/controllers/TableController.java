package com.mdz.application.poli.controllers;

import com.mdz.application.poli.App;
import com.mdz.application.poli.models.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableController {

    @FXML
    private TableColumn<Student, String> colApellido;

    @FXML
    private TableColumn<Student, Integer> colMatricula;

    @FXML
    private TableColumn<Student, String> colNombre;

    @FXML
    private TableView<Student> upTable;

    public void initialize(){
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        ObservableList<Student> tableUp = FXCollections.observableArrayList(App.getUp().getStudents());
        upTable.setItems(tableUp);
    }

}
