package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    @DisplayName("chance of getting tail")
    void chanceOfGettingTail(){
        Chance chanceOfGettingTail = Chance.create(0.5);
        assertEquals(Chance.create(0.5),chanceOfGettingTail);
    }

    @Test
    @DisplayName("chance of not getting tail")
    void chanceOfNotGettingTail(){
        Chance chanceOfGettingTail = Chance.create(0.5);
        Chance chanceOfNotGettingTail = chanceOfGettingTail.not();
        assertEquals(Chance.create(0.5),chanceOfNotGettingTail);
    }

    @Test
    @DisplayName("chance of getting tail for two coins")
    void chanceOfNotGettingTailForTwoCoins(){
        Chance chanceOfGettingTailOnCoinA = Chance.create(0.5);
        Chance chanceOfGettingTailOnCoinB = Chance.create(0.5);
        assertEquals(Chance.create(0.25),chanceOfGettingTailOnCoinA.and(chanceOfGettingTailOnCoinB));
    }

    @Test
    @DisplayName("chance of getting 3 on a dice")
    void chanceOfGetting3OnADice(){
        Chance chanceOfGetting3OnADice = Chance.create(0.16);
        assertEquals(Chance.create(0.16), chanceOfGetting3OnADice);
    }

    @Test
    @DisplayName("chance of getting at least one tail on flipping 2 coins")
    void chanceOfGettingAtLeast1Tail(){
        Chance chanceOfGettingTailOnCoinA = Chance.create(0.5);
        Chance chanceOfGettingTailOnCoinB = Chance.create(0.5);
        assertEquals(Chance.create(0.75),chanceOfGettingTailOnCoinA.or(chanceOfGettingTailOnCoinB));
    }
}