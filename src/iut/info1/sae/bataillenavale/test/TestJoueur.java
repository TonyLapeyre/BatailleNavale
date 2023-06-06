/*
 * TestJoueur.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import iut.info1.sae.bataillenavale.Joueur;
import iut.info1.sae.bataillenavale.Bateau;

/** 
 * Classe de test de la classe Joueur
 * @author rayan.ibrahime
 * @author tom.jammes
 */
class TestJoueur {
    
    /**
     * Liste contenant les données de joueurs
     */
    private List <Joueur> listeJoueurs;
    
    /**
     * Tableau testant que le joueur n'a effectué aucun tir
     */
    private boolean[][] TIR_INITIALE = {
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
     * Liste de joueurs
     */
    @BeforeEach
    void initialiseJoueur() {
        listeJoueurs = new ArrayList<>();
   /*0*/listeJoueurs.add(new Joueur("Atom", "motdepasse"));
   /*1*/listeJoueurs.add(new Joueur("aispikinglish", "azerty123456"));
   /*2*/listeJoueurs.add(new Joueur("Nivak", "1axFz5q99"));
   }
    
    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Joueur#getPseudo()}.
     */
    @Test
    void testGetMDP() {
        final String[] MDP_OK = {
                "motdepasse", "azerty123456", "1axFz5q99"
        };
        for (int i = 0; i < MDP_OK.length; i++) {
            assertEquals(MDP_OK[i], listeJoueurs.get(i).getMDP());
        }
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Joueur#getCaseTiree()}.
     */
    @Test
    void testGetCaseTiree() {
        assertArrayEquals(TIR_INITIALE, listeJoueurs.get(1).getCasesTirees());
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Joueur#setTirEffectuer(boolean[][])}.
     */
    @Test
    void testSetTirEffectuer() {
        assertEquals(listeJoueurs.get(2).getCasesTirees()[2][5], false);
        listeJoueurs.get(2).tirer(2,5);
        assertEquals(listeJoueurs.get(2).getCasesTirees()[2][5], true);
    }

    /**
     * Test method for {@link sae.bataillenavale.Joueur#getListeBateauRestant()}.
     */
    @Test
    void testGetListeBateauRestant() {
        int[][] placementPACorrect = {{0,0},{0,4}};
        int[][] placementTCorrect = {{2,0},{3,0}};
        int[][] placementCCorrect = {{9,9},{9,6}};
        Bateau croiseurTest = new Bateau("Croiseur", placementCCorrect);
        
        listeJoueurs.get(0).positionnerBateau("Porte-avion", placementPACorrect);
        listeJoueurs.get(0).positionnerBateau("Torpilleur", placementTCorrect);
        listeJoueurs.get(0).positionnerBateau("Croiseur", placementCCorrect);
        
        assertEquals(listeJoueurs.get(0).getListeBateauRestant().size(),3);
        assertEquals(listeJoueurs.get(0).getListeBateauRestant().get(2).getPosition(),croiseurTest.getPosition());
    }
    
    /**
     * Test method for {@link sae.bataillenavale.Joueur#positionnerBateau()}.
     */
    @Test
    void testPositionnerBateau() {
        int[][] placementTorpilleur = {{0,0},{0,1}};
        int[][] placementContreTorpilleur = {{1,0},{1,2}};
        int[][] placementContreTorpilleur2 = {{2,0},{2,2}};
        int[][] placementCroiseur = {{3,0},{3,3}};
        int[][] placementPorteAvion = {{4,0},{4,4}};
        
        listeJoueurs.get(0).positionnerBateau("Torpilleur", placementTorpilleur);
        listeJoueurs.get(0).positionnerBateau("Contre-torpilleur", placementContreTorpilleur);
        listeJoueurs.get(0).positionnerBateau("Contre-torpilleur", placementContreTorpilleur2);
        listeJoueurs.get(0).positionnerBateau("Croiseur", placementCroiseur);
        listeJoueurs.get(0).positionnerBateau("Porte-avion", placementPorteAvion);
    }
    
    /**
     * Test method for {@link sae.bataillenavale.Joueur#getListeBateauRestant()}.
     */
    @Test
    void testTirer() {
        
        listeJoueurs.get(0).tirer(2,5);
        listeJoueurs.get(0).tirer(8,9);
        listeJoueurs.get(0).tirer(2,6);
    
        assertThrows(ArrayIndexOutOfBoundsException.class, ()-> listeJoueurs.get(0).tirer(15,5));
        
        assertThrows(IllegalArgumentException.class, ()-> listeJoueurs.get(0).tirer(2,5));
        assertThrows(IllegalArgumentException.class, ()-> listeJoueurs.get(0).tirer(8,9));
        listeJoueurs.get(0).tirer(3,4);
    } 
}
