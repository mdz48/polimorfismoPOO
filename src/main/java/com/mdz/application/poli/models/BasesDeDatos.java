package com.mdz.application.poli.models;

import com.mdz.application.poli.App;

import java.util.ArrayList;

public class BasesDeDatos {
    private ArrayList<Student> baseDatos1 = App.getBaseDatos1().getBase1();
    private ArrayList<Student> baseDatos2 = App.getBaseDatos2().getBase2();
    private ArrayList<Student> baseDatos3 = App.getBaseDatos3().getBase3();

    public ArrayList<Student> getBaseDatos1() {
        return baseDatos1;
    }

    public ArrayList<Student> getBaseDatos2() {
        return baseDatos2;
    }

    public ArrayList<Student> getBaseDatos3() {
        return baseDatos3;
    }
}
