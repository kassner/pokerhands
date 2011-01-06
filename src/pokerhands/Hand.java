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

    public int compare(Hand hand){
        return 0;
    }

    public int getScore() {
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Card card : this) {
            sb.append(card).append(" ");
        }
        return sb.toString();
    }


}
