package com.company;

import java.util.Arrays;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //sort kardane arraye
        String [] text = new String[] {"spam" , "more" , "buy"};
        Arrays.sort(text);
        System.out.println(Arrays.toString(text));

        int [] arr1 = new int[] {1,2,3,4};
        int [] arr2 = new int[] {5,6,7,8};
        String [] str1 = new String[] {"Salam" , "Hola" , "Hello" , "Marhaba"};
        String [] str2 = new String[] {"Salam" , "Hola" , "Hello" , "Marhaba"};
        int a1[][] = { { 10, 20 },
                { 40, 50 },
                { 60, 70 } };

        int a2[][] = { { 30, 20 },
                { 10, 0 },
                { 60, 80 } };
        System.out.println(Arrays.equals(arr1 , arr2));
        System.out.println(Arrays.deepEquals(new int[][]{arr1}, new int[][]{arr2}));
        System.out.println(Arrays.equals(str1 , str2));
        System.out.println(Arrays.deepEquals(str1 , str2));
        System.out.println(Arrays.equals(a1 , a2));
        System.out.println(Arrays.deepEquals(a1 , a2));
//        Arrays.fill(numbers , 4);
//        Arrays.fill(nubers2, 4);

        System.out.println("------------------------------------");

        String[]  text1 = {"love" , "is" , "in" , "the" , "air"};
        Arrays.sort(text1);
        System.out.println(Arrays.toString(text1));
        int search = Arrays.binarySearch(text1, "in");
        System.out.println(search);

        System.out.println("------------------------------------");



    }
}
