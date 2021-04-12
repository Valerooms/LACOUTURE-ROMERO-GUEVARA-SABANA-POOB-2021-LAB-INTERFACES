package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubeTest {
    private static Cube c1;
    private static Cube c2;
    private static Cube c3;

    @BeforeAll
    public static void setUp() {
        c1 = new Cube();
        c2 = new Cube(2);
        c3 = new Cube(4);}
    @Test
    public void shouldCalculateArea() {

        assertEquals(1, (int) c1.getArea());
        assertEquals(4, (int) c2.getArea());
        assertEquals(16, (int) c3.getArea());
    }

    @Test
    public void shouldCalculatePerimeter() {

        assertEquals(4, (int) c1.getPerimeter());
        assertEquals(8, (int) c2.getPerimeter());
        assertEquals(16, (int) c3.getPerimeter());
    }
    @Test
    public void shouldCalculateVolume() {

        assertEquals(1, (int) c1.getVolume());
        assertEquals(8, (int) c2.getVolume());
        assertEquals(64, (int) c3.getVolume());
    }
    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(6, (int) c1.getSuperficialArea());
        assertEquals(24, (int) c2.getSuperficialArea());
        assertEquals(96, (int) c3.getSuperficialArea());
    }
}
