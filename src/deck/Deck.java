package deck;

import java.util.Random;

public class Deck {
 
    private String[] deck;
    
    public Deck() {

        // Initialise an array of 52 cards
        String[] deck = new String[52];

        // Initialise an array of suit
        String[] suit = {"Spade", "Heart", "Club", "Diamond"};

        // Initialise an array of value
        String[] value = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        for (int a = 0; a < suit.length; a++) {
            for (int b = 0; b < value.length; b++ ) {

                deck[(a*13) + b] = suit[a] + " " + value[b];
            }  
        }
        this.deck = deck;
    }
    // Print out cards by its order
    public void printDeck() {
        for (String card : this.deck) {
            System.out.println(card);
            System.out.println("");
        }
    }

    public void draw() {

        // create instance of Random class
        Random rand = new Random();
   
        // Generate random integers in range 0 to 999
        int drawIndex = rand.nextInt(52);

        String cardDrawn = this.deck[drawIndex];
        
        System.out.println("You have drawn: " + cardDrawn + "\n");
    }

    public void shuffle() {

        // create instance of Random class
        Random rand = new Random();

        for (int i = 0; i < this.deck.length; i++) {
            int indexToSwapCardTo = rand.nextInt(52);

            // Temp storaage of the card
            String cardAtThatIndex = deck[indexToSwapCardTo];

            // Replace card with this index card
            deck[indexToSwapCardTo] = deck[i];

            deck[i] = cardAtThatIndex;
        }

        System.out.println("Your deck has been shuffled." + "\n");
        
    }


    // Potential way to shuffle a deck

    // Create an array of index 

    // 

}
