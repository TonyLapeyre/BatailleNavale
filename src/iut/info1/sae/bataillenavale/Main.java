/*
 * Main.java                                      22 mai 2023
 * IUT Rodez, info1 2023-2023, pas de copyrigth ni de "copyleft"
 */
package iut.info1.sae.bataillenavale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
 
/**
* Cette classe est la classe principale d'une application JavaFX.
*
* La fenêtre est dotée d'une zone de saisie dans laquelle l'utilisateur sera invité
* à saisir une phrase et une lettre à chercher. 
* L'application affichera ensuite, lors d'un clic sur le bouton
* "Compter", le nombre d'occurence de la lettre dans cette phrase.
* Un clic sur le bouton "Effacer" effacera les valeurs affichée et saisie.
* 
* @author tom.jammes
* @version 1.0
*/
public class Main extends Application {
     
     private static Stage fenetrePrincipale;
     private static Scene sceneTest;    
     
     @Override
     public void start(Stage primaryStage) throws Exception {
        
         /* créaton d'un chargeur de code FXML */
         FXMLLoader chargeurFXML = new FXMLLoader();
         /*
          * on crée la vue de l'accueil
          */
         chargeurFXML.setLocation(getClass().getResource("vuesFXML/accueil.fxml"));
        
         Parent accueil = chargeurFXML.load();
        
         Scene sceneAccueil = new Scene(accueil);
         
         sceneAccueil.getStylesheets().add(getClass().getResource("accueil.css").toExternalForm());
         
         /* On créer la vue test */
         FXMLLoader chargeurFXMLTest = new FXMLLoader();
         chargeurFXMLTest.setLocation(getClass().getResource("vuesFXML/test.fxml"));
        
         Parent test = chargeurFXMLTest.load();
        
         sceneTest = new Scene(test);
         
         // on définit le titre, la hauteur et la largeur de la fenêtre
         primaryStage.setTitle("Bataille Navale");
         primaryStage.setHeight(1000);
         primaryStage.setWidth(1800);
         primaryStage.setScene(sceneAccueil);
         fenetrePrincipale = primaryStage;
         primaryStage.show();
     }
     
     /** TODO comment method role
     * 
     */
     public static void chargerTest() {
        fenetrePrincipale.setScene(sceneTest);
     }
     
     /**
     * Lancement de l'application
     * @param args argument non utilisé
     */
     public static void main(String[] args) {
     launch(args);
     }
} 