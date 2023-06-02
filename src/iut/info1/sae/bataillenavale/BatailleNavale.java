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
    
    private Joueur vainqueur;
    
    private Joueur joueur1;
    
    private Joueur joueur2;

    /**
     * Constructeur de la partie
     * 
     * @param joueur1 un des deux joueurs de la partie
     * @param joueur2 un des deux joueurs de la partie
     * @param partieFini état de la partie
     */
    public BatailleNavale(Joueur joueur1, Joueur joueur2) {
        this.partieFini = false;
    }
    
    /** 
     * Définit la partie comme finie et définit le nom du vainqueur 
     * 
     * @param vainqueur Joueur qui a gagné la partie
     */
    public void setPartieFini(Joueur vainqueur) {
        this.partieFini = true;
        this.vainqueur = vainqueur;
    }
}
