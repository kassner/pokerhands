/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerhands;

/**
 *
 * @author filipe
 */
public class HandParser {

    private int[] cardCount = new int[13];
    private int[] suitCount = new int[4];
    private Hand toParseHand;

    public HandParser(Hand toParseHand) {
        this.toParseHand = toParseHand;
        for (int i = 0; i < cardCount.length; i++) {
            cardCount[i] = 0;
        }
        countCards();
    }

    private void countCards() {
        for (Card card : toParseHand) {
            cardCount[(card.getValue() - 2)]++;
            suitCount[card.getSuit().ordinal()]++;
        }
    }

    private int hasCardCountMin(int minimal) {
        for (int i = 0; i < 13; i++) {
            if (cardCount[i] == minimal) {
                return i + 2;
            }
        }
        return 0;
    }

    public int hasTwoPairs() {
        int pairs = 0;
        int higherPair = -1;
        for (int i = 0; i < 13; i++) {
            if (cardCount[i] == 2) {
                pairs++;
                if(i > higherPair) {
                    higherPair = i;
                }
            }
        }
        if(pairs == 2 ) {
            return higherPair + 2;
        }
        return 0;
    }

    public int hasFour() {
        return hasCardCountMin(4);
    }

    public int hasPair() {
        return hasCardCountMin(2);
    }

    public int hasThree() {
        return hasCardCountMin(3);
    }

    public int hasFlush() {
        for (int suit : suitCount) {
            if( suit == 5 ) {
                return getHigherCard();
            }
        }
        return 0;
    }

    /**
     * @todo nao considera sequencia de As a 5
     * @return
     */
    public int hasStraight() {
        int min = 20, max = -1;
        for (int i = 0; i < 13; i++) {
            if (cardCount[i] > 1) {
                return 0;
            } else if(cardCount[i] == 1 ) {
                if(i < min) min = i;
                if(i > max) max = i;
            }
        }
        if(max - min == 4) {
            return max + 2;
        }
        return 0;
    }

    public int hasStraightFlush() {
        if( hasFlush() > 0 ) {
            return hasStraight();
        }
        return 0;
    }

    public int hasFullHouse() {
        if( hasPair() > 0 ) {
            return hasThree();
        }
        return 0;
    }

    public int getHigherCard() {
        for (int i = 12; i >= 0; i--) {
            if(cardCount[i] > 0) {
                return i + 2;
            }
        }
        return 0;
    }

    public HandType getHandType() {
        if( hasStraightFlush() > 0 ) {
            return HandType.STRAIGHT_FLUSH;
        } else if( hasFour() > 0 ) {
            return HandType.FOUR;
        } else if( hasFullHouse() > 0 ) {
            return HandType.FULL_HOUSE;
        } else if( hasFlush() > 0 ) {
            return HandType.FLUSH;
        } else if( hasStraight() > 0 ) {
            return HandType.STRAIGHT;
        } else if( hasThree() > 0 ) {
            return HandType.THREE;
        } else if( hasTwoPairs() > 0 ) {
            return HandType.TWO_PAIRS;
        } else if( hasPair() > 0 ) {
            return HandType.PAIR;
        }
        return HandType.HIGER_CARD;
    }
}
