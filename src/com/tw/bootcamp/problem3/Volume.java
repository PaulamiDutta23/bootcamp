package com.tw.bootcamp.problem3;

public class Volume {
    private final double actualUnits;
    private final double unitsInLiters;

    public Volume(double actualUnits, double unitsInLiters) {
        this.actualUnits = actualUnits;
        this.unitsInLiters = unitsInLiters;
    }

    public static Volume createGallon(double gallons) {
        return createVolume(gallons, gallons * 3.78);
    }

    private static Volume createVolume(double actualUnits, double unitsInLiters) {
        if(actualUnits < 0.0 || unitsInLiters < 0.0) {
            throw new InvalidVolumeUnitsException("Volume can not be negative");
        }
        return new Volume(actualUnits, unitsInLiters);
    }

    public static Volume createLiters(double liters) {
        return createVolume(liters, liters);
    }

    public boolean isEqual(Volume other) {
        return Math.abs(this.unitsInLiters - other.unitsInLiters) < 0.00001;
    }
}
