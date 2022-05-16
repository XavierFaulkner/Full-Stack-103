import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public void createFullDeck() {
        // generate cards
       
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public Card getCard(int i){
        return this.deck.get(i);
    }

    public void removeCard(int i){
        this.deck.remove(i);
    }

    public void addCard(Card addCard) {
        this.deck.add(addCard);
    }

    // Get the size of the deck
    public int deckSize() {
        return this.deck.size();
    }

    // Draws from the deck
    public void draw(Deck comingFrom) {
        this.deck.add(comingFrom.getCard(0));
        comingFrom.deck.remove(0);
    }

    // This will move cards back into the deck to continue playing
    public void moveAllToDeck(Deck moveTo) {
      
    }

    @Override
    public String toString() {
        String response = "";
        for(Card card: deck) {
            response += card.toString() + ", ";
        }
        return response;
    }
}
