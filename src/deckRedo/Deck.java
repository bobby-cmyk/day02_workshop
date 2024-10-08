package deckRedo;

import java.util.Random;

public class Deck {
    
    private Card[] cards;

    // Set constant for the different variables
    private String[] SUIT = 
        {"Diamond", "Club", "Heart", "Spade"};

    private String[] NAME = 
        {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    
    private String[] VALUE =
        {"1,", "2", "3", "4", "5", "6", "7", "8", "9", "10", "10", "10", "10"};

    public Deck() {

        int counter = 0;

        cards = new Card[52];

        for (int s = 0; s < SUIT.length; s++) {
            String cardSuit = SUIT[s];

            for (int n = 0; n < NAME.length; n++) {

                String cardName = NAME[n];
                String cardValue = VALUE[n];

                cards[counter] = new Card(cardSuit, cardName, cardValue);

                counter ++;
            }
        } 
    }


    // OVERLOADING

    // Method: Draw a card
    public void draw() {
        this.draw(1);     
    }

    // Method: Draw n number of cards
    public void draw(int number) {
        Random rand = new Random();

        if (number < 53) {
            for (int i = 0; i < number; i++) {
                int drawIndex = rand.nextInt(52);
    
                Card cardDrawn = cards[drawIndex];
    
                System.out.println(cardDrawn);

                System.out.println("");
            }
        }

        else {
            System.out.println("Exceeded maximum number of cards in deck.\n");
        }
        
    }

    // Method: Shuffle deck
    public void shuffle() {

        // for loop over deck 
        for (int i = 0; i < cards.length; i++) {

            // Initialise the rand
            Random rand = new Random();
            // get a random index
            int randIndex = rand.nextInt(52);
            // store card from random index into a temp variable
            Card temp = cards[randIndex];
            // Change the temp variable to the current variable at i
            cards[randIndex] = cards[i];
            // Change the i variable to temp
            cards[i] = temp;
        } 
        System.out.println("Deck is shuffled.\n");
    }

    public void show() {

        for (Card card : cards) {
            System.out.println(card);
        }
        
        System.out.println("");
    }

    
}