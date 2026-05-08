package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComparisonTest {
    @Test
    @DisplayName("volume")
    void shouldCheckVolumeComparison(){
        Volume volumeInGallon = Volume.createGallon(1);
        Volume volumeInLiters = Volume.createLiters(3.78);
        Compare compare = Compare.create(volumeInLiters,volumeInGallon);
        assertTrue(compare.isEqual());
    }
}
