package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParkingArea {
    private final List<Boolean> lots;
    private int lastFilledLotIndex;

    public ParkingArea(List<Boolean> lots) {
        this.lots = lots;
        this.lastFilledLotIndex = -1;
    }

    public static ParkingArea create(int size) {
        List<Boolean> lots = Stream.generate(() -> false)
                .limit(size)
                .collect(Collectors.toCollection(ArrayList::new));

        return new ParkingArea(lots);
    }


    public boolean park() {
        this.lots.set(++this.lastFilledLotIndex, true);
        return true;
    }

    public boolean isFull() {
        return this.lastFilledLotIndex == this.lots.size()-1;
    }
}
