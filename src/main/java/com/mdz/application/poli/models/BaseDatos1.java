package com.mdz.application.poli.models;

import com.mdz.application.poli.App;

import java.util.ArrayList;

public class BaseDatos1 implements IStudent{

    private ArrayList<Student> base1 = new ArrayList<>();

    public ArrayList<Student> getBase1() {
        return base1;
    }
    @Override
    public boolean addStudent(Student student) {
        boolean flag = false;
        for (int i = 0; i < base1.size(); i++) {
            if (base1.get(i).getMatricula() == student.getMatricula()) {
                flag = true;
            }
        }
        if (!flag) {
            base1.add(student);
        }
        return flag;
    }

    @Override
    public boolean updateStudent(String nombre, String apellido, int matricula) {
        boolean flag = false;
        for (int i = 0; i < base1.size(); i++) {
            if (matricula == base1.get(i).getMatricula()) {
                base1.get(i).setNombre(nombre);
                base1.get(i).setApellido(apellido);
                flag = true;
            }
        }
        return flag;
    }
}
