package com.tw.bootcamp.problem3;

public class Length {
    private final double units;

    private Length(double units) {
        this.units = units;
    }

    public static Length createFeet(double feet) {
        return createInches(feet * 12);
    }

    public static Length createInches(double inches) {
        if(inches < 0.0) {
            throw new InvalidLengthUnitsException("Length can not be negative");
        }
        return new Length(inches);
    }

    public static Length createCentimeters(double centimeters) {
        return createInches(centimeters * 0.393701);
    }

    public boolean isEqual(Length lengthInInches) {
        double threshold = 0.00001;
        return Math.abs(this.units - lengthInInches.units) < threshold;
    }
}
