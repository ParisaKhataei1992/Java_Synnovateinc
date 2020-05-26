package com.company;

public class Main {

    public static void main(String[] args) {

        //Variable
        float x = (float) 5.7;
        float y = (float) 9.0;
        float min;

        System.out.println("Number 1: " + x );
        System.out.println("Number 2: " + y );

        //Ternary Operator
        min = (x < y) ? x : y;

        //Output Min
        System.out.println("Minimum of number 1 & 2 is: " + min);

    }
}
