/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pokerhands;

/**
 * This class is a data structure for a kind
 * @author romulo
 */
public class HandPartGame {
    private HandType handType;
    private int cardValue;

    public HandPartGame(HandType type, int cardValue) {
        this.handType = type;
        this.cardValue = cardValue;
    }

    public int getCardValue() {
        return cardValue;
    }

    public HandType getHandType() {
        return handType;
    }

    int compare(HandPartGame opponentCombination) {
        if( handType.ordinal() > opponentCombination.getHandType().ordinal() ) {
            return 1;
        } else if(handType.ordinal() < opponentCombination.getHandType().ordinal() ) {
            return -1;
        } else {
            if(cardValue > opponentCombination.getCardValue()) {
                return 1;
            } else if(cardValue < opponentCombination.getCardValue()) {
                return -1;
            } else{
                return 0;
            }
        }
    }
}
