package com.example.ddb;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox Comboxboisson;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Payer 5 €");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ListeBoissons maListeDuProjet = new ListeBoissons();
        maListeDuProjet.initialisation();
        Comboxboisson.setItems(maListeDuProjet.getListeboissons());
    }
}