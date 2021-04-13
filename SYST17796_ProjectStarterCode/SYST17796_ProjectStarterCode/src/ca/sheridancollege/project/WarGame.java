
package ca.sheridancollege.project;


public class WarGame {
    
    public static void main(String[]args){
        //Creates the CardPile objdect to create the main deck for the game
        CardPile cP = new CardPile ();
        //creates the Game objec to start the game for the players
        Game game = new Game (cP.fillDeck());
        
    }
    
}
