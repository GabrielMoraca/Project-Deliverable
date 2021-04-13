package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * The class that models the game for the players. 
 * @author dancye
 * @Modifier
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
        //Split the deck in halve from the main deck and distribute it
        LinkedList<Card> p1deck = new LinkedList<Card>();
        p1deck.addAll(deck.subList(0,25));
        LinkedList<Card> p2deck = new LinkedList<Card>();
        p2deck.addAll(deck.subList(26, deck.size()));
        //declare scanner object
        Scanner input = new Scanner(System.in);
        //Recieve the users input for the Player's name
        System.out.println("Enter Player one's name");
        Player p1 = new Player (input.nextLine());
        System.out.println("Enter Player two's name");
        Player p2 = new Player (input.nextLine());
        /*
        While loop to continue the game until one player has lost
        */
        while (inGame){
            //Displays the card on top
            Card p1Card = p1deck.pop();
            Card p2Card = p2deck.pop();
            
            //Show the player the card that was drawn
            System.out.println(p1.getPlayerID()+" "+p1Card.toString());
            System.out.println(p2.getPlayerID()+" "+p2Card.toString());
            
            //Using compareTo to determine which card drawn is greater
            //int val = p1Card.value.compareTo(p2Card.value);
            
            /*
            If a player wins they recieve the losing card of the other player 
            with a message displaying that they won the round
            */
            if(compareCard(p1Card,p2Card) > 0){
                System.out.println(p1.getPlayerID()+" wins ");
                p1deck.addLast(p2Card);
                p1deck.addLast(p1Card);
            }
            if(compareCard(p1Card,p2Card) < 0){
                System.out.println(p2.getPlayerID()+" wins ");
                p2deck.addLast(p2Card);
                p2deck.addLast(p1Card);
            }
            /*
            Below is the case of a tie where the players will both draw a card in a tiebreaker round then continue
            */
            else{
                System.out.println("Theres a TIE in both cards this means WAR!");
                
                //New deck to separate for the tie breaker round
                ArrayList<Card> p1warCards = new ArrayList<Card>();
                ArrayList<Card> p2warCards = new ArrayList<Card>();
                for(int sub = 0; sub < 3; ++sub){
                    if(p1deck.size()==0 ||p2deck.size()==0)
                        break;
                    //Display the cards drawn
                    p1warCards.add(p1deck.pop());
                    p2warCards.add(p2deck.pop());
                }
                
                System.out.println(p1.getPlayerID()+" card for war  "+p1warCards.get(0).toString());
                System.out.println(p2.getPlayerID()+" card for war  "+p2warCards.get(0).toString());
                
                //compares if the card drawn is greater then displays a winner.
                //loser loses their card
                int warval = p1warCards.get(0).value.compareTo(p2warCards.get(0).value);
                if (warval > 0){
                    System.out.println(p1.getPlayerID()+" wins the WAR!! ");
                    p1deck.addAll( p2warCards );
                    p1deck.addAll( p1warCards );
                }
                else {
                    System.out.println(p2.getPlayerID()+" wins the WAR!! ");
                    p2deck.addAll( p2warCards );
                    p2deck.addAll( p1warCards );
                }
            }
            /*
            when a player has reached zero cards in their deck they have lost
            below displays a winning message for the player that has won the 
            game. 
            */
            if (checkP1Hand(p1deck) == 0){
                System.out.println(p1.getPlayerID()+" wins the GAME! Congrats!!");
                inGame = false;
            }else if (checkP2Hand(p2deck) == 0){
                System.out.println(p2.getPlayerID()+" wins the GAME! Congrats!!");
                inGame = false;
            }
        }
    }
    
    public int compareCard(Card p1Card, Card p2Card){
        int val = p1Card.value.compareTo(p2Card.value);
        return val;
    }
    
    public int checkP1Hand(LinkedList<Card> p1deck){
        int size = p1deck.size();
        return size;
    }
    
    public int checkP2Hand(LinkedList<Card> p2deck){
        int size = p2deck.size();
        return size;
    }
    
}//end class
