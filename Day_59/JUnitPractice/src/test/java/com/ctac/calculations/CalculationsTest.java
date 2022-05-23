package com.ctac.calculations;
import com.ctac.blackjack.Deck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculationsTest {

    @Test
    @DisplayName("Should add two numbers together")
    void testAdd() {
        assertEquals(4, Calculations.add(2,2));
    }

    @Test
    @DisplayName("Should return the remainder of division")
    void testModulo() {
        assertEquals(2, Calculations.modulo(7,5 ));
    }

    @ParameterizedTest
    @DisplayName("Should not pass a null int value")
    @ValueSource(ints = {4})
    void testMoveAllToDeck(int num) {
        assertNotNull(Calculations.subtract(num, 1));
    }
}
