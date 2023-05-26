/*
 * TestJoueurs.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale.tests;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import iut.info1.sae.bataillenavale.Joueur;

import java.util.*;

/** TODO comment class responsibility (SRP)
 * @author rayanibrahime
 *
 */
class TestJoueurs {
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
   /*0*/listeJoueurs.add(new Joueur("Atom"));
   /*1*/listeJoueurs.add(new Joueur("aispikinglish"));
   /*2*/listeJoueurs.add(new Joueur("Nivak"));
       
       
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Joueur#getPseudo()}.
     */
    @Test
    void testGetPseudo() {
        final String[] PSEUDO_OK = {
                "Atom", "aispikinglish", "Nivak"
        };
        for (int i = 0; i < PSEUDO_OK.length; i++) {
            assertEquals(PSEUDO_OK[i], listeJoueurs.get(i).getPseudo());
        }
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Joueur#getTirEffectuer()}.
     */
    @Test
    void testGetTirEffectuer() {
        assertArrayEquals(listeJoueurs.get(0).getTirEffectuer(), TIR_INITIALE);
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Joueur#setTirEffectuer(boolean[][])}.
     */
    @Test
    void testSetTirEffectuer() {
        assertEquals(listeJoueurs.get(0).getTirEffectuer()[0][0], false);
        listeJoueurs.get(0).setTirEffectuer(0,0);
        assertEquals(listeJoueurs.get(0).getTirEffectuer()[0][0], true);
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Joueur#getListeBateauRestant()}.
     */
    //@Test
    //void testGetListeBateauRestant() {
        //fail("Not yet implemented");
    //}

}
