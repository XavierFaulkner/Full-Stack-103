package com.ctac.blackjack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackjackTest {
    @Test
    @DisplayName("Should add a card to the deck")
    void testAddCard() {
        Deck d = new Deck();
        Card c = new Card(Suits.DIAMOND, Values.KING);
        d.addCard(c);
        assertEquals(c, d.getCard(0));
    }

    @Test
    @DisplayName("Should return correct value of card")
    void testGetValue() {
        Card c = new Card(Suits.DIAMOND, Values.KING);
        assertEquals(Values.KING, c.getValue());
    }
}
