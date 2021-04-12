package edu.sabana.poob.shapes;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleSolidTest {
    private static RectangleSolid rs1;
    private static RectangleSolid rs2;
    private static RectangleSolid rs3;

    @BeforeAll
    public static void setUp() {
        rs1 = new RectangleSolid();
        rs2 = new RectangleSolid("red",10,2,4);
        rs3 = new RectangleSolid("blue", 2,2,2);}

    @Test
    public void shouldCalculateVolume() {

        assertEquals(1, (int) rs1.getVolume());
        assertEquals(80, (int) rs2.getVolume());
        assertEquals(8, (int) rs3.getVolume());
    }
    @Test
    public void shouldCalculateSuperficialArea() {

        assertEquals(6, (int) rs1.getSuperficialArea());
        assertEquals(136, (int) rs2.getSuperficialArea());
        assertEquals(24, (int) rs3.getSuperficialArea());
    }
}
