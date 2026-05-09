package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingAreaTest {
    @Test
    @DisplayName("Create parking area")
    void shouldCreateParkingArea(){
        ParkingArea area = ParkingArea.create(2);
        assertEquals(ParkingArea.create(2), area);
    }
}
