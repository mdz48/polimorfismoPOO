package com.mdz.application.poli.models;

import com.mdz.application.poli.App;

import java.util.ArrayList;

public class UPChiapas {
    private IStudent mySQL = new MySQL();
    private IStudent mariaDB = new MariaDB();
    private IStudent bd3 = new BD3();

    public boolean newStudent(Student student) {
        boolean flag = false;
        if (mySQL.addStudent(student) & mariaDB.addStudent(student) & bd3.addStudent(student)) {
            flag = true;
        }
        return flag;
    }

    public boolean actualizarStudent(String nombre, String apellido, int matricula){
        boolean flag = false;
        if (mySQL.updateStudent(nombre, apellido, matricula) & mariaDB.updateStudent(nombre, apellido, matricula) & bd3.updateStudent(nombre, apellido, matricula)){
            flag = true;
        }
        return flag;
    }

    public IStudent getMySQL() {
        return mySQL;
    }

    public IStudent getMariaDB() {
        return mariaDB;
    }

    public IStudent getBD3() {
        return bd3;
    }
}
