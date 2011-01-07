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
    private static Hand handHigherCard;
    private static Hand handPair;
    private static Hand handTwoPairs;
    private static Hand handThree;
    private static Hand handStraight;
    private static Hand handFlush;
    private static Hand handFullHouse;
    private static Hand handFour;
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

        handFullHouse = new Hand();
        handFullHouse.add(new Card(10, Suit.CLUBS));
        handFullHouse.add(new Card(10, Suit.DIAMONDS));
        handFullHouse.add(new Card(10, Suit.HEARTS));
        handFullHouse.add(new Card(8, Suit.SPADES));
        handFullHouse.add(new Card(8, Suit.CLUBS));

        handTwoPairs = new Hand();
        handTwoPairs.add(new Card(10, Suit.CLUBS));
        handTwoPairs.add(new Card(10, Suit.DIAMONDS));
        handTwoPairs.add(new Card(9, Suit.HEARTS));
        handTwoPairs.add(new Card(8, Suit.SPADES));
        handTwoPairs.add(new Card(8, Suit.CLUBS));

        handHigherCard = new Hand();
        handHigherCard.add(new Card(12, Suit.CLUBS));
        handHigherCard.add(new Card(9, Suit.DIAMONDS));
        handHigherCard.add(new Card(7, Suit.HEARTS));
        handHigherCard.add(new Card(3, Suit.SPADES));
        handHigherCard.add(new Card(2, Suit.CLUBS));


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
        int result = handParser.hasFlush();
        int expResult = 10;
        assertEquals(expResult, result);
    }

    @Test
    public void testNotHasFlush() {
        System.out.println("hasNotFlush");
        HandParser handParser = new HandParser(handStraight);
        int result = handParser.hasFlush();
        int expResult = 0;
        assertEquals(expResult, result);
    }

    /**
     * Test of hasStraight method, of class HandParser.
     */
    @Test
    public void testHasStraight() {
        System.out.println("hasStraight");
        HandParser instance = new HandParser(handStraight);
        int expResult = 10;
        int result = instance.hasStraight();
        assertEquals(expResult, result);
    }

    /**
     * Test of hasStraight method, of class HandParser.
     */
    @Test
    public void testNotHasStraight() {
        System.out.println("hasNotStraight");
        HandParser instance = new HandParser(handFlush);
        int expResult = 0;
        int result = instance.hasStraight();
        assertEquals(expResult, result);
    }

    @Test
    public void testHasStraightFlush() {
        System.out.println("hasStraightFlush");
        HandParser instance = new HandParser(handStraightFlush);
        int expResult = 10;
        int result = instance.hasStraightFlush();
        assertEquals(expResult, result);
    }

    @Test
    public void testNotHasStraightFlush() {
        System.out.println("hasNotStraightFlush");
        HandParser instance = new HandParser(handFlush);
        int expResult = 0;
        int result = instance.hasStraightFlush();
        assertEquals(expResult, result);
    }

    @Test
    public void testHasFullHouse() {
        System.out.println("hasFullHouse");
        HandParser instance = new HandParser(handFullHouse);
        int expResult = 10;
        int result = instance.hasFullHouse();
        assertEquals(expResult, result);
    }

    @Test
    public void testNotHasFullHouse() {
        System.out.println("hasNotFullHouse");
        HandParser instance = new HandParser(handFlush);
        int expResult = 0;
        int result = instance.hasFullHouse();
        assertEquals(expResult, result);
    }

    @Test
    public void testHasTwoPairs() {
        System.out.println("hasTwoPairs");
        HandParser instance = new HandParser(handTwoPairs);
        int expResult = 10;
        int result = instance.hasTwoPairs();
        assertEquals(expResult, result);
    }

    @Test
    public void testNotHasTwoPairs() {
        System.out.println("hasNotTwoPairs");
        HandParser instance = new HandParser(handFlush);
        int expResult = 0;
        int result = instance.hasTwoPairs();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHigherCard() {
        System.out.println("hasTwoPairs");
        HandParser instance = new HandParser(handHigherCard);
        int expResult = 12;
        int result = instance.getHigherCard();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetHandTypeStraightFlush() {
        System.out.println("getHandType straightFlush");
        HandParser instance = new HandParser(handStraightFlush);
        HandType result = instance.getHandType();
        assertEquals(HandType.STRAIGHT_FLUSH, result);
    }

    @Test
    public void testGetHandTypeFour() {
        System.out.println("getHandType four");
        HandParser instance = new HandParser(handFour);
        HandType result = instance.getHandType();
        assertEquals(HandType.FOUR, result);
    }

    @Test
    public void testGetHandTypeFlush() {
        System.out.println("getHandType flush");
        HandParser instance = new HandParser(handFlush);
        HandType result = instance.getHandType();
        assertEquals(HandType.FLUSH, result);
    }

    @Test
    public void testGetHandTypeStraight() {
        System.out.println("getHandType straight");
        HandParser instance = new HandParser(handStraight);
        HandType result = instance.getHandType();
        assertEquals(HandType.STRAIGHT, result);
    }

    @Test
    public void testGetHandTypeFullHouse() {
        System.out.println("getHandType fullHouse");
        HandParser instance = new HandParser(handFullHouse);
        HandType result = instance.getHandType();
        assertEquals(HandType.FULL_HOUSE, result);
    }

    @Test
    public void testGetHandTypeThree() {
        System.out.println("getHandType three");
        HandParser instance = new HandParser(handThree);
        HandType result = instance.getHandType();
        assertEquals(HandType.THREE, result);
    }

    @Test
    public void testGetHandTypeTwoPairs() {
        System.out.println("getHandType twoPairs");
        HandParser instance = new HandParser(handTwoPairs);
        HandType result = instance.getHandType();
        assertEquals(HandType.TWO_PAIRS, result);
    }

    @Test
    public void testGetHandTypePair() {
        System.out.println("getHandType pair");
        HandParser instance = new HandParser(handPair);
        HandType result = instance.getHandType();
        assertEquals(HandType.PAIR, result);
    }

    @Test
    public void testGetHandTypeHigherCard() {
        System.out.println("getHandType higherCard");
        HandParser instance = new HandParser(handHigherCard);
        HandType result = instance.getHandType();
        assertEquals(HandType.HIGER_CARD, result);
    }
}