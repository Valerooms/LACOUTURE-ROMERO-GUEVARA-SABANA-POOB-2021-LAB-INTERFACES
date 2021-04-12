package edu.sabana.poob.shapes;

public class Pyramid extends Triangle implements GeometricShape3D{

    private double height=1;

    public Pyramid() {
        super();

    }

    public Pyramid(String color, double side1, double side2, double side3, double height) {
        super(color, side1, side2, side3);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return getArea()*height/3;
    }

    @Override
    public double getSuperficialArea() {
        return 4*getArea();
    }

}
