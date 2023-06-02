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
    
    private Joueur joueurActif;

    /**
     * Constructeur de la partie
     * @param joueur1 un des deux joueurs
     * @param joueur2 un des deux joueurs
     * @param partieFini état de la partie
     */
    public BatailleNavale(Joueur joueur1, Joueur joueur2) {
        this.partieFini = false;
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.joueurActif = (int)(Math.random()*2) == 0 ? this.joueur1
                                                       : this.joueur2;
    }
    
    /**
     * Positionne les bateaux du joueur
     * Vérifie que les bateaux ne sont pas adjacent 
     * @param numéroJoueur numéro du joueur
     * @param nomB nom du bateau
     * @param position position du bateau
     */
    public void positionnerBateaux (String nomB, int[][]position) {
        this.joueurActif.positionnerBateau(nomB, position);
    }
    
    /**
     * Effectue un tir
     * @param x abscisses du tir
     * @param y ordonnées du tir
     */
    public void tirer (int x, int y) {
        this.joueurActif.tirer(x, y);
    }
    
    /** 
     * Change le joueur actif
     * @param mdpJoueurNonActif mot de passe du joueur qui souhaite prendre la main
     * @throws Exception si le mot de passe est incorrecte
     */
    public void changerJoueurActif(String mdpJoueurNonActif) throws Exception {
        if (this.joueurActif == this.joueur1) {
            if (this.joueur2.getMDP() == mdpJoueurNonActif) {
                throw new Exception(); // TODO créer une exception spécifique
            }
            this.joueurActif = this.joueur2;
        } else {
            if (this.joueur1.getMDP() == mdpJoueurNonActif) {
                throw new Exception(); // TODO créer une exception spécifique
            }
            this.joueurActif = this.joueur1;
        }
    }
    
    /**
     * Vérifie que les deux joueurs possèdent encore des bateaux
     * @return true si un des deux joueurs n'a plus de bateaux
     */
    public boolean isPartieFini() {
        return this.joueur1.getListeBateauRestant().size() == 0 
                && this.joueur2.getListeBateauRestant().size() == 0;
    }
}
