package edu.sabana.poob.shapes;

public class Cylinder extends Circle implements GeometricShape3D {

    private double height;

    public Cylinder() {
        super();
        this.height = 1;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return height*getArea();
    }

    @Override
    public double getSuperficialArea() {
        return getPerimeter()*height+2*getArea();
    }
}
