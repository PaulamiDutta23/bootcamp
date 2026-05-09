package com.tw.bootcamp.problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParkingArea {
    private final List<ParkingLot> lots;

    public ParkingArea(List<ParkingLot> lots) {
        this.lots = lots;
    }

    public static ParkingArea create(int size) {
        List<ParkingLot> lots = Stream.generate(() -> ParkingLot.create(5))
                .limit(size)
                .collect(Collectors.toCollection(ArrayList::new));
        return new ParkingArea(lots);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingArea that = (ParkingArea) o;
        return Objects.equals(lots, that.lots);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lots);
    }
}
