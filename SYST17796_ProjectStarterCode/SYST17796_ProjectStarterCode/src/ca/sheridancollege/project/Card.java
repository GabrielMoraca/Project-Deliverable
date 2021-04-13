package ca.sheridancollege.project;

/**
 * A class that handles the creation of the card with a ENUM as the Suit and Value
 * @author dancye
 * @Modifier Gabriel Moraca
 */
public class Card {
        //Declare the suit and Value enum for the card object
	protected Value value;
        protected Suit suit;
        
        /**
         * Card Constructor takes a suit and value
         * @param suit
         * @param value 
         */
        Card(Suit suit, Value value) {
            this.value = value;
            this.suit = suit;
        }
        /**
         * Returns the value of the card
         * @return 
         */
	public Value getValue() {
		return this.value;
	}

	/**
	 * Sets the value of the card
	 * @param value
	 */
	public void setValue(Value value) {
		this.value = value;
	}
        /**
         * Returns the suit of the card
         * @return 
         */
	public Suit getSuit() {
		return this.suit;
	}

	/**
	 * Sets the suit of the card
	 * @param suit
	 */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

        /**
         * Declare all possible ENUM suits 
         */
	public enum Suit {
		HEARTS,
		CLUBS,
		SPADES,
		DIAMONDS
	}

        /**
         * Declare all possible ENUM values
         */
	public enum Value {
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING
	}
    
    /*
        overided toString method to display value and Suit of the card
        */
    @Override
    public String toString(){
            return (this.getValue()+ " of "+this.getSuit()+"\n");
        }
}
