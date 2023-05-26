/*
 * Joueur.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

import java.util.*;

/** 
 * Cette classe va permettre de créer un joueur pour jouer à la bataille navale
 * @author rayanibrahime
 * @author tom.jammes
 *
 */
public class Joueur {
    
    /**
     * Pour obtenir le nom ou le pseudo de notre joueur
     */
    private String pseudo;
    
    /**
     * Tableau de boolean initialisé avec une constante
     */
    private boolean[][] casesTirees;
    
    /**
     * Tableau qui initialise casesTirees
     */
    final private static boolean[][] TIR_INITIALE = {
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
        {false,false,false,false,false,false,false,false,false,false},
    };
    
    /**
     * Liste des tirs effectué
     */
    private List<Tir> listeTirsEffectue = new ArrayList<>(100);
    
    /**
     * Nombre de tir effectué
     */
    private int nbTirEffectue;
    
    /**
     * Liste qui indique le nombre de restant au joueur 
     */
    //private List<Bateau> listeBateauRestant;

    /**
     * @param pseudo
     */
    public Joueur(String pseudo) {
        this.pseudo = pseudo;
        this.casesTirees = TIR_INITIALE;
        //this.listeBateauRestant = listeBateauRestant;
    }

    /** @return valeur de pseudo */
    public String getPseudo() {
        return pseudo;
    }

    /** @return valeur de casesTirees */
    public boolean[][] getCasesTirees() {
        return casesTirees;
    }
    
    /** @return valeur de nbTirEffectué */
    public int getNbTirEffectue() {
        return nbTirEffectue;
    }

    /** 
     * casesTirees nouvelle valeur de casesTirees 
     * @param x abscisse du tir
     * @param y ordonné du tir
     */
    private void setTirEffectuer(int x, int y) {
        this.casesTirees[x][y] = true;
    }
    
    /**
     * Vérifier que le tir du joueur à touche la cible 
     * @return true si le joueur
     */
    private boolean verifierTirReussi() {
        return true;//STUB
    }
    
    /** @return une liste avec les bateaux non coulés*/
    //public Bateau getListeBateauRestant() {
        //return listeBateauRestant;
    //}
    
    /**
     * Action de tirer, créer un nouveau objet Tir ajouté à la liste des tirs
     * @param x abscisse du tir
     * @param y ordonné du tir
     * @throws IllegalArgumentException si les coordonnées du tir ont déjà été 
     *                                  effectué pour un autre tir
     */
    public void tirer(int x, int y) throws IllegalArgumentException {
        if (this.casesTirees[x][y]) {
            throw new IllegalArgumentException(
                    "Les coordonnées ont deja été utilisé pour un autre tir");
            
        }
        this.setTirEffectuer(x,y);            
        this.listeTirsEffectue.add(new Tir(x,y,false));
    }
}