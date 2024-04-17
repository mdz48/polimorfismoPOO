package com.mdz.application.poli.controllers;

import com.mdz.application.poli.App;
import com.mdz.application.poli.models.IStudent;
import com.mdz.application.poli.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private Button actualizarButton;

    @FXML
    private Button agregarButton;

    @FXML
    private TextField apellidoTxt;

    @FXML
    private TextField matriculaTxt;

    @FXML
    private Button mostrarbutton;

    @FXML
    private TextField nombreTxt;

    @FXML
    void onClickActualizarButton(MouseEvent event) {
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        int matricula = Integer.parseInt(matriculaTxt.getText());
        if (App.getUPChiapas().actualizarStudent(nombre, apellido, matricula)) {
            String contenido = "Se actualizó";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        } else {
            String contenido = "No se encontroó es matricula";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
    }

    @FXML
    void onClickAgregarButton(MouseEvent event) {
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        int matricula = Integer.parseInt(matriculaTxt.getText());
        Student student = new Student(nombre, apellido, matricula);
        if (!App.getUPChiapas().newStudent(student)){
            String contenido = "Se añadio";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        } else {
            String contenido = "Matricula Repetida";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
    }

    @FXML
    void onClickMostrarButton(MouseEvent event) {
        App.newStage("table-view", "Tablas");
    }

}
