/*
 * ControleurAccueil.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * Classe contrôleur qui établit un lien entre 
 * la vue accueil.fxml et le modèle BatailleNavale
 * @author tom.jammes
 */
public class ControleurAccueil {
    
    /* Bouton qui lance une nouvelle partie */
    @FXML
    private Button btnNouvellePartie;
    
    /* Bouton qui reprend une partie existante */
    @FXML
    private Button btnContinuer;
    
    /* Bouton qui affiche les règles du jeu */
    @FXML
    private Button btnRegles;
    
    /* Bouton qui quitte l'application */
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
    
    /* Lie le bouton btnNouvellePartie à la méthode */
    @FXML
    void chargerCreationJoueur() {
        Main.chargerCreationJoueur();
    }
    
    /* Lie le bouton btnContinuer à la méthode */
    @FXML
    void continuerPartie() {
        Main.continuerPartie();
    }
    
    /* Lie le bouton btnRegles à la méthode */
    @FXML
    void chargerPageRegle() {
        Main.chargerRegle();
    }
    
    /* Lie le bouton btnQuitter à la méthode */
    @FXML
    void quitterJeu() {
        Main.quitterJeu();
    }
}