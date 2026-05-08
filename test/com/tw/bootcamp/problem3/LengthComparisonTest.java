package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthComparisonTest {
    @Test
    @DisplayName("feet to inch")
    void shouldCheckFeetToInch(){
        Length lengthInFeet = Length.createFeet(1);
        Length lengthInInch = Length.createInch(12);
        assertTrue(lengthInFeet.compare(lengthInInch));
    }
}
