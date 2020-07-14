package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int lineCount = -1;
        String eachLine = "";
        String[] myArray ;
        ArrayList<String> myList = new ArrayList<String>();
        Scanner myScanner = new Scanner(System.in);

        while(!eachLine.equals("*"))
        {
            eachLine = myScanner.nextLine();
            myArray = eachLine.split(" ");
            myList.addAll(Arrays.asList(myArray));
            lineCount++;
        }

        Set<String> mySet = new HashSet<String>();
        mySet.addAll(myList);
        Iterator myIterator = mySet.iterator();

        List<EachNode> myNode = new ArrayList<EachNode>();
        while(myIterator.hasNext()) {
            String myString = (String) myIterator.next();
            int myFreq = Collections.frequency(myList , myString);
            myNode.add(new EachNode(myString, myFreq));
        }
        Collections.sort(myNode,new SortNodeByValue());




        for (int i = 0; i < myNode.size(); i++) {
            System.out.print("The word "+myNode.get(i).key);
            System.out.println(" is repeated. " + myNode.get(i).value);

        }


        System.out.println("*******************");
        System.out.println("You typed " + myList.size() + " words. In " + lineCount + " lines." );
        System.out.println("The number of unique words: " + mySet.size());
        System.out.println("*******************");
        //System.out.println(wh
    }
}
