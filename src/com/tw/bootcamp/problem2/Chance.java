package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
    private double probability;

    public Chance(double probability) {
        this.probability = probability;
    }

    public Chance() {

    }

    public static double intersection(Chance chance1, Chance chance2) {
        return chance1.probability * chance2.probability;
    }

    public static double union(Chance chance1, Chance chance2) {
        Chance inverseChance1 = new Chance(chance1.inverse());
        Chance inverseChance2 = new Chance(chance2.inverse());
        return new Chance(intersection(inverseChance1, inverseChance2)).inverse();
    }

    public double inverse() {
        return 1 - this.probability;
    }

    public double generateChance(double totalSampleSpace, double noOfFavourableEvent) {
        return noOfFavourableEvent/totalSampleSpace;
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
}
