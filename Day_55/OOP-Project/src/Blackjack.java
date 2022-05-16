import java.util.Scanner;
public class Blackjack {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int balance = 1000;
        int wager = 0;
        boolean playAgain = true;
        System.out.println("Welcome to Blackjack!");

        // Create the playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        Deck burnDeck = new Deck();

        // Create hands for the player and the dealer - hands are created from methods that are made in the deck class
        Deck playerHand = new Deck();
        Deck dealerHand = new Deck();
        
        // Game loops
        while(playAgain && balance > 0) {
            System.out.println(
            "Your current balance is $" + balance +
            "\nHow much would you like to wager? "
            );
            wager = Integer.parseInt(in.nextLine());
            //loop until player busts or holds
            playerHand.draw(playingDeck);
            playerHand.draw(playingDeck);
            while(true) {
                System.out.println("Your hand is: ");

            }
        }

    }
}
