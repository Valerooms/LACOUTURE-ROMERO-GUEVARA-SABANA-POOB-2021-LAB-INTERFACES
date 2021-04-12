package edu.sabana.poob.shapes;

public class Cube extends RectangleSolid {

    private double side = 1;

   public Cube()
   {

   }
   public Cube(String color)
   {
       super(color);
   }
   public Cube(double side)
   {
       super(side,side,side);
   }
   public Cube(String color, double side)
   {
       super(color,side,side,side);
   }

}
