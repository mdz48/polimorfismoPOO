package com.mdz.application.poli.models;

public class Student {
    private String nombre;
    private String apellido;
    private int matricula;
    private IStudent base;

    public int getMatricula() {
        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Student(String nombre, String apellido, int matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }
    public void setBase(IStudent base){
        this.base = base;
    }
    public void add(Student student){
        base.addStudent(student);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
