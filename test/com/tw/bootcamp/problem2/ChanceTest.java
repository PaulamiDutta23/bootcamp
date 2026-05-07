package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    @DisplayName("chance of getting tail")
    void chanceOfGettingTail(){
        Chance chanceOfGettingTails = new Chance(0.5);
        assertEquals(new Chance(0.5),chanceOfGettingTails);
    }

    @Test
    @DisplayName("chance of not getting tail")
    void chanceOfNotGettingTail(){
        Chance chanceOfGettingTails = new Chance(0.5);
        assertEquals(0.5,chanceOfGettingTails.inverse());
    }

    @Test
    @DisplayName("chance of getting tail for two coins")
    void chanceOfNotGettingTailForTwoCoins(){
        Chance chanceOfGettingTails = new Chance(0.75);
        assertEquals(new Chance(0.75),chanceOfGettingTails);
    }
}