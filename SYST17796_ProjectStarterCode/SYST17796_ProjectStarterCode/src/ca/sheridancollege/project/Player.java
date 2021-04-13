
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye
 * @Modifier Gabriel Moraca
 */
public  class Player 
{
    private String playerID; //the unique ID for this player
    
    /**
     * A constructor that allows you to set the player's unique ID
     * @param name the unique ID to assign to this player.
     */
    public Player(String name)
    {
        this.playerID= name;
    }
    
    /**
     * @return the playerID
     */
    public String getPlayerID() 
    {
        return this.playerID;
    }

    /**
     * Ensure that the playerID is unique
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) 
    {
        this.playerID = givenID;
    }
    
   
    
}
