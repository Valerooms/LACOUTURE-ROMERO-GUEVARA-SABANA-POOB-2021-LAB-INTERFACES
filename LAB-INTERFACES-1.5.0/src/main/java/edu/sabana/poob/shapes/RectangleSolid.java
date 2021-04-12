package edu.sabana.poob.shapes;

public class RectangleSolid extends Rectangle implements GeometricShape3D{

    private double height=1;
    private double width=1;
    private double length=1;


    public RectangleSolid(String color, double height, double width, double length) {
        super(color);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public RectangleSolid() {

    }
    public RectangleSolid(double height, double width, double length) {
        super(height,width);
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public RectangleSolid(String color)
    {
        super(color);
    }


    @Override
    public double getVolume() {
        return height*width*length;
    }

    @Override
    public double getSuperficialArea() {
        return 2*height*width+2*width*length+2*length*height;
    }
}
