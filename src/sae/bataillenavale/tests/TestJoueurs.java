/*
 * TestJoueurs.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package sae.bataillenavale.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sae.bataillenavale.Joueur;

import java.util.*;

/** TODO comment class responsibility (SRP)
 * @author rayanibrahime
 *
 */
class TestJoueurs {
    /**
     * Liste contenant les données de joueurs
     */
    private List <Joueur> joueur;

    /** TODO comment method role
     * @throws java.lang.Exception
     */
    @BeforeEach
    void initialiseJoueur() {
        joueur = new ArrayList<>();
   /*0*/joueur.add(new Joueur("Atom"));
   /*1*/joueur.add(new Joueur("aispikinglish"));
   /*2*/joueur.add(new Joueur("Nivak"));
    }

    /**
     * Test method for {@link sae.bataillenavale.Joueur#Joueur(java.lang.String)}.
     */
    @Test
    void testJoueur() {
        Joueur J1 = new Joueur("Atom");
        Joueur J2 = new Joueur("aispikinglish");
        Joueur J3 = new Joueur("Nivak");
    }

    /**
     * Test method for {@link sae.bataillenavale.Joueur#getPseudo()}.
     */
    @Test
    void testGetPseudo() {
        final String[] PSEUDO_OK = {
                "Atom", "aispikinglish", "Nivak"
        };
        for (int i = 0; i < PSEUDO_OK.length; i++) {
            assertEquals(PSEUDO_OK[i], joueur.get(i).getPseudo());
        }
    }

    /**
     * Test method for {@link sae.bataillenavale.Joueur#getTirEffectuer()}.
     */
    @Test
    void testGetTirEffectuer() {
        
    }

    /**
     * Test method for {@link sae.bataillenavale.Joueur#setTirEffectuer(boolean[][])}.
     */
    @Test
    void testSetTirEffectuer() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link sae.bataillenavale.Joueur#getListeBateauRestant()}.
     */
    @Test
    void testGetListeBateauRestant() {
        fail("Not yet implemented");
    }

}
