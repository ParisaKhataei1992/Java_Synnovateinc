package com.company;

import java.awt.*;

public class Car {

    private int speed;
    private double regularPrice;
    private Color color;

    public Car() {
    }

    double getSalePrice(){

        return 0;
    }

    public Car(int speed, double regularPrice, Color color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
