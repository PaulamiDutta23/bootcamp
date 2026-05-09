package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BagTest {
    @Test
    @DisplayName("add a ball to a bag")
    void shouldAddABall(){
        Bag bag = Bag.create(12);
        assertEquals(1,bag.addBall());
    }

    @Test
    @DisplayName("add a ball when bag is full")
    void shouldThrowAnErrorWhenBagIsFull(){
        Bag bag = Bag.create(1);
        bag.addBall();
        assertThrows(BagLimitExceedException.class, bag::addBall);
    }
}
