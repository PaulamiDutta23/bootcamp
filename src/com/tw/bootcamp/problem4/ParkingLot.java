package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParkingLot {
    private final List<Boolean> spaces;
    private int lastFilledSpaceIndex;

    public ParkingLot(List<Boolean> spaces) {
        this.spaces = spaces;
        this.lastFilledSpaceIndex = -1;
    }

    public static ParkingLot create(int size) {
        List<Boolean> spaces = Stream.generate(() -> false)
                .limit(size)
                .collect(Collectors.toCollection(ArrayList::new));

        return new ParkingLot(spaces);
    }


    public boolean park() {
        if(isFull()){
            throw new ParkingLotFullException("Parking lot is full");
        }
        this.spaces.set(++this.lastFilledSpaceIndex, true);
        return true;
    }

    public boolean isFull() {
        return this.lastFilledSpaceIndex == this.spaces.size()-1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingLot that = (ParkingLot) o;
        return lastFilledSpaceIndex == that.lastFilledSpaceIndex && Objects.equals(spaces, that.spaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spaces, lastFilledSpaceIndex);
    }
}
