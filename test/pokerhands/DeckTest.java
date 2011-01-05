/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pokerhands;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author terminal
 */
public class DeckTest {

    public DeckTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of generateNewDeck method, of class Deck.
     */
    @Test
    public void testGenerateNewDeck() {
        System.out.println("generateNewDeck");
        Deck instance = new Deck();
        assertEquals(52, instance.size());
    }

    /**
     * Test of getNewHand method, of class Deck.
     */
    @Test
    public void testGetNewHand() {
        System.out.println("getNewHand");
        Deck instance = new Deck();
        int expResult = 5;
        int result = instance.getNewHand().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        Deck instance2 = new Deck();
        instance.shuffle();
        assertFalse(instance.equals(instance2));
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffleSize() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        int originalSize = instance.size();
        instance.shuffle();
        assertEquals(originalSize, instance.size());
    }

}
