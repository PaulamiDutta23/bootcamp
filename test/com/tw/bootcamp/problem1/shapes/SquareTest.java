package com.tw.bootcamp.problem1.shapes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Nested
    @DisplayName("square area")
    class SquareAreaTest {
        @Test
        @DisplayName("- int")
        void shouldCalculateAreaForInt() {
            Square square = new Square(2);
            assertEquals(4, square.calculateArea());
        }

        @Test
        @DisplayName("- double")
        void shouldCalculateAreaForDouble() {
            Square square = new Square(2.2);
            assertEquals(4.84, square.calculateArea(), 0.1);
        }
    }
}
