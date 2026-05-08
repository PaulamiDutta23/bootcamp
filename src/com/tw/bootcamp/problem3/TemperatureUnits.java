package com.tw.bootcamp.problem3;

public enum TemperatureUnits {
    F(-17.2222),C(1);
    private final double multipleFactor;

    TemperatureUnits(double multipleFactor){
        this.multipleFactor = multipleFactor;
    }

    public double convertToBase(double actualValue) {
        return this.multipleFactor * actualValue;
    }
}
