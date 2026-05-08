package com.tw.bootcamp.problem3;

public class Length {
    private final double units;

    private Length(double units) {
        this.units = units;
    }

    public static Length createFeet(double feet) {
        return createInch(feet * 12);
    }

    public static Length createInch(double inch) {
        return new Length(inch);
    }

    public boolean compare(Length lengthInInch) {
        return this.units == lengthInInch.units;
    }
}
