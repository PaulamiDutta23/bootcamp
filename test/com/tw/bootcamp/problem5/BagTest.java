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

    @Test
    @DisplayName("throw error when green balls exceed 3")
    void shouldThrowAnErrorWhenGreenBallExceeds(){
        Bag bag = Bag.create(4);
        bag.addBall(ColouredBall.GREEN);
        bag.addBall(ColouredBall.GREEN);
        bag.addBall(ColouredBall.GREEN);
        assertThrows(ColouredBallLimitExceedException.class, () -> bag.addBall(ColouredBall.GREEN));
    }

    @Test
    @DisplayName("adds a red coloured ball to a bag")
    void shouldAddARedColouredBall(){
        Bag bag = Bag.create(3);
        bag.addBall(ColouredBall.GREEN);
        bag.addBall(ColouredBall.RED);
        assertEquals(3,bag.addBall(ColouredBall.RED));
    }

    @Test
    @DisplayName("throw error when red ball exceed limit")
    void shouldThrowAnErrorWhenRedBallExceeds(){
        Bag bag = Bag.create(4);
        bag.addBall(ColouredBall.GREEN);
        bag.addBall(ColouredBall.RED);
        bag.addBall(ColouredBall.RED);
        assertThrows(ColouredBallLimitExceedException.class, () -> bag.addBall(ColouredBall.RED));
    }

    @Test
    @DisplayName("adds a yellow coloured ball to a bag")
    void shouldAddAYellowColouredBall(){
        Bag bag = Bag.create(4);
        bag.addBall(ColouredBall.GREEN);
        bag.addBall(ColouredBall.RED);
        bag.addBall(ColouredBall.BLUE);
        assertEquals(4,bag.addBall(ColouredBall.YELLOW));
    }

    @Test
    @DisplayName("throw error when yellow ball cannot be added")
    void shouldThrowAnErrorWhenYellowBallCannotBeAdded(){
        Bag bag = Bag.create(2);
        bag.addBall(ColouredBall.GREEN);
        assertThrows(ColouredBallLimitExceedException.class, () -> bag.addBall(ColouredBall.YELLOW));
    }
}
