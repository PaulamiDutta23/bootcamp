package com.tw.bootcamp.problem2;

public class Coin {
    private final int totalOutcomes;

    public Coin() {
        this.totalOutcomes = 2;
    }
    public double tailProbability() {
        return 1.0/this.totalOutcomes;
    }
}
