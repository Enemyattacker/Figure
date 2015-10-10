package ru.stetsenko;

/**
 * Created by Alesha on 06.10.2015.
 */
public class Triangle extends Figure {

    public Triangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    public Triangle(double a){
        this(a, a);
    }

    public Triangle(){
        this(1);
    }

    @Override
    double square(){
        return 0.5*(a*b);
    }
    @Override
    void output(){
            System.out.println("Площадь треугольника " + square() + " кв. ед");
    }
}
