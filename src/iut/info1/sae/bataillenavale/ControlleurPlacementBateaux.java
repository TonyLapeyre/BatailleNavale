/*
 * ControlleurRegles.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Classe controleur qui établit un lien entre 
 * les vues en FXML et le modèle BatailleNavale
 * @author tom.jammes
 */
public class ControlleurPlacementBateaux {
    
    @FXML
    private Button btnRetour;
    @FXML
    private Button btnValider;
    @FXML
    private TextField xTorpilleurAvant;
    @FXML
    private TextField xTorpilleurArriere;
    @FXML
    private TextField yTorpilleurAvant;
    @FXML
    private TextField yTorpilleurArriere;
    @FXML
    private TextField xContreTorpilleur1Avant;
    @FXML
    private TextField xContreTorpilleur1Arriere;
    @FXML
    private TextField yContreTorpilleur1Avant;
    @FXML
    private TextField yContreTorpilleur1Arriere;
    @FXML
    private TextField xContreTorpilleur2Avant;
    @FXML
    private TextField xContreTorpilleur2Arriere;
    @FXML
    private TextField yContreTorpilleur2Avant;
    @FXML
    private TextField yContreTorpilleur2Arriere;
    @FXML
    private TextField xCroiseurAvant;
    @FXML
    private TextField xCroiseurArriere;
    @FXML
    private TextField yCroiseurAvant;
    @FXML
    private TextField yCroiseurArriere;
    @FXML
    private TextField xPorteAvionAvant;
    @FXML
    private TextField xPorteAvionArriere;
    @FXML
    private TextField yPorteAvionAvant;
    @FXML
    private TextField yPorteAvionArriere;
       
    
    @FXML
    void visualiserClick() {
        if (btnRetour.isHover()) {
            btnRetour.setStyle("-fx-background-color:#00266F;");
        } else if (btnValider.isHover()) {
            btnValider.setStyle("-fx-background-color:#00266F;");
        }
    }
    
    @FXML
    void visualiserNonClick() {
        btnRetour.setStyle("-fx-background-color:#00359B;");
        btnValider.setStyle("-fx-background-color:#00359B;");
    }
    
    @FXML
    void retourCreaJoueur() {
        Main.chargerCreationJoueur();
    }
    
    @FXML
    void valider() {
        try {
            int [][] positionTorpilleur 
            = {{conversionInt(xTorpilleurAvant.getText()),
                Integer.valueOf(yTorpilleurAvant.getText())-1},
                    {conversionInt(xTorpilleurArriere.getText()),
                    Integer.valueOf(yTorpilleurArriere.getText())-1}};
            
            int [][] positionContreTorpilleurA 
            = {{conversionInt(xContreTorpilleur1Avant.getText()),
                Integer.valueOf(yContreTorpilleur1Avant.getText())-1},
                    {conversionInt(xContreTorpilleur1Arriere.getText()),
                    Integer.valueOf(yContreTorpilleur1Arriere.getText())-1}};

            int [][] positionContreTorpilleurB 
            = {{conversionInt(xContreTorpilleur2Avant.getText()),
                Integer.valueOf(yContreTorpilleur2Avant.getText())-1},
                    {conversionInt(xContreTorpilleur2Arriere.getText()),
                    Integer.valueOf(yContreTorpilleur2Arriere.getText())-1}};
            
            int [][] positionCroiseur 
            = {{conversionInt(xCroiseurAvant.getText()),
                Integer.valueOf(yCroiseurAvant.getText())-1},
                    {conversionInt(xCroiseurArriere.getText()),
                    Integer.valueOf(yCroiseurArriere.getText())-1}};
            
            int [][] positionPorteAvion 
            = {{conversionInt(xPorteAvionAvant.getText()),
                Integer.valueOf(yPorteAvionAvant.getText())-1},
                    {conversionInt(xPorteAvionArriere.getText()),
                    Integer.valueOf(yPorteAvionArriere.getText())-1}};
            
            BatailleNavale.positionnerBateaux("Torpilleur", positionTorpilleur);
            BatailleNavale.positionnerBateaux("Contre-Torpilleur", positionContreTorpilleurA);
            BatailleNavale.positionnerBateaux("Contre-Torpilleur", positionContreTorpilleurB);
            BatailleNavale.positionnerBateaux("Croiseur", positionCroiseur);
            BatailleNavale.positionnerBateaux("Porte-Avion", positionPorteAvion);
            Main.changerJoueur();
        } catch (IllegalArgumentException erreur) {
            Alert boiteAlerte = new Alert(Alert.AlertType.WARNING);
            boiteAlerte.setHeaderText("Un des bateaux est mal positionné"); 
            boiteAlerte.showAndWait();
        }
    }
    
    private static int conversionInt(String lettre) {
        return lettre.toUpperCase().charAt(0)-65;
    }
}
