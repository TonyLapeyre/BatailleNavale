/*
 * CompterLettre.java                                      22 mai 2023
 * IUT Rodez, info1 2023-2023, pas de copyrigth ni de "copyleft"
 */
package iut.info1.sae.bataillenavale;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
 
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
public class BatailleNavale extends Application {
    
 @Override
 public void start(Stage primaryStage) throws Exception {

 /* créaton d'un chargeur de code FXML */
 FXMLLoader chargeurFXML = new FXMLLoader();

 /*
 * on indique au chargeur la vue à charger
 */
 chargeurFXML.setLocation(getClass().getResource("accueil.fxml"));

 Parent racine = chargeurFXML.load();

 Scene scene = new Scene(racine);
 
 scene.getStylesheets().add(getClass().getResource("accueil.css").toExternalForm());
 
 
 
 
 // on définit le titre, la hauteur et la largeur de la fenêtre
 primaryStage.setTitle("Bataille Navale");
 primaryStage.setHeight(1000);
 primaryStage.setWidth(1800);
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 /**
 * Lancement de l'application
 * @param args argument non utilisé
 */
 public static void main(String[] args) {
 launch(args);
 }
} 