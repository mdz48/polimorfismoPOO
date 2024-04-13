package com.mdz.application.poli.models;

import com.mdz.application.poli.App;


public class BaseDatos2 implements IStudent{

    @Override
    public boolean addStudent(Student student) {
        boolean flag = false;
        for (int i = 0; i < App.getBasesDeDatos().getBaseDatos2().size(); i++) {
            if (App.getBasesDeDatos().getBaseDatos2().get(i).getMatricula() == student.getMatricula()) {
                flag = true;
            }
        }
        if (!flag) {
            App.getBasesDeDatos().getBaseDatos2().add(student);
        }
        return flag;
    }

    @Override
    public boolean updateStudent(String nombre, String apellido, int matricula) {
        boolean flag = false;
        for (int i = 0; i < App.getBasesDeDatos().getBaseDatos2().size(); i++) {
            if (matricula == App.getBasesDeDatos().getBaseDatos2().get(i).getMatricula()) {
                App.getBasesDeDatos().getBaseDatos2().get(i).setNombre(nombre);
                App.getBasesDeDatos().getBaseDatos2().get(i).setApellido(apellido);
                App.getBasesDeDatos().getBaseDatos2().get(i).setMatricula(matricula);
                flag = true;
            }
        }
        return flag;
    }
}
