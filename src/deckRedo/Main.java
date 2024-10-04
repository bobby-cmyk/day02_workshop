package deckRedo;

import java.io.Console;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        
        Console cons = System.console();
        System.out.println("\n <-- Deck Game Started --> \n Commands: \n * 'DRAW' - to draw card \n * 'SHUFFLE' - to shuffle deck \n * 'SHOW' - to show entire deck  \n * 'END' - to end game \n ");

        while (true) {

            String command = cons.readLine().toUpperCase();

            if (command.equals("END")) {
                break;
            }

            else if (command.equals("SHOW")) {
                deck.show();
            }

            else if (command.equals("DRAW")) {
                deck.draw();
            }

            else if (command.equals("SHUFFLE")) {
                deck.shuffle();
                System.out.println("");
            }

            else {
                System.out.println("Command does not exist!\n");
            }
        }

        System.out.println("<-- Deck game ended. --> \n");

    } 
  
}
       
