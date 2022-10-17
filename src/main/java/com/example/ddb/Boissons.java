package com.example.ddb;

import java.util.ArrayList;

public class Boissons {

    private String nomBoisson;
    private int prixBoisson;

    //Constructeur

    public Boissons() {
    }

    public Boissons(String nomBoisson, int prixBoisson) {
        this.nomBoisson = nomBoisson;
        this.prixBoisson = prixBoisson;
    }

    @Override
    public String toString() {
        //return super.toString();
        return this.nomBoisson;
    }

    public String getNomBoisson() {
        return nomBoisson;
    }

    public void setNomBoisson(String nomBoisson) {
        this.nomBoisson = nomBoisson;
    }

    public int getPrixBoisson() {
        return prixBoisson;
    }

    public void setPrixBoisson(int prixBoisson) {
        this.prixBoisson = prixBoisson;
    }
}