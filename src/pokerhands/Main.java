/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pokerhands;

/**
 *
 * @author terminal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        Hand hand1 = deck.getNewHand();
        Hand hand2 = deck.getNewHand();

        int result = hand1.compare(hand2);

        
    }

}
