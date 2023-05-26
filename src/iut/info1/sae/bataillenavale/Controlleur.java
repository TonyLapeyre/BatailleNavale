/*
 * Controlleur.java                                      26 mai 2023
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
public class Controlleur {
    
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
        if (btnNouvellePartie.isHover()) {
            btnNouvellePartie.setStyle("-fx-background-color:#00359B;");
        } else if (btnContinuer.isHover()) {
            btnContinuer.setStyle("-fx-background-color:#00359B;");
        } else if (btnRegles.isHover()) {
            btnRegles.setStyle("-fx-background-color:#00359B;");
        } else if (btnQuitter.isHover()) {
            btnQuitter.setStyle("-fx-background-color:#00359B;");
        }
    }
    
    @FXML
    void visuIsHover() {
        if (btnNouvellePartie.isHover()) {
            btnNouvellePartie.setStyle("-fx-background-color:#1B5AD3;");
        } else if (btnContinuer.isHover()) {
            btnContinuer.setStyle("-fx-background-color:#1B5AD3;");
        } else if (btnRegles.isHover()) {
            btnRegles.setStyle("-fx-background-color:#1B5AD3;");
        } else if (btnQuitter.isHover()) {
            btnQuitter.setStyle("-fx-background-color:#1B5AD3;");
        }
    }
    
    @FXML
    void visuIsNotHover() {
        if (!btnNouvellePartie.isHover()) {
            btnNouvellePartie.setStyle("-fx-background-color:#00359B;");
        } else if (!btnContinuer.isHover()) {
            btnContinuer.setStyle("-fx-background-color:#00359B;");
        } else if (!btnRegles.isHover()) {
            btnRegles.setStyle("-fx-background-color:#00359B;");
        } else if (!btnQuitter.isHover()) {
            btnQuitter.setStyle("-fx-background-color:#00359B;");
        }
    }
}
