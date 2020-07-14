package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map map = new HashMap();
        map.put(1 , "Mohammad");
        map.put(3, "Parisa");
        map.put(6,"Roya");
        map.put(9, "Maryam");

        Set mySet = map.entrySet();
        Iterator myItrator = mySet.iterator();
        while(myItrator.hasNext())
        {
            Map.Entry entry = (Map.Entry)myItrator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println();
        System.out.println("☻☺☻☺☻☻☺☻☺☻☻☺☻☺☻☻☺☻☺☻☻☺☻☺☻");
        System.out.println();

        Map<Integer,String> map1 = new HashMap<Integer, String>();
        map1.put(101 , "One");
        map1.put(303 , "Three");
        map1.put(808 , "Eight");
        map1.put(606 , "Six");

        for(Map.Entry entry: map1.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        //System.out.println(map1.entrySet());

        System.out.println();
        System.out.println("☻☺☻☺☻☻☺☻☺☻☻☺☻☺☻☻☺☻☺☻☻☺☻☺☻");
        System.out.println();

        Map<Integer , String> map2 = new HashMap<Integer, String>();
        map2.put(100,"Amit");
        map2.put(103,"Vijay");
        map2.put(102,"Rahul");
        map2.entrySet().stream();
        System.out.println(map2);


    }
}
