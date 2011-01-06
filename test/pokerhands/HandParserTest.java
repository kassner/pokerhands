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
        boolean result = handParser.hasFour();
        assertTrue(result);
    }

    @Test
    public void testNotHasFour() {
        System.out.println("hasFour");
        HandParser handParser = new HandParser(handPair);
        boolean result = handParser.hasFour();
        assertFalse(result);
    }

    @Test
    public void testHasPair() {
        System.out.println("hasPair");
        HandParser handParser = new HandParser(handPair);
        boolean result = handParser.hasFour();
        assertTrue(result);
    }

}