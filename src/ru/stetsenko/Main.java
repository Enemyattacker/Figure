package ru.stetsenko;

/**
 * Created by Alesha on 06.10.2015.
 */
public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        Rectangle square = new Rectangle();
        Rectangle emptyRectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Triangle rightTriangle = new Triangle();
        Triangle emptyTriangle = new Triangle();
        rectangle.squareRectangle(2, 4);
        square.squareRectangle(4);
        emptyRectangle.squareRectangle();
        triangle.squareTriangle(3,6);
        rightTriangle.squareTriangle(5);
        emptyTriangle.squareTriangle();
        rectangle.output();
        square.output();
        emptyRectangle.output();
        triangle.output();
        rightTriangle.output();
        emptyTriangle.output();


    }
}
