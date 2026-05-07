package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    @DisplayName("chance of getting tail")
    void chanceOfGettingTail(){
        Chance coinsChance = Chance.createChanceForCoins(1);
        assertEquals(0.5,coinsChance.getTails(), 0.1);
    }

    @Test
    @DisplayName("chance of not getting tail")
    void chanceOfNotGettingTail(){
        Chance coinsChance = Chance.createChanceForCoins(1);
        assertEquals(0.5,coinsChance.getNoTails(), 0.1);
    }
}