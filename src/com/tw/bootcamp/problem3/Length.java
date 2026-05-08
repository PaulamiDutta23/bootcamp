package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {
    private final double actualUnits;
    private final double unitsInBase;

    private Length(double actualUnits, double unitsInBase) {
        this.actualUnits = actualUnits;
        this.unitsInBase = unitsInBase;
    }

    public static Length createLength(double actualUnits, double unitsInBase) {
        if(unitsInBase < 0.0 || actualUnits < 0.0) {
            throw new InvalidLengthUnitsException("Length can not be negative");
        }
        return new Length(actualUnits, unitsInBase);
    }

    public static Length createFeet(double feet) {
        return createLength(feet, feet * 12);
    }

    public static Length createInches(double inches) {
        return createLength(inches, inches);
    }

    public static Length createCentimeters(double centimeters) {
        return createLength(centimeters, centimeters * 0.393701);
    }

    public static Length createMillimeters(double millimeter) {
        return  createLength(millimeter, millimeter * 0.0393701);
    }

    public boolean isEqual(Length lengthInInches) {
        double threshold = 0.00001;
        return Math.abs(this.unitsInBase - lengthInInches.unitsInBase) < threshold;
    }

    public Length add(Length otherLength) {
        return Length.createInches(this.unitsInBase + otherLength.unitsInBase);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(actualUnits, length.actualUnits) == 0 && Double.compare(unitsInBase, length.unitsInBase) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualUnits, unitsInBase);
    }
}
