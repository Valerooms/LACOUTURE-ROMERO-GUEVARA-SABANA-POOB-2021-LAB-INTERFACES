package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    private static Triangle t1;
    private static Triangle t2;
    private static Triangle t3;
    private static Triangle t4;

    @BeforeAll
    public static void setUp(){
        t1 = new Triangle("blue",10,10,10);
        t2 = new Triangle(6,4,6);
        t3 = new Triangle("Yellow");
        t4 = new Triangle();
    }

    @Test
    public void ShouldCalculateArea(){
        assertEquals((int)(25*Math.sqrt(3)),(int)t1.getArea());
        assertEquals((int)(8*Math.sqrt(2)),(int)t2.getArea());
        assertEquals((int)((1/4)*Math.sqrt(3)),(int)t3.getArea());
        assertEquals((int)((1/4)*Math.sqrt(3)),(int)t4.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(30,t1.getPerimeter());
        assertEquals(16,t2.getPerimeter());
        assertEquals(3,t3.getPerimeter());
        assertEquals(3,t4.getPerimeter());
    }

    @Test
    public void ShouldEvaluateIsIsoceles(){
        assertFalse(t1.isIsoceles());
        assertTrue(t2.isIsoceles());
        assertFalse(t3.isIsoceles());
        assertFalse(t4.isIsoceles());
    }

    @Test
    public void ShouldEvaluateIsEquilateral(){
        assertTrue(t1.isEquilateral());
        assertFalse(t2.isEquilateral());
        assertTrue(t3.isEquilateral());
        assertTrue(t4.isEquilateral());
    }

    @Test
    public void shouldPrintTriangle() {

        assertEquals("This is a Triangle with color blue and sides 10, 10, 10", t1.toString());
        assertEquals("This is a Triangle with color NONE and sides 6, 4, 6", t2.toString());
        assertEquals("This is a Triangle with color Yellow and sides 1, 1, 1", t3.toString());
        assertEquals("This is a Triangle with color NONE and sides 1, 1, 1", t4.toString());
    }
}