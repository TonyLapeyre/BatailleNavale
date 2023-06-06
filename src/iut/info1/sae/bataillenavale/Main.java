/*
 * Main.java                                      22 mai 2023
 * IUT Rodez, info1 2023-2023, pas de copyrigth ni de "copyleft"
 */
package iut.info1.sae.bataillenavale;

import javafx.application.Application;
import javafx.application.Platform;
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
     private static Scene sceneRegle;
     private static Scene sceneAccueil;
     private static Scene sceneCreationJoueur;
     private static Scene sceneContinuerPartie;
     private static Scene scenePlacement;
     private static Scene sceneChangementJoueur;
     private static Scene sceneJeu;
     
     @Override
     public void start(Stage primaryStage) throws Exception {
        
         /* on crée la vue de l'accueil */
         FXMLLoader chargeurFXML = new FXMLLoader();

         chargeurFXML.setLocation(getClass().getResource("vuesFXML/accueil.fxml"));
        
         Parent accueil = chargeurFXML.load();
        
         sceneAccueil = new Scene(accueil);
         
         sceneAccueil.getStylesheets().add(getClass().getResource("css/accueil.css").toExternalForm());
         
         /* On crée la vue règles */
         FXMLLoader chargeurFXMLRegle = new FXMLLoader();
         chargeurFXMLRegle.setLocation(getClass().getResource("vuesFXML/regle.fxml"));
         Parent regles = chargeurFXMLRegle.load();
         sceneRegle = new Scene(regles);
         sceneRegle.getStylesheets().add(getClass().getResource("css/accueil.css").toExternalForm());
         
         /* On crée la vue CreationJoueur */
         FXMLLoader chargeurFXMLCreerJoueur = new FXMLLoader();
         chargeurFXMLCreerJoueur.setLocation(getClass().getResource("vuesFXML/creationJoueur.fxml"));
         Parent creationJoueur = chargeurFXMLCreerJoueur.load();
         sceneCreationJoueur = new Scene(creationJoueur);
         sceneCreationJoueur.getStylesheets().add(getClass().getResource("css/accueil.css").toExternalForm());
         
         /* On crée la vue placementBateau */
         FXMLLoader chargeurFXMLPlacement = new FXMLLoader();
         chargeurFXMLPlacement.setLocation(getClass().getResource("vuesFXML/placementBateaux.fxml"));
         Parent placement = chargeurFXMLPlacement.load();
         scenePlacement = new Scene(placement);
         scenePlacement.getStylesheets().add(getClass().getResource("css/accueil.css").toExternalForm());
         
         /* On crée la vue changementJoueur */
         FXMLLoader chargeurFXMLChangerJoueur = new FXMLLoader();
         chargeurFXMLChangerJoueur.setLocation(getClass().getResource("vuesFXML/changementJoueur.fxml"));
         Parent changerJoueur= chargeurFXMLChangerJoueur.load();
         sceneChangementJoueur = new Scene(changerJoueur);
         sceneChangementJoueur.getStylesheets().add(getClass().getResource("css/accueil.css").toExternalForm());
         
         /* On crée la vue changementJoueur */
         FXMLLoader chargeurFXMLJeu = new FXMLLoader();
         chargeurFXMLJeu.setLocation(getClass().getResource("vuesFXML/jeu.fxml"));
         Parent changerJeu = chargeurFXMLJeu.load();
         sceneJeu = new Scene(changerJeu);
         sceneJeu.getStylesheets().add(getClass().getResource("css/accueil.css").toExternalForm());
         
         // on définit le titre, la hauteur et la largeur de la fenêtre
         primaryStage.setTitle("Bataille Navale");
         primaryStage.setHeight(1000);
         primaryStage.setWidth(1800);
         primaryStage.setScene(sceneAccueil);
         fenetrePrincipale = primaryStage;
         primaryStage.show();
     }
     
     /** 
      * Change la fenetre pour passer sur la fenetre "ContinuerPartie"
      */
      public static void continuerPartie() {
          // TODO ecrire le corps
      }
     
     /** 
      * Change la fenetre pour passer sur la fenetre "CreationJoueur"
      */
      public static void chargerCreationJoueur() {
         fenetrePrincipale.setScene(sceneCreationJoueur);
      }
      
      /**
       * Change la fenêtre pour passer sur la fenêtre "placement"
       */
      public static void placementBateaux() {
          fenetrePrincipale.setScene(scenePlacement);
      }
     
     /** 
     * Change la fenettre pour passer sur la fenetre "Règles"
     */
     public static void chargerRegle() {
        fenetrePrincipale.setScene(sceneRegle);
     }
     
     /** 
      * Change la fenettre pour passer sur la fenetre "Règles"
      */
      public static void chargerJeu() {
         fenetrePrincipale.setScene(sceneJeu);
      }
     
     /** 
      * Change la fenetre pour passer sur la fenetre "CreationJoueur"
      */
      public static void changerJoueur() {
         fenetrePrincipale.setScene(sceneChangementJoueur);
      }
     
     /**
      * Ferme l'application JavaFX
      */
     public static void quitterJeu() {
         Platform.exit();
     }
     
     /**
      * Ferme l'application JavaFX
      */
     public static void retourAccueil() {
         fenetrePrincipale.setScene(sceneAccueil);
     }
     
     /**
     * Lancement de l'application
     * @param args argument non utilisé
     */
     public static void main(String[] args) {
     launch(args);
     }
} 