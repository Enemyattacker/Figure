package ru.stetsenko;

/**
 * Created by Alesha on 06.10.2015.
 */
public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(3,5);
        Rectangle rightRectangle = new Rectangle (3);
        Rectangle emptyRectangle = new Rectangle ();
        Triangle triangle = new Triangle (3,5);
        Triangle rightTriangle = new Triangle (4);
        Triangle emptyTriangle = new Triangle ();
        rectangle.output();
        rightRectangle.output();
        emptyRectangle.output();
        triangle.output();
        rightTriangle.output();
        emptyTriangle.output();



    }
}
