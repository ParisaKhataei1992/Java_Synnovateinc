package com.company;

public class Trigonometry {

    //Variables
    public double a;
    public double b;
    public double h;


    public Trigonometry(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

//    public double trigoneResult()
//    {
//        double mySum = (Math.pow(a , 2) + Math.pow(b , 2));
//        return Math.sqrt(mySum);
//    }

    @Override
    public String toString() {

        double mySum = (Math.pow(a, 2) + Math.pow(b, 2));
        h = Math.sqrt(mySum);
        return "Trigonometry is : " + h;
    }
}
