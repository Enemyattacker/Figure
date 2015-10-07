package ru.stetsenko;

/**
 * Created by Alesha on 06.10.2015.
 */
public class Rectangle extends Figure {
    @Override
    double squareRectangle(double a, double b){
        area=a*b;
        return area;
    }

    double squareRectangle(double a){
        area=a*a;
        return area;
    }

    double squareRectangle(){
        a=1;
        b=1;
        area=a*b;
        return area;
    }

    void output(){
        System.out.println("Площадь прямоугольника " + area + " кв. ед");
    }
}
