package com.tw.bootcamp.problem1.shapes;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        if(this.length < 1 || this.breadth<1) {
           throw new RuntimeException("length or breadth cannot be less than 1");
        }
        return this.length * this.breadth;
    }

    public double calculatePerimeter() {
        if(this.length < 1 || this.breadth<1) {
            throw new RuntimeException("length or breadth cannot be less than 1");
        }
        return 2 * (this.length + this.breadth);
    }
}
