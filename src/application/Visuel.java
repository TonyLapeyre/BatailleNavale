package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;



/** TODO comment class responsibility (SRP)
 * @author rayanibrahime
 *
 */
public class Visuel extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception { // créaton d'un chargeur de code FXML
    FXMLLoader chargeurFXML = new FXMLLoader();
            /*
             *  on indique au chargeur quelle est la vue fxml qu'il devra charger :
             *  ici VueExemple1.fxml
             */
            chargeurFXML.setLocation(getClass().getResource("ProtoVisuel.fxml"));
    /*
    * création d'un objet de type parent qui est initialisé avec le résultat du
    * chargement de la vue FXML. Ou dit autrement le code écrit en FXML est transformé * en un objet Java
    */
    Parent racine = chargeurFXML.load();
    
    Scene scene = new Scene(racine);
            // on définit le titre, la hauteur et la largeur de la fenêtre
            primaryStage.setTitle("Compter caractères");
            primaryStage.setHeight(300);
            primaryStage.setWidth(500);
            primaryStage.setScene(scene);
            primaryStage.show();
    }
	
	/** TODO comment method role
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
