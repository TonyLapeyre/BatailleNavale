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
        positionValide(position);
        this.listeBateauRestant.add(new Bateau(nom,position));
    }

    /** 
     * Vérifie que le bateau n'entre pas en collision avec un autre bateau
     */
    private void positionValide(int[][] position) {
        for (int numB = 0; numB < listeBateauRestant.size(); numB++) {
            if (position[0][0] == position[1][0]) {
                if (listeBateauRestant.get(numB).getPosition()[0][0] 
                        == listeBateauRestant.get(numB).getPosition()[1][0]
                         && position[0][0] 
                         == listeBateauRestant.get(numB).getPosition()[0][0]) {
                    for (int y = position[0][1]; y < position[1][1]; y++) {
                        if (listeBateauRestant.get(numB).getPosition()[0][1] <= y 
                            && y <= listeBateauRestant.get(numB).getPosition()[1][1]) {
                            throw new IllegalArgumentException(
                                    "Ce bateau chevauche un autre bateau");
                        }
                    }
                } else {
                    for (int y = position[0][0]; y < position[1][0]; y++) {
                        if (y == listeBateauRestant.get(numB).getPosition()[0][1]) {
                            for (int x = listeBateauRestant.get(numB).getPosition()[0][0];
                                    x < listeBateauRestant.get(numB).getPosition()[1][0];
                                    x++) {
                               if (x == position[0][0]) {
                                   throw new IllegalArgumentException(
                                           "Ce bateau chevauche un autre bateau");
                               }
                            }  
                        }
                    }
                }
            } else {
                if (listeBateauRestant.get(numB).getPosition()[0][0] 
                        == listeBateauRestant.get(numB).getPosition()[1][0]) {
                    for (int x = position[0][0]; x < position[1][0]; x++) {
                        if (x == listeBateauRestant.get(numB).getPosition()[0][0]) {
                            for (int y = listeBateauRestant.get(numB).getPosition()[0][1];
                                    y < listeBateauRestant.get(numB).getPosition()[1][1];
                                    y++) {
                               if (y == position[0][1]) {
                                   throw new IllegalArgumentException(
                                           "Ce bateau chevauche un autre bateau");
                               }
                            }  
                        }
                    }
                } else {
                    if (position[0][1] == listeBateauRestant.get(numB).getPosition()[0][1]) {
                        for (int x = position[0][0]; x < position[1][1]; x++) {
                            if (listeBateauRestant.get(numB).getPosition()[0][0] <= x 
                                && x <= listeBateauRestant.get(numB).getPosition()[1][0]) {
                                throw new IllegalArgumentException(
                                        "Ce bateau chevauche un autre bateau");
                            }
                        }
                    }
                }
            }
        }        
    }

    /** @return valeur de pseudo */
    public String getMDP() {
        return this.motDePasse;
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
   
    /** @return valeur de pseudo */
    public String getPseudo() {
        return pseudo;
    }

    /* non javadoc - @see java.lang.Object#equals(java.lang.Object) */
    /** 
     * @param pseudoJoueur pseudo à comparer
     * @return true si les deux pseudo sont les même
     */
    public boolean pseudoEgaux(String pseudoJoueur) {
        return this.pseudo.equals(pseudoJoueur);
    }
}