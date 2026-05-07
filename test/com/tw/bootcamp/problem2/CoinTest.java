package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinTest {
    @Test
    @DisplayName("chance of getting tail")
    void chanceOfGettingTail(){
        Coin coin = new Coin();
        assertEquals(0.5,coin.tailProbability(), 0.1);
    }
}
