package com.company;

public class Triangle extends Trigonometry implements AreaPerimeter {

    double areaResult = 0.0;
    double b , h , a , c;
    double perimeterResult = 0.0;


    @Override
    public double area() {
        areaResult = (b * h)/ 2;
        return areaResult;
    }

    @Override
    public double perimeter() {
        perimeterResult = a + b +c;
        return perimeterResult;
    }
}
