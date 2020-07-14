package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myInput = new Scanner(System.in);
        String eachline = "";
        int lincount = -1;
        String[] wordEachLine;
        List<String> myList = new ArrayList<String>();

        while(!eachline.equals("*"))
        {
            eachline = myInput.nextLine();
            wordEachLine = eachline.split(" ");
            myList.addAll(Arrays.asList(wordEachLine));
            lincount++;
        }

        System.out.println("You typed " + myList.size() + " words. In " + lincount + " lines." );
        System.out.println(myList);
    }

}

