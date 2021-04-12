/**
 * SYST 17796 Project Winter 2021 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye
 */
public class Game {
    public Game (ArrayList<Card> deck){
        play(deck);
    }
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    
    public void play(ArrayList<Card> deck){
        boolean inGame = true;
        
        LinkedList<Card> p1deck = new LinkedList<Card>();
        p1deck.addAll(deck.subList(0,25));
        LinkedList<Card> p2deck = new LinkedList<Card>();
        p2deck.addAll(deck.subList(26, deck.size()));
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Player one's name");
        Player p1 = new Player (input.nextLine());
        System.out.println("Enter Player two's name");
        Player p2 = new Player (input.nextLine());
        while (inGame){
            Card p1Card = p1deck.pop();
            Card p2Card = p2deck.pop();
            
            System.out.println(p1.getPlayerID()+" "+p1Card.toString());
            System.out.println(p2.getPlayerID()+" "+p2Card.toString());
        }
    }
    
    
    

   
    
}//end class
