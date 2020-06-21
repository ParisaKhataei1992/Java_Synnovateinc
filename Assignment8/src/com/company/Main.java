package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b , c , h= 0;
        Boolean continueFlag = true;
        String continueFromUser = "";
        Scanner myScanner = new Scanner(System.in);
        Trigonometry myTrigonometry = new Trigonometry();
        String firstSide, secondSide, thirdSide, hight = "";

        Triangle tr = new Triangle();
        Trigonometry trig = tr;
        AreaPerimeter ap = tr;

        while (continueFlag) {

            System.out.println("Enter the value for the first side of your triangle:");
            firstSide = myScanner.next();
            if (!myTrigonometry.isNumeric(firstSide)) {
                System.out.println("please enter a numeric value");
                continue;
            }

            a = Integer.parseInt(firstSide);

            System.out.println("Enter the value for the second side of your triangle:");
            secondSide = myScanner.next();

            if (!myTrigonometry.isNumeric(secondSide)) {
                System.out.println("please enter a numeric value");
                continue;
            }

            b = Integer.parseInt(secondSide);

            System.out.println("Enter the value for the third side of your triangle:");
            thirdSide = myScanner.next();

            if (!myTrigonometry.isNumeric(thirdSide)) {
                System.out.println("please enter a numeric value");
                continue;
            }

            c = Integer.parseInt(thirdSide);

            System.out.println("Enter the value for the hight side of your triangle:");
            hight = myScanner.next();

            if (!myTrigonometry.isNumeric(hight)) {
                System.out.println("please enter a numeric value");
                continue;
            }

            h = Integer.parseInt(hight);

           if(tr instanceof Trigonometry) System.out.println("The hypotenuse for " + a + " and " + b + " is equal to " + myTrigonometry.calculateHypontenuse(a, b));
           if(tr instanceof AreaPerimeter) System.out.println("The Area for " + b + " and " + h + " is equal to " + ap.area());
           if(tr instanceof AreaPerimeter) System.out.println("The Perimiter for " + a + " and " + b + "and" + c + " is equal to " + ap.perimeter());
            System.out.println("Continue... y/n?");
            continueFromUser = myScanner.next();
            if (continueFromUser.equalsIgnoreCase("n")) {
                continueFlag = false;
            }

        }

    }
}

