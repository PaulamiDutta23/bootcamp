package com.tw.bootcamp.problem1.shapes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        @Test
        @DisplayName("- Error")
        void shouldThrowErrorOnZeroValues() {
            Square square = new Square( 0);
            RuntimeException error = assertThrows(RuntimeException.class, square::calculateArea);
            assertEquals("side cannot be less than 1",error.getMessage());
        }
    }

    @Nested
    @DisplayName("square perimeter")
    class SquarePerimeterTest {
        @Test
        @DisplayName("- int")
        void shouldCalculatePerimeterForInt() {
            Square square = new Square(2);
            assertEquals(8, square.calculatePerimeter());
        }

        @Test
        @DisplayName("- double")
        void shouldCalculatePerimeterForDouble() {
            Square square = new Square(2.2);
            assertEquals(8.8, square.calculatePerimeter(), 0.1);
        }

        @Test
        @DisplayName("- Error")
        void shouldThrowErrorOnZeroValues() {
            Square square = new Square( 0);
            RuntimeException error = assertThrows(RuntimeException.class, square::calculatePerimeter);
            assertEquals("side cannot be less than 1",error.getMessage());
        }
    }
}
