package com.mdz.application.poli.models;

import com.mdz.application.poli.App;

public class BaseDatos3 implements IStudent{

    @Override
    public boolean addStudent(Student student) {
        boolean flag = false;
        for (int i = 0; i < App.getBasesDeDatos().getBaseDatos3().size(); i++) {
            if (App.getBasesDeDatos().getBaseDatos3().get(i).getMatricula() == student.getMatricula()) {
                flag = true;
            }
        }
        if (!flag) {
            App.getBasesDeDatos().getBaseDatos3().add(student);
        }
        return flag;
    }

    @Override
    public boolean updateStudent(String nombre, String apellido, int matricula) {
        boolean flag = false;
        for (int i = 0; i < App.getBasesDeDatos().getBaseDatos3().size(); i++) {
            if (matricula == App.getBasesDeDatos().getBaseDatos3().get(i).getMatricula()) {
                App.getBasesDeDatos().getBaseDatos3().get(i).setNombre(nombre);
                App.getBasesDeDatos().getBaseDatos3().get(i).setApellido(apellido);
                App.getBasesDeDatos().getBaseDatos3().get(i).setMatricula(matricula);
                flag = true;
            }
        }
        return flag;
    }
}
