package com.mdz.application.poli.models;

import com.mdz.application.poli.App;

import java.util.ArrayList;


public class BaseDatos2 implements IStudent{

    private ArrayList<Student> base2 = new ArrayList<>();

    public ArrayList<Student> getBase2() {
        return base2;
    }

    @Override
    public boolean addStudent(Student student) {
        boolean flag = false;
        for (int i = 0; i < base2.size(); i++) {
            if (base2.get(i).getMatricula() == student.getMatricula()) {
                flag = true;
            }
        }
        if (!flag) {
            base2.add(student);
        }
        return flag;
    }

    @Override
    public boolean updateStudent(String nombre, String apellido, int matricula) {
        boolean flag = false;
        for (int i = 0; i < base2.size(); i++) {
            if (matricula == base2.get(i).getMatricula()) {
                base2.get(i).setNombre(nombre);
                base2.get(i).setApellido(apellido);
                flag = true;
            }
        }
        return flag;
    }
}
