package com.tw.bootcamp.problem1;

import com.tw.bootcamp.problem1.shapes.Rectangle;

public class App {
    static void main() {
        Rectangle rectangle = Rectangle.createRectangle(4, 5);
        double area = rectangle.area();
    }
}
