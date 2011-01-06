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
 * @author filipe
 */
public class HandParserTest {

    private static Hand handFour;
    private static Hand handThree;
    private static Hand handPair;
    private static Hand handFlush;
    private static Hand handStraight;
    private static Hand handFullHouse;
    private static Hand handStraightFlush;

    public HandParserTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        handFour = new Hand();
        handFour.add(new Card(10, Suit.CLUBS));
        handFour.add(new Card(10, Suit.DIAMONDS));
        handFour.add(new Card(10, Suit.HEARTS));
        handFour.add(new Card(10, Suit.SPADES));
        handFour.add(new Card(9, Suit.CLUBS));

        handThree = new Hand();
        handThree.add(new Card(10, Suit.CLUBS));
        handThree.add(new Card(10, Suit.DIAMONDS));
        handThree.add(new Card(10, Suit.HEARTS));
        handThree.add(new Card(8, Suit.SPADES));
        handThree.add(new Card(9, Suit.CLUBS));

        handPair = new Hand();
        handPair.add(new Card(10, Suit.CLUBS));
        handPair.add(new Card(10, Suit.DIAMONDS));
        handPair.add(new Card(8, Suit.CLUBS));
        handPair.add(new Card(7, Suit.CLUBS));
        handPair.add(new Card(9, Suit.CLUBS));

        handFlush = new Hand();
        handFlush.add(new Card(10, Suit.CLUBS));
        handFlush.add(new Card(2, Suit.CLUBS));
        handFlush.add(new Card(8, Suit.CLUBS));
        handFlush.add(new Card(7, Suit.CLUBS));
        handFlush.add(new Card(9, Suit.CLUBS));

        handStraight = new Hand();
        handStraight.add(new Card(10, Suit.DIAMONDS));
        handStraight.add(new Card(6, Suit.CLUBS));
        handStraight.add(new Card(8, Suit.CLUBS));
        handStraight.add(new Card(7, Suit.CLUBS));
        handStraight.add(new Card(9, Suit.CLUBS));

        handStraightFlush = new Hand();
        handStraightFlush.add(new Card(10, Suit.CLUBS));
        handStraightFlush.add(new Card(6, Suit.CLUBS));
        handStraightFlush.add(new Card(8, Suit.CLUBS));
        handStraightFlush.add(new Card(7, Suit.CLUBS));
        handStraightFlush.add(new Card(9, Suit.CLUBS));

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
     * Test of hasFour method, of class HandParser.
     */
    @Test
    public void testHasFour() {
        System.out.println("hasFour");
        HandParser handParser = new HandParser(handFour);
        int result = handParser.hasFour();
        int expResult = 10;
        assertEquals(expResult, result);
    }

    @Test
    public void testNotHasFour() {
        System.out.println("hasNotFour");
        HandParser handParser = new HandParser(handPair);
        int result = handParser.hasFour();
        int expResult = 0;
        assertEquals(expResult, result);
    }

    @Test
    public void testHasPair() {
        System.out.println("hasPair");
        HandParser handParser = new HandParser(handPair);
        int result = handParser.hasPair();
        int expResult = 10;
        assertEquals(expResult, result);
    }

    @Test
    public void testNotHasPair() {
        System.out.println("hasNotPair");
        HandParser handParser = new HandParser(handFour);
        int result = handParser.hasPair();
        int expResult = 0;
        assertEquals(expResult, result);
    }

    @Test
    public void testHasThree() {
        System.out.println("hasThree");
        HandParser handParser = new HandParser(handThree);
        int result = handParser.hasThree();
        int expResult = 10;
        assertEquals(expResult, result);
    }

    @Test
    public void testNotHasThree() {
        System.out.println("hasNotThree");
        HandParser handParser = new HandParser(handFour);
        int result = handParser.hasThree();
        int expResult = 0;
        assertEquals(expResult, result);
    }


    @Test
    public void testHasFlush() {
        System.out.println("hasFlush");
        HandParser handParser = new HandParser(handFlush);
        boolean result = handParser.hasFlush();
        assertTrue(result);
    }

    @Test
    public void testNotHasFludh() {
        System.out.println("hasNotFlush");
        HandParser handParser = new HandParser(handStraight);
        boolean result = handParser.hasFlush();
        assertFalse(result);
    }

}