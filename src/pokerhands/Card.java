/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pokerhands;

/**
 *
 * @author terminal
 */
public class Card {
    private int value;
    private Suit suit;

    public int getValue() {
        return value;
    }

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public String toString() {
        return "[" + value + ":" + suit + "]";
    }
    
}
