package com.tw.bootcamp.problem1.shapes;

public class Rectangle {
    private final double length;
    private final double breadth;

    private Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createRectangle(double length, double breadth) {
        if(length < 1 || breadth < 1) {
            throw new InvalidLengthAndBreadthException("side cannot be less than 1");
        }

        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(double side) {
        return createRectangle(side, side);
    }

    public double area() {
        return this.length * this.breadth;
    }

    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }
}
