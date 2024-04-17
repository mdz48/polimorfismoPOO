package com.mdz.application.poli.models;

import java.util.ArrayList;

public interface IStudent {
    boolean addStudent(Student student);
    boolean updateStudent(String nombre, String apellido, int matricula);
    ArrayList<Student> getStudents();

}
