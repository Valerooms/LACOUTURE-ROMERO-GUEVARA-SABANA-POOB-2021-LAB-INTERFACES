package edu.sabana.poob.shapes;

public class Rectangle extends Shape implements GeometricShape2D{
    private double width =1;
    private double length =1;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

    }

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;

    }
    public Rectangle(String color) {
        super(color);
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(width,2)+Math.pow(length,2));
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){

        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(" , width %s and length %s",(int)width,(int)length);
    }

    public String superate(){

        return super.toString();
    }
}
