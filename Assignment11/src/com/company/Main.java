package com.company;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int lineCount = -1;
        String eachLine = "";
        String [] myArray;
        ArrayList<String> myList = new ArrayList<String>();
        Scanner myScanner = new Scanner(System.in);

        while(!eachLine.equals("*"))
        {
            eachLine = myScanner.nextLine();
            myArray = eachLine.split(" ");
            myList.addAll(Arrays.asList(myArray));
        }

        Set<String> mySet = new HashSet<String>();
        Iterator myIterator = mySet.iterator();

        Map myMap = new HashMap();

        while(myIterator.hasNext())
        {
            String myString = (String) myIterator.next();
            int myFreq = Collections.frequency(myList, myString);
            myMap.put(myString , myFreq);
        }

        TreeMap myTreeMap = new TreeMap();
        //to sort the result
        myTreeMap.putAll(myMap);
        System.out.println(myTreeMap);


        System.out.println("*******************");
        System.out.println("You typed " + myList.size() + " words. In " + lineCount + " lines." );
        System.out.println("The number of unique words: " + myList.size());
        System.out.println("*******************");


    }
}
