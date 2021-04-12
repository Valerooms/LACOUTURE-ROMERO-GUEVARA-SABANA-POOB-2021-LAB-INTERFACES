package edu.sabana.poob.shapes;

public class Triangle extends Shape implements GeometricShape2D{
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(String color) {
        super(color);
    }

    public boolean isIsoceles(){
        boolean ladito = true;
        if (side1 ==side2 && side1==side3){
            ladito = false;

        }
        return ladito;
    }
    public boolean isEquilateral(){
        boolean ladito = false;
        if (side1 ==side2 && side1==side3){
            ladito = true;

        }
        return ladito;
    }

    public double getArea(){
        double altura = Math.sqrt(Math.pow(side1,2)-Math.pow(side2/2,2));
        return (side2*altura)/2;
    }

    public double getPerimeter(){

        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return super.toString()+ String.format(" and sides %s, %s, %s",(int)side1,(int)side2,(int)side3);
    }
}
