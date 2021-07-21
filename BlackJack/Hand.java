/**
 * An object of type Hand represents a hand of cards.  The
 * cards belong to the class Card.  A hand is empty when it
 * is created, and any number of cards can be added to it.
 */

public class Hand {

    private Card[] hand;   // The cards in the hand.
	private int handSize;  // The number of cards in the hand.

    /**
     * Create a hand that is initially empty.
     */
    public Hand() {
        // TO DO
    }

    /**
     * Remove all cards from the hand, leaving it empty.
     */
    public void clear() {
        // TO DO
    }

    /**
     * Add a card to the hand.  It is added at the end of the current hand.
     * @param c the non-null card to be added.
     */
    public void addCard(Card c) {
        // TO DO
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int getCardCount() {
        // TO DO
    }

    /**
     * Gets the card in a specified position in the hand.  (Note that this card
     * is not removed from the hand!)
     * @param position the position of the card that is to be returned
     */
    public Card getCard(int position) {
        // TO DO
    }
	
} // end class Hand
