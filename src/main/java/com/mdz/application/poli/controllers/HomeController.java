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
        IStudent base1 = App.getBaseDatos1();
        IStudent base2 = App.getBaseDatos2();
        IStudent base3 = App.getBaseDatos3();
        if (base1.updateStudent(nombreTxt.getText(), apellidoTxt.getText(), Integer.parseInt(matriculaTxt.getText()))){
            String contenido = "Actualizado";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        } else {
            String contenido = "No existe esa matricula";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
        base2.updateStudent(nombreTxt.getText(), apellidoTxt.getText(), Integer.parseInt(matriculaTxt.getText()));
        base3.updateStudent(nombreTxt.getText(), apellidoTxt.getText(), Integer.parseInt(matriculaTxt.getText()));
    }

    @FXML
    void onClickAgregarButton(MouseEvent event) {
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        int matricula = Integer.parseInt(matriculaTxt.getText());
        Student student = new Student(nombre, apellido, matricula);
        student.setBase(App.getBaseDatos1());
        if (!student.add(student)){
            String contenido = "Se agregó";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        } else {
            String contenido = "Matrícula repetida";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(contenido);
            alert.showAndWait();
        }
        student.setBase(App.getBaseDatos2());
        student.add(student);
        student.setBase(App.getBaseDatos3());
        student.add(student);

    }

    @FXML
    void onClickMostrarButton(MouseEvent event) {
        App.newStage("table-view", "Tablas");
    }

}
