package ru.stetsenko;


/**
 * Created by Alesha on 06.10.2015.
 */
public class Rectangle extends Figure {

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    public Rectangle(double a){
        this(a, a);
    }

    public Rectangle(){
        this(1);
    }

    @Override
    double square(){
        return a*b;
    }
    @Override
    void output(){
        System.out.println("Площадь прямоугольника " + square() + " кв. ед");
    }
}
