package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthComparisonTest {
    @Test
    @DisplayName("feet to inches")
    void shouldCheckFeetToInches(){
        Length lengthInFeet = Length.createFeet(1);
        Length lengthInInches = Length.createInches(12);
        assertTrue(lengthInFeet.isEqual(lengthInInches));
    }

    @Test
    @DisplayName("inches to centimeters")
    void shouldCheckInchesToCentimeters(){
        Length lengthInInches = Length.createInches(2);
        Length lengthInCentimeters = Length.createCentimeters(5.08);
        assertTrue(lengthInInches.isEqual(lengthInCentimeters));
    }

    @Test
    @DisplayName("invalid length units")
    void shouldThrowErrorForInvalidLengthUnits(){
        assertThrows(InvalidLengthUnitsException.class,()->Length.createInches(-2));
    }
}