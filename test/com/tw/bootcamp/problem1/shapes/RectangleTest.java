package com.tw.bootcamp.problem1.shapes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Nested
    @DisplayName("rectangle area")
    class RectangleArea{
        @Test
        @DisplayName("- int")
        void shouldCalculateArea() {
            Rectangle rectangle = new Rectangle(2, 3);
            assertEquals(6, rectangle.calculateArea());
        }

        @Test
        @DisplayName("- double")
        void shouldCalculateAreaForDoubleValues() {
            Rectangle rectangle = new Rectangle(2.2, 3.2);
            assertEquals(7.04, rectangle.calculateArea(), 0.1);
        }

        @Test
        @DisplayName("- double & int")
        void shouldCalculateAreaForDoubleAndIntValues() {
            Rectangle rectangle = new Rectangle(2.2, 3);
            assertEquals(6.6, rectangle.calculateArea(), 0.1);
        }

        @Test
        @DisplayName("- Error")
        void shouldThrowErrorOnZeroValues() {
            Rectangle rectangle = new Rectangle(2.2, 0);
            RuntimeException error = assertThrows(RuntimeException.class, () -> rectangle.calculateArea());
            assertEquals("length or breadth cannot be less than 1",error.getMessage());
        }
    }

    @Nested
    @DisplayName("rectangle perimeter")
    class RectanglePerimeter {
        @Test
        @DisplayName("- int")
        void shouldCalculatePerimeterForInt() {
            Rectangle rectangle = new Rectangle(2, 3);
            assertEquals(10, rectangle.calculatePerimeter());
        }

        @Test
        @DisplayName("- double")
        void shouldCalculatePerimeterForDouble() {
            Rectangle rectangle = new Rectangle(2.2, 3.1);
            assertEquals(10.6, rectangle.calculatePerimeter(), 0.1);
        }

        @Test
        @DisplayName("- double & int")
        void shouldCalculatePerimeterForDoubleAndInt() {
            Rectangle rectangle = new Rectangle(2.2, 3);
            assertEquals(10.4, rectangle.calculatePerimeter(), 0.1);
        }

        @Test
        @DisplayName("- Error")
        void shouldThrowErrorOnZeroValues() {
            Rectangle rectangle = new Rectangle(2.2, 0);
            RuntimeException error = assertThrows(RuntimeException.class, () -> rectangle.calculatePerimeter());
            assertEquals("length or breadth cannot be less than 1",error.getMessage());
        }
    }
}
