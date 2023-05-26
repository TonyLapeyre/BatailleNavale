/*
 * TestJoueur.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import iut.info1.sae.bataillenavale.Joueur;
import iut.info1.sae.bataillenavale.Tir;

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

    /** TODO comment method role
     * @throws java.lang.Exception
     */
    @BeforeEach
    void initialiseJoueur() {
        listeJoueurs = new ArrayList<>();
   /*0*/listeJoueurs.add(new Joueur("Atom"));
   /*1*/listeJoueurs.add(new Joueur("aispikinglish"));
   /*2*/listeJoueurs.add(new Joueur("Nivak"));
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
            assertEquals(PSEUDO_OK[i], listeJoueurs.get(i).getPseudo());
        }
    }

    /**
     * Test method for {@link sae.bataillenavale.Joueur#getTirEffectuer()}.
     */
    @Test
    void testGetTirEffectuer() {
        fail("Not yet implemented");
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
