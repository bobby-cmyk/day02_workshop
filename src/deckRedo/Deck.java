package deckRedo;

public class Deck {
    
    private Card[] cards;

    // Set constant for the different variables
    private String[] SUIT = 
        {"DIAMOND", "CLUB", "HEART", };

    public Deck() {
        cards = new Card[52];
    }
}
