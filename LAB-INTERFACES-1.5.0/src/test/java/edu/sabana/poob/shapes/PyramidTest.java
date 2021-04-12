package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidTest {

    private static Pyramid p1;
    private static Pyramid p2;
    private static Pyramid p3;

    @BeforeAll
    public static void setUp() {
        p1 = new Pyramid();
        p2 = new Pyramid("blue",4,2,5,1);
        p3 = new Pyramid("red",15,15,15,15);}

    @Test
    public void shouldCalculateVolume() {

        assertEquals(0, (int) p1.getVolume());
        assertEquals(1, (int) p2.getVolume());
        assertEquals(562, (int) p3.getVolume());
    }
    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(2, (int) p1.getSuperficialArea());
        assertEquals(15, (int) p2.getSuperficialArea());
        assertEquals(450, (int) p3.getSuperficialArea());
    }
}
