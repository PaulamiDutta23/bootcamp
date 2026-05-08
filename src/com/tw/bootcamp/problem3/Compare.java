package com.tw.bootcamp.problem3;

public class Compare {
    private final Volume volume1;
    private final Volume volume2;

    public Compare(Volume volume1, Volume volume2) {
        this.volume1 = volume1;
        this.volume2 = volume2;
    }

    public static Compare create(Volume volume1, Volume volume2) {
        return new Compare(volume1, volume2);
    }

    public boolean isEqual() {
        return this.volume1.isEqual(this.volume2);
    }
}
