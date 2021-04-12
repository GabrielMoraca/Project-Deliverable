/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.Card.Suit;
import ca.sheridancollege.project.Card.Value;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author shado
 */
public class CardPile {
    
    private ArrayList<Card> deck = new ArrayList<Card>();
    public CardPile(){
        
    }   
    public ArrayList<Card> fillDeck(){
        int sub = 0;
        for (Suit suit: Suit.values()){
            for(Value value: Value.values()){
                Card c = new Card(suit, value);
                this.deck.add(c);
                sub++;
            }
        }
       Collections.shuffle(this.deck);
       return this.deck;
    }
}
