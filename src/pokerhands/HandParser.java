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

    public int hasFour() {
        return hasCardCountMin(4);
    }

    public int hasPair() {
        return hasCardCountMin(2);
    }

    public int hasThree() {
        return hasCardCountMin(3);
    }
}
