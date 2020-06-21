package com.company;

import java.awt.*;

public class FordPermium extends Ford implements Permiunm{

    public FordPermium(int speed, double regularPrice, Color color, int length,
                       int year, int manufactorDiscount) {
        super(speed, regularPrice, color, length, year, manufactorDiscount);
    }

    @Override
    public int warrantyYears() {
        return Math.floorDiv((int) this.getRegularPrice() , 10);
    }
}
