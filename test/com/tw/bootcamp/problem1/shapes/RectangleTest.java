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
    }
}
