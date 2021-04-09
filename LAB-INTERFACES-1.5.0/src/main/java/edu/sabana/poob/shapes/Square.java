package edu.sabana.poob.shapes;

public class Square extends Rectangle{
    private double width =1;
    private double length =1;

    public Square() {

    }

    public Square(double width, double length) {
        this.width = width;
        this.length = length;

    }

    public Square(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;

    }
    public Square(String color) {
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
        return super.superate()+ String.format(" , width %s and length %s",(int)width,(int)length);
    }
}
