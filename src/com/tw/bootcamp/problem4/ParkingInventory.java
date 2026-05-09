package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParkingInventory {
    private final List<ParkingLot> inventory;
    private int lastFilledParkingLot;

    public ParkingInventory(List<ParkingLot> inventory) {
        this.inventory = inventory;
        this.lastFilledParkingLot = -1;
    }

    public static ParkingInventory create() {
        List<ParkingLot> inventory = new ArrayList<>();
        return new ParkingInventory(inventory);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingInventory other = (ParkingInventory) o;
        return Objects.equals(inventory, other.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inventory);
    }

    public boolean add(ParkingLot parkingLot) {
        return this.inventory.add(parkingLot);
    }

    public boolean park() {
        if(this.lastFilledParkingLot == this.inventory.size() - 1) {
            throw new ParkingInventoryFullException("Parking inventory is full");
        }

        ParkingLot currentParkingLot = this.inventory.get(this.lastFilledParkingLot + 1);
        currentParkingLot.park();
        if(currentParkingLot.isFull()) {
            this.lastFilledParkingLot++;
        }
        return true;
    }
}
