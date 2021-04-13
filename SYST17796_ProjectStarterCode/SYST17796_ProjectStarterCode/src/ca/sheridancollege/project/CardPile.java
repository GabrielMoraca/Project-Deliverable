
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.Suit;
import ca.sheridancollege.project.Card.Value;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A class that creates the main deck and fills it with the card object
 * @author dancye
 * @Modifier Gabriel Moraca
 */
public class CardPile {
    //declare the main deck as an arraylist
    private ArrayList<Card> deck = new ArrayList<Card>();
    public CardPile(){
        
    }   
    public ArrayList<Card> fillDeck(){
        /*
        The loop below fills the deck with the card object using each type of suit and value
        */
        int sub = 0;
        for (Suit suit: Suit.values()){
            for(Value value: Value.values()){
                Card c = new Card(suit, value);
                this.deck.add(c);
                sub++;
            }
        }
       //Shuffles the deck to keep it out of order
       Collections.shuffle(this.deck);
       return this.deck;
    }
}
