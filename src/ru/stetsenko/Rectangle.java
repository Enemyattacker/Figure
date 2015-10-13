package ru.stetsenko;


/**
 * Класс для прямоугольника
 *
 * @author Стеценко Алексей
 */
public class Rectangle extends Figure {

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    /**
     * Конструктор, инициализирующий квадрат
     *
     * @param a Сторона квадрата
     */
    public Rectangle(double a){
        this(a, a);
    }

    /**
     * Коснтурктор, инициализирующий прямоугольник по умолчанию со сторонами (1,1)
     */
    public Rectangle(){
        this(1);
    }

    /**
     * Переопределение метода, рассчитывающего площадь прямоугольника
     *
     * @return (a*b) - площадь прямоугольинка
     */
    @Override
    double square(){
        return a*b;
    }

    /**
     * Переопределение метода вывода
     */
    @Override
    void output(){
        System.out.println("Площадь прямоугольника " + square() + " кв. ед");
    }
}
