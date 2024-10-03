package deck;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        
        Deck deck = new Deck();

        // Initialise console
        Console cons = System.console();

        UserInterface userInterface = new UserInterface(deck, cons);

        userInterface.start();

    }    
        
}