/*
 * Bateau.java                                      10 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

/** TODO comment class responsibility (SRP)
 * @author tony.lapeyre
 *
 */
public class Bateau {
    
    /** Nom d'un bateau du jeu de la bataille navale */
    private String nomB;
    
    /** Compteur de cases non touchées du bateau*/
    private int casesRestantesB;
    
    /** Coordonnées des extrémités du bateau sur la grille*/
    private int[][] position;
    
    private String[] nomBateaux = {"Torpilleur","Contre-torpilleur", 
                    "Croiseur", "Porte-avion"};
    
    /** Initialise le bateau
     * @param nom
     * @param idBateau
     * @param casesRestantes
     * @param position 
     */
    public Bateau (String nom, int[][] position) {
        if (!isValide(nom, position)) {
            throw new IllegalArgumentException("Erreur, le positionnement "
                                               + "du bateau est invalide");
        }
        this.nomB = nom;
        this.casesRestantesB = attribuerCasesRestantes(nom);
        this.position = position;
    }

    /**
     * TODO comment method role reach (SRP)
     */
    private int attribuerCasesRestantes(String nomB) {
        int nbCases;
        nbCases = 2;
        for (int i = 0; i < nomBateaux.length; i++) {
            if(nomB == nomBateaux[i]) {
                return nbCases;
            }
        }
        return 0;
        
    }

    /**
     * Vérifie la conformité du bateau par rapport à la grille, sa taille 
     * et son environnement
     * 
     * @param position 
     * @param casesRestantes 
     * @param nom 
     * @return true si le bateau est bien placé
     *         false si le bateau est mal placé
     */
    private boolean isValide(String nom, int[][] position) {
        if(!positionValide(position)) {
            return false;
        } else if (!nomPositionValide(nom, position)){
            return false;
        }
        return true;
    }

    /**
     * Gère la cohérence du nombre de places prises par un bateau spécifique
     * par rapport à son nom
     * @param position 
     * @param nom 
     * @return true si le position est cohérent par rapport au bateau spécifié
     *         false si le position n'est pas bon
     */
    private boolean nomPositionValide(String nom, int[][] position) {
        
        int nbCases;
        nbCases = 1;
        
        for (int i = 0; i < nomBateaux.length; i++) {
            if(nom == nomBateaux[i]) {
                int j = 0;
                int k = 1;
                    
                if(position[j][j] == position[k][j]) {
                    if(Math.abs(position[j][k] - position[k][k]) != nbCases) {
                        return false;
                    }
                } else {
                    if(Math.abs(position[j][j] - position[k][j]) != nbCases) {
                        return false;
                    }
                }
            }
            nbCases++;
        }
        
        return true;
    }

    /**
     * Gère les erreurs propres au position d'un bateau en général
     * @param position
     * @return true si le bateau est placé correctement sur la grille
     *         false si le bateau n'est pas correctement placé 
     */
    private boolean positionValide(int[][] position) {
        int i = 0;
        int j = 1;
        
        if(position[i][i] != position[j][i] 
                        && position[i][j] != position[j][j]) {
            return false;
        }
        
        for (i = 0; i < position.length; i++) {
            for(j = 0; j < position[i].length; j++) {
                if (position[i][j] < 0) {
                    return false;
                }
            }
        }   
        return true;
    }

    /** @return valeur de casesRestantesB */
    public int getCasesRestantesB() {
        return casesRestantesB;
    }

    /** @param casesRestantesB nouvelle valeur de casesRestantesB */
    public void touche(int casesRestantesB) {
        this.casesRestantesB = casesRestantesB;
    }

    /** @return valeur de position */
    public int[][] getPosition() {
        return this.position;
    }
    
}
