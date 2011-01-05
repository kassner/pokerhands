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
    private Hand hand1;
    private Hand hand2;

    public HandTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        Deck deck = new Deck();
        Hand hand1 = deck.getNewHand();
        Hand hand2 = deck.getNewHand();
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
        Hand hand = null;
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.compare(hand);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class Hand.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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