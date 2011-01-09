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
 * @author romulo
 */
public class HandPartGameTest {

    HandPartGame pairSix;
    HandPartGame threeEight;
    HandPartGame fourNine;
    HandPartGame cardNine;
    HandPartGame cardTen;

    public HandPartGameTest() {
        pairSix = new HandPartGame(HandType.PAIR, 6);
        threeEight = new HandPartGame(HandType.THREE, 8);
        fourNine = new HandPartGame(HandType.FOUR, 9);
        cardNine = new HandPartGame(HandType.HIGER_CARD, 9);
        cardTen = new HandPartGame(HandType.HIGER_CARD, 10);
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
     * Test of getCardValue method, of class HandPartGame.
     */
    @Test
    public void testGetCardValue() {
        System.out.println("getCardValue");
        int expResult = 6;
        int result = pairSix.getCardValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHandType method, of class HandPartGame.
     */
    @Test
    public void testGetHandType() {
        System.out.println("getHandType");
        HandType expResult = HandType.PAIR;
        HandType result = pairSix.getHandType();
        assertEquals(expResult, result);
    }

    /**
     * Test of compare method, of class HandPartGame.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        int expResult = 0;
        int result = pairSix.compare(pairSix);
        assertEquals(expResult, result);
    }

    /**
     * Test of compare method, of class HandPartGame.
     */
    @Test
    public void testCompareHigherType() {
        System.out.println("compare higher type");
        int expResult = 1;
        int result = threeEight.compare(pairSix);
        assertEquals(expResult, result);
    }

    /**
     * Test of compare method, of class HandPartGame.
     */
    @Test
    public void testCompareHigherValue() {
        System.out.println("compare higher value");
        int expResult = 1;
        int result = cardTen.compare(cardNine);
        assertEquals(expResult, result);
    }

    /**
     * Test of compare method, of class HandPartGame.
     */
    @Test
    public void testCompareLowerType() {
        System.out.println("compare lower type");
        int expResult = -1;
        int result = pairSix.compare(threeEight);
        assertEquals(expResult, result);
    }

    /**
     * Test of compare method, of class HandPartGame.
     */
    @Test
    public void testCompareLowerValue() {
        System.out.println("compare lower type");
        int expResult = -1;
        int result = cardNine.compare(cardTen);
        assertEquals(expResult, result);
    }
}
