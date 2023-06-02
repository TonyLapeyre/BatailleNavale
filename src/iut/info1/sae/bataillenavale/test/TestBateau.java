/**
     * TestBateau.java                                        22 mai 2023
     * INFO1 2022-2023, pas de copyright ni copyleft
     */
    package iut.info1.sae.bataillenavale.test;

    import static org.junit.jupiter.api.Assertions.*;

    import java.util.List;
    import java.util.ArrayList;

    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.Test;

import iut.info1.sae.bataillenavale.Bateau;

    /**
     * Méthodes de test de la classe Bateau
     * @author tonyl
     *
     */
class TestBateau {
    
    private int[][] placementIncorrect2 = {
                    {0,-1},
                    {0,0}
    };
    
    private int[][] placementIncorrect1 = {
                    {3,5},
                    {5,8}
    };
    
    private int[][] placementIncorrect3 = {
                    {9,4},
                    {11,4}
    };
    
    private int[][] PAValide = {
                    {0,0},
                    {0,4}
    };
    
    private int[][] PAValide2 = {
                    {3,4},
                    {7,4}
};
    
    private int[][] PAInvalide = {
                    {0,0},
                    {0,5}
    };
    
    private int[][] CValide = {
                    {6,9},
                    {6,6}
    };
    
    private int[][] CValide2 = {
                    {6,6},
                    {9,6}
    };
    
    private int[][] CInvalide = {
                    {6,10},
                    {6,6}
    };
    
    private int[][] CTValide = {
                    {1,5},
                    {3,5}
    };
    
    private int[][] CTValide2 = {
                    {5,1},
                    {5,3}
    };
    
    private int[][] CTInvalide = {
                    {0,5},
                    {3,5}
    };
    
    private int[][] TValide = {
                    {2,2},
                    {2,1}
    };
    
    private int[][] TValide2 = {
                    {2,2},
                    {1,2}
    };
    
    private int[][] TInvalide = {
                    {2,2},
                    {2,0}
    };
    
    private List<Bateau> correctes;
    
    @BeforeEach
    void setUp() {
        correctes = new ArrayList<>(15);
        //TODO add valid boats
        correctes.add(new Bateau("Torpilleur", TValide));
        correctes.add(new Bateau("Torpilleur", TValide2));
        correctes.add(new Bateau("Contre-torpilleur", CTValide));
        correctes.add(new Bateau("Contre-torpilleur", CTValide2));
        correctes.add(new Bateau("Croiseur", CValide));
        correctes.add(new Bateau("Croiseur", CValide2));
        correctes.add(new Bateau("Porte-avion", PAValide));
        correctes.add(new Bateau("Porte-avion", PAValide2));
        
        
    }
    
    /**
     * Test method for 
     * {@link iut.info1.sae.bataillenavale.Bateau#Bateau(java.lang.String, int, int[][])}.
     */
    @Test
    void testBateauStringIntIntNOk() {
        
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Porte-avion", placementIncorrect1));
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Croiseur", placementIncorrect2));
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Contre-torpilleur", placementIncorrect3));
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Porte-avion", PAInvalide));
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Croiseur", CInvalide));
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Contre-torpilleur", CTInvalide));
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Torpilleur", TInvalide));
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Croiseur", TInvalide));
        assertThrows(IllegalArgumentException.class, 
                            () -> new Bateau("Porte-avion", CTInvalide));
        
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Bateau#getCasesRestantesB()}.
     */
    @Test
    void testGetCasesRestantesB() {
        final int[] CORRECTES = {2,2,3,3,4,4,5,5};
        for(int i = 0; i < correctes.size(); i++) {
            assertEquals(CORRECTES[i], correctes.get(i).getCasesRestantesB());  
        }
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Bateau#touche}.
     */
    @Test
    void testTouche() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link iut.info1.sae.bataillenavale.Bateau#getPosition()}.
     */
    @Test
    void testGetPosition() {
        final int[][] CORRECTES = {
                    {2,2},{2,1},
                    {2,2},{1,2},
                    {1,5},{3,5},
                    {5,1},{5,3},
                    {6,9},{6,6},
                    {6,6},{9,6},
                    {0,0},{0,4},
                    {3,4},{7,4}
        };
        
        int k;
        int iCorrectes;
        
        k = 0;
        iCorrectes = 0;
        
        for(int i = 0; k < correctes.size(); i++) {
            for(int j = 0; j < CORRECTES[i].length; j++) {
                assertEquals(CORRECTES[i][j], correctes.get(k).getPosition()[iCorrectes][j]);
            }
            
            iCorrectes++;
            if (iCorrectes == 2) {
                k++;
                iCorrectes = 0;
            }
            
        }
    }
}
