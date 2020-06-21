package com.company;

import java.awt.*;

public class Ford extends Sedan {

    private int year;
    private int manufactorDiscount;

    public Ford(int speed, double regularPrice, Color color, int length, int year, int manufactorDiscount) {
        super(speed, regularPrice, color, length);
        this.year = year;
        this.manufactorDiscount = manufactorDiscount;
    }

    double getSalePrice()
    {
        return (this.getRegularPrice() - this.manufactorDiscount);
    }
}
