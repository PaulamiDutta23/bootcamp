package com.tw.bootcamp.problem5;

import java.util.HashMap;

public class Bag {
    private final int limit;
    private final HashMap<ColouredBall, Integer> balls;
    private int count;

    private Bag(int limit) {
        this.count = 0;
        this.balls=new HashMap<>();
        this.limit = limit;
    }
    public static Bag create(int limit) {
        return new Bag(limit);
    }

    public int addBall(ColouredBall colourBall) {
        if(this.count == this.limit){
            throw new BagLimitExceedException("Bag is full");
        }

        this.balls.merge(colourBall, 1, Integer::sum);
        return ++this.count;
    }
}
