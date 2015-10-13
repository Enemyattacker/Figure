package ru.stetsenko;

/**
 * Класс для треугольника
 *
 * @author Стеценко Алексей
 */
public class Triangle extends Figure {

    public Triangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    /**
     * Конструктор, инициализирующий равнобедренный прямоугольный треугольник
     *
     * @param a Катет треугольника
     */
    public Triangle(double a){
        this(a, a);
    }

    /**
     * Конструктор, инициализирующий прямоугольный треугольник по умолчанию с катетами (1,1)
     *
     */
    public Triangle(){
        this(1);
    }

    /**
     * Переопределение метода вычисления площади треугольника
     *
     * @return 0.5*(a*b) - плошадь треугольника
     */
    @Override
    double square(){
        return 0.5*(a*b);
    }

    /**
     * Переопределение метода вывода
     */
    @Override
    void output(){
            System.out.println("Площадь треугольника " + square() + " кв. ед");
    }
}
