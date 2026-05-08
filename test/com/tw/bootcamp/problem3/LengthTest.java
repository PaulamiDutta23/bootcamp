package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
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

    @Nested
    @DisplayName("add lengths")
    class AddLengths{
        @Test
        @DisplayName("add two inches")
        void shouldAddTwoInches(){
            Length lengthInInches = Length.createInches(2);
            assertEquals(Length.createInches(4),lengthInInches.add(lengthInInches));
        }

        @Test
        @DisplayName("add one inches, one centimeters")
        void shouldAddInchesAndCentimeters(){
            Length lengthInInches = Length.createInches(2);
            Length lengthInCentimeters = Length.createCentimeters(2.5);
            assertEquals(Length.createInches(2.98),lengthInInches.add(lengthInCentimeters));
        }

        @Test
        @DisplayName("add one inches, one millimeters")
        void shouldAddInchesAndMillimeters(){
            Length lengthInInches = Length.createInches(2);
            Length lengthInMillimeters = Length.createMillimeters(2);
            assertEquals(Length.createInches(2.07),lengthInInches.add(lengthInMillimeters));
        }

        @Test
        @DisplayName("add one feet, one millimeters")
        void shouldAddFeetAndMillimeters(){
            Length lengthInFeet = Length.createFeet(3);
            Length lengthInMillimeters = Length.createMillimeters(2);
            assertEquals(Length.createInches(36.07),lengthInFeet.add(lengthInMillimeters));
        }
    }
}