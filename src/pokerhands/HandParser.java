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

    private int[] cards = new int[13];

    public HandParser() {
        for (int i = 0; i < cards.length; i++) {
            int j = cards[i] = 0;

        }
    }


    


    public boolean hasFour(Hand hand) {

        for( Card card : hand ) {

            cards[(card.getValue() - 2)]++;
        }

        for(int i = 0; i < 13; i++)
        {          
            if (cards[i] == 4) {
                return true;
            }
        }

        return false;
    }


    /**
     * @todo paramos aqui!;
     * @return
     */
    public boolean hasPair(){
        return false;
    }

}
