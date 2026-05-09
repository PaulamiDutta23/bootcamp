package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingInventoryTest {
    @Test
    @DisplayName("Create parking inventory")
    void shouldCreateParkingInventory(){
        ParkingInventory inventory = ParkingInventory.create();
        assertEquals(ParkingInventory.create(), inventory);
    }

    @Test
    @DisplayName("Adds parking lot to parking inventory")
    void shouldAddParkingLotToInventory(){
        ParkingInventory inventory = ParkingInventory.create();
        assertTrue(inventory.add(ParkingLot.create(5)));
    }

    @Test
    @DisplayName("park a car")
    void shouldParkACar(){
        ParkingInventory inventory = ParkingInventory.create();
        inventory.add(ParkingLot.create(5));
        assertTrue(inventory.park());
    }

    @Test
    @DisplayName("throw error to park when no space")
    void shouldThrowErrorWhenNoSpace(){
        ParkingInventory inventory = ParkingInventory.create();
        inventory.add(ParkingLot.create(1));
        inventory.park();
        assertThrows(ParkingInventoryFullException.class,()->inventory.park());
    }
}
