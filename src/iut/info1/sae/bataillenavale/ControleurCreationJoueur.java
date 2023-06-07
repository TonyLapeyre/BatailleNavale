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
 * la vue creationJoueur.fxml et le modèle BatailleNavale
 * @author tom.jammes
 * @author rayan.ibrahime
 */
public class ControleurCreationJoueur {
    
    /* Bouton qui fait revenir à l'accueil */
    @FXML
    private Button btnAccueil;
    
    /* Bouton qui valide les choix des pseudos et mots de passes*/
    @FXML
    private Button btnValider;
    
    /* Récupère le pseudo du joueur 1 */
    @FXML
    private TextField champPseudoJ1;
    
    /* Récupère le mot de passe du joueur 1 */
    @FXML
    private PasswordField champMotDePasseJ1;
    
    /* Récupère le pseudo du joueur 2 */
    @FXML
    private TextField champPseudoJ2;
    
    /* Récupère le mot de passe du joueur 2 */
    @FXML
    private PasswordField champMotDePasseJ2;

    
   
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
    
    /* Lie l'action à btnAccueil */
    @FXML
    void retourAccueil() {
        Main.retourAccueil();
    }
    
    /* Lie l'action à btnValider */
    @FXML
    void valider() {
        /* 
         * Vérifie qu'un pseudo vide n'est pas entré 
         * à champPseudoJ1 et champPseudoJ2
         */
        if (0 >= champPseudoJ1.getText().length() 
                || 0 >= champPseudoJ2.getText().length()) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vous n'avez renseigné aucun pseudo"); 
            boiteAlerte.showAndWait();
        
       /* 
        * Vérifie qu'un mot de passe vide n'est pas entré 
        * à champMotDePasseJ1 et champMotDePasseJ2
        */
        } else if (0 >= champMotDePasseJ1.getText().length() 
                || 0 >= champMotDePasseJ2.getText().length()) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Vous n'avez renseigné aucun mot de passe"); 
            boiteAlerte.showAndWait();
            
        /* Enregistre les informations et crée les joueurs de la partie */
        } else {
            champPseudoJ1.setText(champPseudoJ1.getText());
            champMotDePasseJ1.setText(champMotDePasseJ1.getText());
            BatailleNavale.nouvellePartie(new Joueur(champPseudoJ1.getText(),champMotDePasseJ1.getText()), 
                    new Joueur(champPseudoJ2.getText(),champMotDePasseJ2.getText()));
            Main.changerJoueur();
        }
    }
}