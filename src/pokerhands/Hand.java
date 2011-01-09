/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pokerhands;

import java.util.ArrayList;

/**
 *
 * @author terminal
 */
public class Hand extends ArrayList<Card> {
    private ArrayList<HandPartGame> handParts = new ArrayList<HandPartGame>();

    public int compare(Hand opponentHand){
        return compare(opponentHand.getHandParts());
    }

    public int compare(ArrayList<HandPartGame> opponentHandParts){
        HandPartGame combination = null;
        HandPartGame opponentCombination = null;
        for(int i = 0; i < 5; i++) {
            combination = handParts.get(i);
            opponentCombination = opponentHandParts.get(i);
            if(combination.compare(opponentCombination) == 0 ) {
                continue;
            }
            return combination.compare(opponentCombination);
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Card card : this) {
            sb.append(card).append(" ");
        }
        return sb.toString();
    }

    private void parseHandParts() {

    }

    public ArrayList<HandPartGame> getHandParts() {
        return handParts;
    }


}
