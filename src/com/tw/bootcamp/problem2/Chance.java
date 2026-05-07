package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
    private double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    public Chance() {

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(probability, chance.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    public double inverse() {
        return 1 - this.probability;
    }

    public double generateChance(double totalSampleSpace, double noOfFavourableEvent) {
        return noOfFavourableEvent/totalSampleSpace;
    }
}
