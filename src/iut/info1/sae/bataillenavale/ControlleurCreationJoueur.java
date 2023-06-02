/*
 * ControlleurRegles.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

/**
 * Classe controleur qui établit un lien entre 
 * les vues en FXML et le modèle BatailleNavale
 * @author tom.jammes
 */
public class ControlleurCreationJoueur {
    
    @FXML
    private Button btnAccueil;
    @FXML
    private Button btnValider;
    @FXML
    private TextField champPseudo;
    @FXML
    private PasswordField champMotDePasse;
    @FXML
    private PasswordField confirmationMotDePasse;
    
    @FXML
    void visualiserClick() {
        if (btnAccueil.isHover()) {
            btnAccueil.setStyle("-fx-background-color:#00266F;");
        } else if (btnValider.isHover()) {
            btnValider.setStyle("-fx-background-color:#00266F;");
        }
    }
    
    @FXML
    void visualiserNonClick() {
        btnAccueil.setStyle("-fx-background-color:#00359B;");
        btnValider.setStyle("-fx-background-color:#00359B;");
    }
    
    @FXML
    void retourAccueil() {
        Main.retourAccueil();
    }
    
    @FXML
    void valider() {
        if (0 <= champPseudo.getText().length()) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vou n'avez renseigné aucun pseudo"); 
            boiteAlerte.showAndWait();
        } else if (0 <= champMotDePasse.getText().length()) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vou n'avez renseigné aucun mot de passe"); 
            boiteAlerte.showAndWait();
        } else if (0 <= confirmationMotDePasse.getText().length()) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vou n'avez pas confirmé votre mot de passe"); 
            boiteAlerte.showAndWait();
        }
    }
}
