package com.mdz.application.poli.models;

import com.mdz.application.poli.App;

import java.util.ArrayList;

public class BaseDatos3 implements IStudent{

    private ArrayList<Student> base3 = new ArrayList<>();

    public ArrayList<Student> getBase3() {
        return base3;
    }

    @Override
    public boolean addStudent(Student student) {
        boolean flag = false;
        for (int i = 0; i < base3.size(); i++) {
            if (base3.get(i).getMatricula() == student.getMatricula()) {
                flag = true;
            }
        }
        if (!flag) {
            base3.add(student);
        }
        return flag;
    }

    @Override
    public boolean updateStudent(String nombre, String apellido, int matricula) {
        boolean flag = false;
        for (int i = 0; i < base3.size(); i++) {
            if (matricula == base3.get(i).getMatricula()) {
                base3.get(i).setNombre(nombre);
                base3.get(i).setApellido(apellido);
                flag = true;
            }
        }
        return flag;
    }
}
