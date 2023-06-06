/*
 * ControleurJeu.java                                      6 juin 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/** 
 * Cette classe va contrôler les tirs de chaque joueur
 * @author rayanibrahime
 *
 */
public class ControleurJeu {
    
    @FXML
    private MenuItem abandon;
    
    @FXML
    private MenuItem quitter;
    
    @FXML
    private TextField coordonneeX;
    
    @FXML
    private TextField coordonneeY;
    
    @FXML
    void abandonDeLaPartie() {
        /*
         * Création d'une boîte d'alerte de type confirmation.
         * Elle est dotée de 3 boutons : oui et annuler
         */
         Alert boiteAlerte = new Alert(Alert.AlertType.CONFIRMATION,
         "Confirmez-vous votre choix d'abandonner la partie?",
         ButtonType.YES, ButtonType.CANCEL);

         Optional<ButtonType> option = boiteAlerte.showAndWait();
         if (option.get() == ButtonType.YES) { // clic sur "oui"
             Main.retourAccueil();
         } else if (option.get() == ButtonType.CANCEL) {
             
         }
    }
    
    @FXML
    void QuitterLeJeu() {
        /*
         * Création d'une boîte d'alerte de type confirmation.
         * Elle est dotée de 3 boutons : oui et annuler
         */
         Alert boiteAlerte = new Alert(Alert.AlertType.CONFIRMATION,
         "Confirmez-vous votre choix de quitter le jeu?",
         ButtonType.YES, ButtonType.CANCEL);

         Optional<ButtonType> option = boiteAlerte.showAndWait();
         if (option.get() == ButtonType.YES) { // clic sur "oui"
             Main.quitterJeu();
         } else if (option.get() == ButtonType.CANCEL) {
             
         }    
     }
    
    @FXML
    void validerCoordonne() {
        if (0 >= coordonneeX.getText().length()) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vous n'avez renseigné aucune coordonnée "
                    + "pour X"); 
            boiteAlerte.showAndWait();
        } else if (coordonneeX.getText().length() > 1) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vous avez renseigné une coordonnée pour X "
                    + "non prsie en compte"); 
            boiteAlerte.showAndWait();
        } else if (0 >= coordonneeY.getText().length()) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vous n'avez renseigné aucune coordonnée "
                    + "pour Y"); 
            boiteAlerte.showAndWait();
        } else if (coordonneeY.getText().length() > 1) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vous avez renseigné une coordonnée pour Y "
                    + "non prsie en compte");
            boiteAlerte.showAndWait();
        } else {
            int cordX = Integer.parseInt(coordonneeX.getText());
            int cordY = Integer.parseInt(coordonneeY.getText());
            BatailleNavale.tirer(cordX, cordY);
        }
    }
}
