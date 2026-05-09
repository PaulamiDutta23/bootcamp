package com.tw.bootcamp.problem5;

import java.util.HashMap;

public class Bag {
    private final int limit;
    private final HashMap<ColouredBall, Integer> balls;
    private int count;
    private final int MAX_GREEN_BALL = 3;
    private final int MAX_BLUE_BALL = 12;
    private final int MAX_YELLOW_BALL = 12;

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

        checkOverflow(colourBall);

        this.balls.merge(colourBall, 1, Integer::sum);
        return ++this.count;
    }

    private void checkOverflow(ColouredBall colourBall) {
        int currentBallCount = this.balls.getOrDefault(colourBall, 0);
        int maxCount = switch (colourBall) {
            case GREEN -> this.MAX_GREEN_BALL;
            case RED -> this.balls.getOrDefault(ColouredBall.GREEN, 0) * 2;
            case BLUE -> this.MAX_BLUE_BALL;
            case YELLOW -> this.MAX_YELLOW_BALL;
        };

        if(currentBallCount == maxCount) {
            throw new ColouredBallLimitExceedException("Ball exceeds max count");
        }
    }
}
