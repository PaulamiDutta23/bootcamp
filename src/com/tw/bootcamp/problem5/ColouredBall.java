package com.tw.bootcamp.problem5;

public enum ColouredBall {
    BLUE(12),GREEN(3),RED(12),YELLOW(12);

    private final int maxCount;

    ColouredBall(int maxCount){
        this.maxCount = maxCount;
    }

    public void checkOverflow(int currentBallCount) {
        if(currentBallCount == this.maxCount) {
            throw new GreenBallLimitExceedException("There are already 3 green balls");
        }
    }
}
