/*
 * ControlleurRegles.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * Classe controleur qui établit un lien entre 
 * les vues en FXML et le modèle BatailleNavale
 * @author tom.jammes
 */
public class ControlleurRegles {
    
    @FXML
    private Button btnAccueil;
    
    @FXML
    void visualiserClick() {
        if (btnAccueil.isHover()) {
            btnAccueil.setStyle("-fx-background-color:#00266F;");
        }
    }
    
    @FXML
    void visualiserNonClick() {
        btnAccueil.setStyle("-fx-background-color:#00359B;");
    }
    
    @FXML
    void retourAccueil() {
        Main.retourAccueil();
    }
}