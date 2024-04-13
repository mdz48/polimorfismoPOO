package com.mdz.application.poli.controllers;

import com.mdz.application.poli.App;
import com.mdz.application.poli.models.IStudent;
import com.mdz.application.poli.models.Student;
import com.mdz.application.poli.models.UP;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class HelloController {

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

    }

    @FXML
    void onClickAgregarButton(MouseEvent event) {
        String nombre = nombreTxt.getText();
        String apellido = apellidoTxt.getText();
        int matricula = Integer.parseInt(matriculaTxt.getText());
        Student student = new Student(nombre, apellido, matricula);
        student.setBase(App.getUp());
        student.add(student);
        student.setBase(App.getUnach());
        student.add(student);
        student.setBase(App.getUnicach());
        student.add(student);

    }

    @FXML
    void onClickMostrarButton(MouseEvent event) throws IOException {
        for (int i = 0; i < App.getUp().getStudents().size(); i++) {
            System.out.println(App.getUp().getStudents().get(i));
        }
        for (int i = 0; i < App.getUnach().getStudents().size(); i++) {
            System.out.println(App.getUnach().getStudents().get(i));
        }
        App escena = new App();
        escena.changeScene("table-view.fxml");
    }

}
