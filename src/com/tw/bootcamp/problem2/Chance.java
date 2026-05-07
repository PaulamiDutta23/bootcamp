package com.tw.bootcamp.problem2;

public class Chance {
    private final double totalCoins;

    private Chance(double totalCoins) {
        this.totalCoins = totalCoins;
    }

    public static Chance createChanceForCoins(double totalCoins) {
        return new Chance(totalCoins);
    }

    public double getTails() {
        double possibleOutcomes = Math.pow(2, this.totalCoins);
        return 1/possibleOutcomes;
    }

    public double getNoTails() {
        return 1 - getTails();
    }
}
