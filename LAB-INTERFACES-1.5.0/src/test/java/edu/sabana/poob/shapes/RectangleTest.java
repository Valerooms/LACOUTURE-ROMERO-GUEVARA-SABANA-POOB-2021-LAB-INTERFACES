package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    private static Rectangle r1;
    private static Rectangle r2;
    private static Rectangle r3;
    private static Rectangle r4;

    @BeforeAll
    public static void setUp() {
        r1 = new Rectangle(5,6);
        r2 = new Rectangle("Viridian",3,2);
        r3 = new Rectangle("Trigueñito");
        r4 = new Rectangle();
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(30, (int) r1.getArea());
        assertEquals(6, (int) r2.getArea());
        assertEquals(1, (int) r3.getArea());
        assertEquals(1, (int) r4.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(22, (int) r1.getPerimeter());
        assertEquals(10, (int) r2.getPerimeter());
        assertEquals(4, (int) r3.getPerimeter());
        assertEquals(4, (int) r4.getPerimeter());
    }

    @Test
    public void ShouldCalculateDiagonal(){
        assertEquals(7, (int) r1.getDiagonal());
        assertEquals(3, (int) r2.getDiagonal());
        assertEquals(1, (int) r3.getDiagonal());
        assertEquals(1, (int) r4.getDiagonal());
    }

    @Test
    public void shouldPrintRectangle() {

        assertEquals("This is a Rectangle with color NONE , width 5 and length 6", r1.toString());
        assertEquals("This is a Rectangle with color Viridian , width 3 and length 2", r2.toString());
        assertEquals("This is a Rectangle with color Trigueñito , width 1 and length 1", r3.toString());
        assertEquals("This is a Rectangle with color NONE , width 1 and length 1", r4.toString());
    }

}