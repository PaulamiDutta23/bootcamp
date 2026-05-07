package com.tw.bootcamp.problem1.shapes;

public class Square {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        if(this.side < 1) {
            throw new RuntimeException("side cannot be less than 1");
        }
        return this.side * this.side;
    }

    public double calculatePerimeter() {
        if(this.side < 1) {
            throw new RuntimeException("side cannot be less than 1");
        }
        return 4* this.side;
    }
}
