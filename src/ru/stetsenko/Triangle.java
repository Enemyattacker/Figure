package ru.stetsenko;

/**
 * Created by Alesha on 06.10.2015.
 */
public class Triangle extends Figure {
    @Override
    double squareTriangle(double a, double b){
        area=0.5*(a*b);
        return area;
    }

    double squareTriangle(double a){
        area=0.5*(a*a);
        return area;
    }

    double squareTriangle(){
        a=1;
        b=1;
        area=0.5*(a*b);
        return area;
    }

    void output(){
            System.out.println("Площадь треугольника " + area + " кв. ед");
    }
}
