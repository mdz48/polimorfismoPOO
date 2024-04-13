package com.mdz.application.poli.models;

public interface IStudent {
    boolean addStudent(Student student);
    boolean updateStudent(String nombre, String apellido, int matricula);
}
