package com.mdz.application.poli.models;

import java.util.ArrayList;

public class BD3 implements IStudent{

    private ArrayList<Student> students = new ArrayList<>();
    @Override
    public boolean addStudent(Student student) {
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMatricula() == student.getMatricula()) {
                flag = true;
            }
        }
        if (!flag) {
            students.add(student);
        }
        return flag;
    }

    @Override
    public boolean updateStudent(String nombre, String apellido, int matricula) {
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (matricula == students.get(i).getMatricula()) {
                students.get(i).setNombre(nombre);
                students.get(i).setApellido(apellido);
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public ArrayList<Student> getStudents() {
        return students;
    }
}
