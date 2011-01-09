/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pokerhands;

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
public class HandTest {

    private Deck deck;
    private static Hand handThreeEight;
    private static Hand handThreeNine;

    public HandTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Deck deck = new Deck();
        handThreeEight = new Hand();
        handThreeEight.add(new Card(8, Suit.CLUBS));
        handThreeEight.add(new Card(8, Suit.DIAMONDS));
        handThreeEight.add(new Card(10, Suit.HEARTS));
        handThreeEight.add(new Card(8, Suit.SPADES));
        handThreeEight.add(new Card(9, Suit.CLUBS));

        handThreeNine = new Hand();
        handThreeNine.add(new Card(5, Suit.CLUBS));
        handThreeNine.add(new Card(9, Suit.DIAMONDS));
        handThreeNine.add(new Card(9, Suit.HEARTS));
        handThreeNine.add(new Card(8, Suit.SPADES));
        handThreeNine.add(new Card(9, Suit.CLUBS));
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
     * Test of compare method, of class Hand.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        int expResult = 0;
        int result = handThreeEight.compare(handThreeEight);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of compare method, of class Hand.
//     */
//    @Test
//    public void testCompare() {
//        System.out.println("compare");
//        int expResult = 1;
//        int result = hand1.compare(hand2);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of compare method, of class Hand.
//     */
//    @Test
//    public void testCompareEquals() {
//        System.out.println("compare");
//        int expResult = 0;
//        int result = hand1.compare(hand2);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of compare method, of class Hand.
//     */
//    @Test
//    public void testCompareLower() {
//        System.out.println("compare");
//        int expResult = -1;
//        int result = hand1.compare(hand2);
//        assertEquals(expResult, result);
//    }
//
//    /**
//     * Test of getScore method, of class Hand.
//     */
//    @Test
//    public void testGetScore() {
//        System.out.println("getScore");
//        int expResult = 10;
//        int result = hand1.getScore();
//        assertEquals(expResult, result);
//    }

}