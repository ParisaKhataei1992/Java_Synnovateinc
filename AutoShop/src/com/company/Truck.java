package com.company;

import java.awt.*;

public class Truck extends Car {

    private int weight;

    public Truck(int speed, double regularPrice, Color color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice()
    {
        if(weight>20000)
        {
            return (this.getRegularPrice()*0.09);
        }
        else
            return (this.getRegularPrice()*0.8);
    }
}
