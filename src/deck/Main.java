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


// THINGS TO CHANGE

// Create Card object, have the necessary meaning, only make sure there's getters, it doesnt need setters. Imagine what it should be like in real life.

// Deck

// Use a global variable outside the loop to index the deck
// idx++
// Redo entire question
// Can do things like card toString;
// All classes are by default (extends Object)
