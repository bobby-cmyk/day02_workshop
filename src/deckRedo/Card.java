package deckRedo;

public class Card {
    
    // Use "final" to indicate that once the values are intiatiated, they should not be changed
    private final String suit;
    private final String name;
    private final String value;

    public Card(String suit, String name, String value) {
        this.suit = suit;
        this.name = name;
        this.value = value;
    }

    // Only have getters, no setters
    public String getSuit() {
        return this.suit;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return ("%s %s").formatted(this.suit, this.name);
    }
}
