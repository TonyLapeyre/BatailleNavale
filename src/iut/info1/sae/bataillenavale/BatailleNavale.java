/*
 * BatailleNavale.java                                      10 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

/** 
 * Jeux de la bataille navale
 * Le jeux comporte deux joueurs qui possèdent chacun une flotte de 5 bateaux
 * Le but du jeux et de toucher et couler tout les bateaux adverse
 * 
 * @author tom.jammes
 */
public class BatailleNavale {
    
    private boolean partieFini;
    
//    private Joueur vainqueur;

    /**
     * Constructeur de la partie
     * 
     * @param partieFini 
     */
    public BatailleNavale(boolean partieFini) {
        this.partieFini = partieFini;
    }
    
    /** 
     * Définit la partie comme finie et définit le nom du vainqueur 
     * 
     * @param vainqueur Joueur qui a gagné la partie
     */
    private void setPartieFini(/*Joueur vainqueur*/) {
        this.partieFini = true;
//        this.vainqueur = vainqueur();
    }

    /**
     * Fonction de lancement du jeux
     * 
     * @param args
     */
    public static void main(String[] args) {
        

    }
}
