package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a;
        double b;
        double h = 0.0;
        boolean continueFlag = true;

        Scanner inputNumbers = new Scanner(System.in);

        while (continueFlag){
        System.out.print("Please Enter Line A: ");
        a = inputNumbers.nextDouble();

        System.out.print("Please Enter Line B: ");
        b = inputNumbers.nextDouble();

        Trigonometry tr = new Trigonometry(a, b , h);
//        System.out.println(tr.trigoneResult());
        System.out.println(tr.toString());




    }
}
