package com.example.ddb;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class ListeBoissons {
 ArrayList<Boissons> listeboissons;

    public ListeBoissons() {
    }
// Constructeur
    public ListeBoissons(ArrayList<Boissons> listeboissons) {
        this.listeboissons = listeboissons;
    }

    //get et set
    public ObservableList getListeboissons() {
        return FXCollections.observableList(this.listeboissons);
    }

    private void setListeboissons(ArrayList<Boissons> listeboissons) {
        this.listeboissons = listeboissons;
    }


    //Méthode
    public void initialisation()
    {
        Boissons Coca_cola = new Boissons();
        Coca_cola.setNomBoisson("Coca Cola");
        Coca_cola.setPrixBoisson(550);

        Boissons Badoit = new Boissons();
        Badoit.setNomBoisson("Badoit");
        Badoit.setPrixBoisson(250);

        Boissons Orangina = new Boissons();
        Orangina.setNomBoisson("Orangina");
        Orangina.setPrixBoisson(350);

        Boissons Citron = new Boissons();
        Citron.setNomBoisson("Citron pressé");
        Citron.setPrixBoisson(350);

        listeboissons=new ArrayList<Boissons>();
        listeboissons.add(Coca_cola);
        listeboissons.add(Badoit);
        listeboissons.add(Orangina);
        listeboissons.add(Citron);

    }

}
