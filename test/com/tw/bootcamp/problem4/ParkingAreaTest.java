package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingAreaTest {
    @Test
    @DisplayName("Park a car")
    void shouldParkACar(){
        ParkingArea area = ParkingArea.create(5);
        assertTrue(area.park());
    }

    @Test
    @DisplayName("Inform area is full")
    void shouldInformTheAreaIsFull(){
        ParkingArea area = ParkingArea.create(1);
        area.park();
        assertTrue(area.isFull());
    }

    @Test
    @DisplayName("Inform area is not full")
    void shouldInformTheAreaIsNotFull(){
        ParkingArea area = ParkingArea.create(1);
        assertFalse(area.isFull());
    }
}
