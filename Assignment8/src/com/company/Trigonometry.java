package com.company;

public class Trigonometry {

    public double calculateHypontenuse(int a , int b){
        return Math.hypot((double) a , (double) b);
    }

    public Trigonometry() {

    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
