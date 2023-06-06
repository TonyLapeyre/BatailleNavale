/*
 * ControlleurChangementJoueur.java                                      6 juin 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

/** Etablit un lien entre la vue demandeMDP.fxml et le modele BatailleNavale
 * @author tony.lapeyre
 *
 */
public class ControleurChangementJoueur {

    @FXML
    private Button btnValider;
    
    @FXML
    private PasswordField champMDP;
    
    @FXML
    void visualiserClick() {
        if (btnValider.isHover()) {
            btnValider.setStyle("-fx-background-color:#00266F;");
        }
    }
    
    @FXML
    void visualiserNonClick() {
        btnValider.setStyle("-fx-background-color:#00359B;");
    }
    
    @FXML 
    void poursuiteJeu() throws Exception {
        if (0 >= champMDP.getText().length()) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vous n'avez renseigné aucun mot de passe"); 
            boiteAlerte.showAndWait();
        }
        BatailleNavale.changerJoueurActif(champMDP.getText());
        Main.changerJoueur();
    }

}