package com.company;

import java.awt.*;

public class Sedan extends Car{

    private int length;

    public Sedan(int speed, double regularPrice, Color color , int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    double getSalePrice(){
        if(this.length > 20)
            return (this.getRegularPrice()*0.95);
        else
            return (this.getRegularPrice()*0.9);
    }


}
