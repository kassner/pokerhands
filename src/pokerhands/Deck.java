/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pokerhands;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author terminal
 */
public class Deck extends Stack<Card> {

    public Deck() {
        generateNewDeck();
    }

    public void generateNewDeck() {
        
        for (int i = 0; i< 4; i++)
        {
            for (int j = 2; j <= 14; j++)
            {
                push(new Card(j, Suit.values()[i]));
            }
        }
    }

    public Hand getNewHand() {
        Hand hand = new Hand();
        for(int i= 0; i < 5; i++) {
            hand.add(pop());
        }
        return hand;
    }

    public void shuffle() {
        Collections.shuffle(this);
    }

    public boolean equals(Deck deck) {
        for(int i =0; i < size(); i++) {
            if(!get(i).equals(deck.get(i))){
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String s = "";
        for( Card card : this ) {
            s += card + " ";
        }
        return s;
    }
}
