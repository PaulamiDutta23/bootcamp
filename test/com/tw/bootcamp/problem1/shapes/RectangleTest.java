package com.tw.bootcamp.problem1.shapes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    @DisplayName("Rectangle-Area")
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.calculateArea());
    }
}