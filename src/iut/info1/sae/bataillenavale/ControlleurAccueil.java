/*
 * ControlleurAccueil.java                                      26 mai 2023
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
public class ControlleurAccueil {
    
    @FXML
    private Button btnNouvellePartie;
    @FXML
    private Button btnContinuer;
    @FXML
    private Button btnRegles;
    @FXML
    private Button btnQuitter;
    
    @FXML
    void visualiserClick() {
        if (btnNouvellePartie.isHover()) {
            btnNouvellePartie.setStyle("-fx-background-color:#00266F;");
        } else if (btnContinuer.isHover()) {
            btnContinuer.setStyle("-fx-background-color:#00266F;");
        } else if (btnRegles.isHover()) {
            btnRegles.setStyle("-fx-background-color:#00266F;");
        } else if (btnQuitter.isHover()) {
            btnQuitter.setStyle("-fx-background-color:#00266F;");
        }
    }
    
    @FXML
    void visualiserNonClick() {
        btnNouvellePartie.setStyle("-fx-background-color:#00359B;");
        btnContinuer.setStyle("-fx-background-color:#00359B;");
        btnRegles.setStyle("-fx-background-color:#00359B;");
        btnQuitter.setStyle("-fx-background-color:#00359B;");
        
    }
    
    @FXML
    void chargerPageRegle() {
        Main.chargerRegle();
    }
    
    @FXML
    void quitterJeu() {
        Main.quitterJeu();
    }
}