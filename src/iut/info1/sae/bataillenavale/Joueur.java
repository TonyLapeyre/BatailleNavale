/*
 * Joueur.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

import java.util.*;

/** 
 * Cette classe va permettre de créer un joueur pour jouer à la bataille navale
 * @author rayan.ibrahime
 * @author tom.jammes
 */
public class Joueur {
    
    /**
     * Pour obtenir le nom ou le pseudo de notre joueur
     */
    private String pseudo;
    
    /**
     * mot de passe du joueur 
     */
    private String motDePasse;
    
    /**
     * Tableau de boolean initialisé avec une constante
     */
    private boolean[][] casesTirees;
    
    /**
     * Taille de la grille standard
     */
    private final int TAILLE_STANDARD = 10;
    
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
    private List<Bateau> listeBateauRestant;

    /**
     * @param pseudo nom du joueur
     * @param mdp mot de passe du joueur
     */
    public Joueur(String pseudo, String mdp) {
        this.pseudo = pseudo;
        this.motDePasse = mdp;
        
        this.listeBateauRestant = new ArrayList<>(5);
        this.casesTirees = new boolean[TAILLE_STANDARD][TAILLE_STANDARD];
        
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                this.casesTirees[x][y] = false;
            }
        }
    }
    
    /** 
     * Ajoute un nouveau bateau à la liste de bateaux restants
     * @param nom nom du bateau
     * @param position position du bateau
     */
    public void positionnerBateau(String nom, int[][]position) {
        this.listeBateauRestant.add(new Bateau(nom,position));
    }

    /** @return valeur de pseudo */
    public String getPseudo() {
        return this.pseudo;
    }

    /** @return valeur de casesTirees */
    public boolean[][] getCasesTirees() {
        return this.casesTirees;
    }
    
    /** @return valeur de nbTirEffectué */
    public int getNbTirEffectue() {
        return this.nbTirEffectue;
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
    public List<Bateau> getListeBateauRestant() {
        return this.listeBateauRestant;
    }
    
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