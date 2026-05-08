package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingAreaTest {
    @Test
    @DisplayName("Park a car")
    void shouldParkACar(){
        ParkingArea area = ParkingArea.create(5);
        assertTrue(area.park());
    }
}
