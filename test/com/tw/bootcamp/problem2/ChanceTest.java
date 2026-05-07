package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
    @Test
    @DisplayName("chance of getting tail")
    void chanceOfGettingTail(){
        Chance chance = new Chance(0.5);
        assertEquals(new Chance(0.5),chance);
    }

    @Test
    @DisplayName("chance of not getting tail")
    void chanceOfNotGettingTail(){
        Chance chance = new Chance(0.5);
        assertEquals(0.5,chance.inverse());
    }

    @Test
    @DisplayName("chance of getting tail for two coins")
    void chanceOfNotGettingTailForTwoCoins(){
        Chance chance1 = new Chance(0.5);
        Chance chance2 = new Chance(0.5);
        assertEquals(0.25,Chance.intersection(chance1, chance2));
    }

    @Test
    @DisplayName("chance of getting 3 on a dice")
    void chanceOfGetting3OnADice(){
        Chance chance = new Chance();
        assertEquals(0.16,chance.generateChance(6,1),0.1);
    }
}