package com.tw.bootcamp.problem3;

import java.util.Objects;

public class PhysicalQuantity {


    private final double actualValue;
    private final double unitsInBase;

    public PhysicalQuantity(double actualValue, double unitsInBase) {
        this.actualValue = actualValue;
        this.unitsInBase = unitsInBase;
    }

    public static PhysicalQuantity create(double actualValue, TemperatureUnits temperatureUnits) {
        return new PhysicalQuantity(actualValue,temperatureUnits.convertToBase(actualValue));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalQuantity that = (PhysicalQuantity) o;
        return Math.abs(this.unitsInBase - that.unitsInBase) < 0.1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualValue, unitsInBase);
    }
}
