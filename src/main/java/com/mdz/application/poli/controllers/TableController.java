package com.mdz.application.poli.controllers;

import com.mdz.application.poli.App;
import com.mdz.application.poli.models.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TableController {

    @FXML
    private TableColumn<Student, String> colApellido;

    @FXML
    private TableColumn<Student, Integer> colMatricula;

    @FXML
    private TableColumn<Student, String> colNombre;

    @FXML
    private TableView<Student> base1Table;

    @FXML
    private TableColumn<Student, String> colApellido1;

    @FXML
    private TableColumn<Student, Integer> colMatricula1;

    @FXML
    private TableColumn<Student, String> colNombre1;

    @FXML
    private TableView<Student> base2Table;

    @FXML
    private TableColumn<Student, String> colApellido11;

    @FXML
    private TableColumn<Student, Integer> colMatricula11;

    @FXML
    private TableColumn<Student, String> colNombre11;

    @FXML
    private TableView<Student> base3Table;

    @FXML
    private Button exitButton;

    @FXML
    void onClickExitButton(MouseEvent event) {
        App.getStageView().close();
    }

    public void initialize(){
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        colNombre1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido1.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colMatricula1.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        colNombre11.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido11.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colMatricula11.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        ObservableList<Student> base1 = FXCollections.observableArrayList(App.getBasesDeDatos().getBaseDatos1());
        ObservableList<Student> base2 = FXCollections.observableArrayList(App.getBasesDeDatos().getBaseDatos2());
        ObservableList<Student> base3 = FXCollections.observableArrayList(App.getBasesDeDatos().getBaseDatos3());
        base1Table.setItems(base1);
        base2Table.setItems(base2);
        base3Table.setItems(base3);
    }

}
