package com.company;

public class Main {

    public static void main(String[] args) {

        //Variable
        int salesClass = 2;

        //Switch Statment
        switch (salesClass) {
            case 1:
                System.out.println("Commission Rate is 0.02");
                break;
            case 2:
                System.out.println("Commission Rate is 0.035");
                break;
            case 3:
                System.out.println("Commission Rate is 0.05");
                break;
            default:
                System.out.println("Commission Rate is 0");
                break;

//        switch (salesClass) {
//            case 1 -> System.out.println("Commission Rate is 0.02");
//            case 2 -> System.out.println("Commission Rate is 0.035");
//            case 3 -> System.out.println("Commission Rate is 0.05");
//            default -> System.out.println("Commission Rate is 0");
//       }

        }
    }
}
