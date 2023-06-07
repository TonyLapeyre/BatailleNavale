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
    
    private static boolean partieFini;
    
    private static Joueur vainqueur;
    
    private static Joueur joueur1;
    
    private static Joueur joueur2;
    
    private static Joueur joueurActif;

    /**
     * méthode de création de la partie 
     * @param j1 un des deux joueurs
     * @param j2 un des deux joueurs
     * @param partieFini état de la partie
     */
    public static void nouvellePartie(Joueur j1, Joueur j2) {
        partieFini = false;
        joueur1 = j1;
        joueur2 = j2;
        joueurActif = (int)(Math.random()*2) == 0 ? joueur1
                                                       : joueur2;
    }
    
    /**
     * Positionne les bateaux du joueur
     * Vérifie que les bateaux ne sont pas adjacents 
     * @param numéroJoueur numéro du joueur
     * @param nomB nom du bateau
     * @param position position du bateau
     */
    public static void positionnerBateaux (String nomB, int[][]position) {
        joueurActif.positionnerBateau(nomB, position);
    }
    
    /**
     * Effectue un tir
     * @param x abscisses du tir
     * @param y ordonnées du tir
     */
    public static void tirer (int x, int y) {
        joueurActif.tirer(x, y);
    }
    
    /** 
     * Change le joueur actif
     * @param mdpJoueurNonActif mot de passe du joueur qui souhaite prendre la main
     * @throws Exception si le mot de passe est incorrecte
     */
    public static void changerJoueurActif(String mdpJoueurNonActif) throws Exception {
        if (joueurActif.pseudoEgaux(joueur1.getPseudo())) {
            if (!joueur2.getMDP().equals(mdpJoueurNonActif)) {
                throw new Exception(); // TODO créer une exception spécifique
            }
            joueurActif = joueur1;
        } else {
            if (!joueur1.getMDP().equals(mdpJoueurNonActif)) {
                throw new Exception(); // TODO créer une exception spécifique
            }
            joueurActif = joueur2;
        }
    }
    
    /**
     * Vérifie que les deux joueurs possèdent encore des bateaux
     * @return true si un des deux joueurs n'a plus de bateaux
     */
    public static boolean isPartieFini() {
        return joueur1.getListeBateauRestant().size() == 0 
                && joueur2.getListeBateauRestant().size() == 0;
    }

    /** TODO comment method role
     * @return pseudo
     */
    public static String nomJoueurNonActif() {
        if (joueurActif.pseudoEgaux(joueur1.getPseudo())) {
            return joueur2.getPseudo();
        } else {
            return joueur1.getPseudo();
        }
    }
}