package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BagTest {
    @Test
    @DisplayName("add a coloured ball to a bag")
    void shouldAddABall(){
        Bag bag = Bag.create(12);
        assertEquals(1,bag.addBall(ColouredBall.BLUE));
    }

    @Test
    @DisplayName("throw error to add a ball when bag is full")
    void shouldThrowAnErrorWhenBagIsFull(){
        Bag bag = Bag.create(1);
        bag.addBall(ColouredBall.BLUE);
        assertThrows(BagLimitExceedException.class, () -> bag.addBall(ColouredBall.BLUE));
    }
}
