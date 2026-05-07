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
        void shouldArea() {
            Rectangle rectangle = Rectangle.createRectangle(2, 3);
            assertEquals(6, rectangle.area());
        }

        @Test
        @DisplayName("- double")
        void shouldAreaForDoubleValues() {
            Rectangle rectangle = Rectangle.createRectangle(2.2, 3.2);
            assertEquals(7.04, rectangle.area(), 0.1);
        }

        @Test
        @DisplayName("- double & int")
        void shouldAreaForDoubleAndIntValues() {
            Rectangle rectangle = Rectangle.createRectangle(2.2, 3);
            assertEquals(6.6, rectangle.area(), 0.1);
        }

        @Test
        @DisplayName("- Error")
        void shouldThrowErrorOnZeroValues() {
            RuntimeException error = assertThrows(InvalidLengthAndBreadthException.class, ()->Rectangle.createRectangle(2,0));
            assertEquals("side cannot be less than 1",error.getMessage());
        }
    }

    @Nested
    @DisplayName("rectangle perimeter")
    class RectanglePerimeter {
        @Test
        @DisplayName("- int")
        void shouldPerimeterForInt() {
            Rectangle rectangle = Rectangle.createRectangle(2, 3);
            assertEquals(10, rectangle.perimeter());
        }

        @Test
        @DisplayName("- double")
        void shouldPerimeterForDouble() {
            Rectangle rectangle = Rectangle.createRectangle(2.2, 3.1);
            assertEquals(10.6, rectangle.perimeter(), 0.1);
        }

        @Test
        @DisplayName("- double & int")
        void shouldPerimeterForDoubleAndInt() {
            Rectangle rectangle = Rectangle.createRectangle(2.2, 3);
            assertEquals(10.4, rectangle.perimeter(), 0.1);
        }

        @Test
        @DisplayName("- Error")
        void shouldThrowErrorOnZeroValues() {
            RuntimeException error = assertThrows(InvalidLengthAndBreadthException.class, ()->Rectangle.createRectangle(2.2, 0));
            assertEquals("side cannot be less than 1",error.getMessage());
        }
    }

    @Nested
    @DisplayName("square area")
    class SquareAreaTest {
        @Test
        @DisplayName("- int")
        void shouldCalculateAreaForInt() {
            Rectangle square = Rectangle.createSquare(2);
            assertEquals(4, square.area());
        }

        @Test
        @DisplayName("- double")
        void shouldCalculateAreaForDouble() {
            Rectangle square = Rectangle.createSquare(2.2);
            assertEquals(4.84, square.area(), 0.1);
        }

        @Test
        @DisplayName("- Error")
        void shouldThrowErrorOnZeroValues() {
            RuntimeException error = assertThrows(InvalidLengthAndBreadthException.class, () -> Rectangle.createSquare(0));
            assertEquals("side cannot be less than 1",error.getMessage());
        }
    }

    @Nested
    @DisplayName("square perimeter")
    class SquarePerimeterTest {
        @Test
        @DisplayName("- int")
        void shouldCalculatePerimeterForInt() {
            Rectangle square = Rectangle.createSquare(2);
            assertEquals(8, square.perimeter());
        }

        @Test
        @DisplayName("- double")
        void shouldCalculatePerimeterForDouble() {
            Rectangle square = Rectangle.createSquare(2.2);
            assertEquals(8.8, square.perimeter(), 0.1);
        }

        @Test
        @DisplayName("- Error")
        void shouldThrowErrorOnZeroValues() {
            RuntimeException error = assertThrows(InvalidLengthAndBreadthException.class, ()-> Rectangle.createSquare(0));
            assertEquals("side cannot be less than 1",error.getMessage());
        }
    }
}
