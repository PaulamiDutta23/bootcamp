package com.tw.bootcamp.problem5;

public class Bag {
    private final int limit;
    private int count;

    private Bag(int limit) {
        this.count = 0;
        this.limit = limit;
    }
    public static Bag create(int limit) {
        return new Bag(limit);
    }

    public int addBall() {
        if(this.count == this.limit){
            throw new BagLimitExceedException("Bag is full");
        }

        return ++this.count;
    }
}
