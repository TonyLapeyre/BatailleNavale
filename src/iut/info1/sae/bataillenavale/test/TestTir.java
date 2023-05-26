/*
 * TestTir.java                                      26 mai 2023
 * IUT Rodez, info1 2022-2023, pas de copyright ni "copyleft" 
 */
package iut.info1.sae.bataillenavale.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



import iut.info1.sae.bataillenavale.Tir;

/** 
 * Classe de test de la classe Tir
 * @author tom.jammes
 */
class TestTir {

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Tir#Tir(int, int)}.
     */
    @Test
    void testTir() {
        Tir[] tirCorrects = new Tir[10];
        tirCorrects[0] = new Tir(2,2,true);
        tirCorrects[1] = new Tir(1,5,false);
        
        
        assertThrows(IllegalArgumentException.class, ()-> new Tir(-1,2,true));
        assertThrows(IllegalArgumentException.class, ()-> new Tir(2,-3,true));
        assertThrows(IllegalArgumentException.class, ()-> new Tir(-1,-1,true));
        assertThrows(IllegalArgumentException.class, ()-> new Tir(10,15,true));
        
        assertEquals(2, tirCorrects[0].getX());
        assertEquals(5, tirCorrects[1].getY());
    }
}
