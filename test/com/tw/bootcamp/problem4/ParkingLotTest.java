package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    @DisplayName("Park a car")
    void shouldParkACar(){
        ParkingLot lot = ParkingLot.create(5);
        assertTrue(lot.park());
    }

    @Test
    @DisplayName("Should throw error to park a car")
    void shouldThrowErrorToParkACar(){
        ParkingLot lot = ParkingLot.create(1);
        lot.park();
        assertThrows(ParkingLotFullException.class, () -> lot.park());
    }

    @Test
    @DisplayName("Inform lot is full")
    void shouldInformTheAreaIsFull(){
        ParkingLot lot = ParkingLot.create(1);
        lot.park();
        assertTrue(lot.isFull());
    }

    @Test
    @DisplayName("Inform lot is not full")
    void shouldInformTheAreaIsNotFull(){
        ParkingLot lot = ParkingLot.create(1);
        assertFalse(lot.isFull());
    }
}
