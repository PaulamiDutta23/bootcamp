package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
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

    @Test
    @DisplayName("inches to centimeters")
    void shouldCheckCentimetersToMillimeters(){
        Length lengthInCentimeters = Length.createCentimeters(1);
        Length lengthInMillimeters = Length.createMillimeters(10);
        assertTrue(lengthInCentimeters.isEqual(lengthInMillimeters));
    }

    @Test
    @DisplayName("add two inches")
    void shouldAddTwoInches(){
        Length lengthInInches = Length.createInches(2);
        assertEquals(Length.createInches(4),lengthInInches.add(lengthInInches));
    }

}