package deckRedo;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.draw();
        deck.show();
        System.out.println("");
        deck.shuffle();
        System.out.println("");
        deck.show();
        deck.shuffle();

    } 
  
}
       
