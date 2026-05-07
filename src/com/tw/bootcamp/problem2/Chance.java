package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
    private double probability;

    private Chance(double probability) {
        this.probability = probability;
    }

    public static Chance create(double chance) {
        return new Chance(chance);
    }

    public Chance and(Chance otherChance) {
        return Chance.create(this.probability * otherChance.probability);
    }

    public Chance union(Chance otherChance) {
        return this.not().and(otherChance.not()).not();
    }

    public Chance or(Chance otherChance) {
        return Chance.create((this.probability + otherChance.probability) - this.and(otherChance).probability);
    }

    public Chance not() {
        return Chance.create(1 - this.probability);
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
