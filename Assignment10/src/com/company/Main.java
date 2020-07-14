package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int linCount = -1;
        String eachLine = "";
        String [] myArray;
        ArrayList<String> myList = new ArrayList<String>();
        Scanner myInput = new Scanner(System.in);

        while(!eachLine.equals("*"))
        {
            eachLine = myInput.nextLine();
            myArray = eachLine.split(" ");
            myList.addAll(Arrays.asList(myArray));
            linCount++;
        }

        Set<String> mySet = new HashSet<String>();
        //combinig set with list
        mySet.addAll(myList);
        //Itrator
        Iterator myItrator = mySet.iterator();
        while(myItrator.hasNext())
        {
            String myString = (String) myItrator.next();
            int myFreq = Collections.frequency(myList , myString);
            System.out.println(myString + " was repeated " + myFreq + " times." );
        }

        System.out.println("You typed " + myList.size() + " words. In " + linCount + " lines." );
        System.out.println("The number of unique words: " + myList.size());
    }
}
