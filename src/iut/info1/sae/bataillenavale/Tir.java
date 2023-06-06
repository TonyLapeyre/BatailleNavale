/*
 * Tir.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale;

/** 
 * Représentation d'un tir dans le jeu de la bataille navale
 * @author tom.jammes
 */
public class Tir {
    
    /**
     * abscisse du tir
     */
    private int x;
    
    /**
     * ordonné du tir
     */
    private int y;
    
    /**
     * Référence de la réussite du tir
     */
    private boolean tirReussi;

    /** 
     * Création d'un nouveau tir
     * @param x coordonné x du tir
     * @param y coordonné y du tir
     * @param tirReussi valeur de réussite du tir
     */
    public Tir(int x, int y, boolean tirReussi) {
        if (!isValide(x, y)) {
            throw new IllegalArgumentException("Les coordonnés fournit sont incorrectes");
        }
        this.x = x;
        this.y = y;
        this.tirReussi = tirReussi;
    }
   
    /**
     * Vérifie que les coordonné entrées pour le tir sont correctes :
     * Elles doivent se situer entre 0 et 9 
     * @param x coordonné x du tir
     * @param y coordonné y du tir
     * @return
     */
    private boolean isValide(int x, int y) {
        return 0 <= x && x <= 9
                && 0 <= y && y <= 9;
    }

    /** @return valeur de x */
    public int getX() {
        return this.x;
    }

    /** @return valeur de y */
    public int getY() {
        return this.y;
    }
    
    /** @return true si le tir est réussi */
    public boolean isTirReussi() {
        return this.tirReussi;
    }
}