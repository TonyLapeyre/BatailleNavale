/*
 * Joueur.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package sae.bataillenavale;

import java.util.*;

/** 
 * Cette classe va permettre de créer un joueur pour jouer à la bataille navale
 * @author rayanibrahime
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
    private boolean[][] tirEffectuer;
    
    /**
     * Tableau qui initialise tirEffectuer
     */
    final private boolean[][] TIR_INITIALE = {
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
     * Liste qui indique le nombre de restant au joueur 
     */
    //private List<Bateau> listeBateauRestant;

    /**
     * @param pseudo
     */
    public Joueur(String pseudo) {
        this.pseudo = pseudo;
        this.tirEffectuer = TIR_INITIALE;
        //this.listeBateauRestant = listeBateauRestant;
    }

    /** @return valeur de pseudo */
    public String getPseudo() {
        return pseudo;
    }

    /** @return valeur de tirEffectuer */
    public boolean[][] getTirEffectuer() {
        return tirEffectuer;
    }

    /** @param tirEffectuer nouvelle valeur de tirEffectuer */
    public void setTirEffectuer(boolean[][] tirEffectuer) {
        this.tirEffectuer = tirEffectuer;
    }
    /** @return une liste avec les bateaux non coulés*/
    //public Bateau getListeBateauRestant() {
        //return listeBateauRestant;
    //}
}
