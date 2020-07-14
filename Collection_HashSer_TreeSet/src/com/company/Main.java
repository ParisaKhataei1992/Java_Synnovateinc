package com.company;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ravi");
        set1.add("Vijay");
        set1.add("Arun");
        set1.add("Sumit");
        System.out.println(set1);
        //removing
        set1.remove("Ravi");
        System.out.println(set1);
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Ajay");
        set2.add("Gaurav");
        //Combining Set1 and Set2
        set1.addAll(set2);
        System.out.println(set1);
        //removing everything
        set1.removeAll(set2);
        System.out.println(set1);
        set1.removeIf(str -> str.contains("Vijay"));
        System.out.println(set1);
        set.clear();
        System.out.println(set);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        HashSet<Book> set3 = new HashSet<Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        set3.add(b1);
        set3.add(b2);
        set3.add(b3);
        for (Book b : set3)
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        ;

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();


        //Tree Set
        TreeSet<String> set4 = new TreeSet<String>();
        set4.add("Ravi");
        set4.add("Vijay");
        set4.add("Ravi");
        set4.add("Ajay");
        for (String l : set4)
            System.out.println(l);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        TreeSet<Integer> set6 = new TreeSet<Integer>();
        set6.add(24);
        set6.add(46);
        set6.add(91);
        set6.add(10);
        System.out.println(set6.pollFirst());
        System.out.println(set6.pollLast());

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        TreeSet<String> set7 = new TreeSet<String>();
        set7.add("A");
        set7.add("B");
        set7.add("C");
        set7.add("D");
        set7.add("E");
        System.out.println(set7);
        System.out.println(set7.descendingSet());
        System.out.println(set7.headSet("C" , true));
        System.out.println(set7.subSet("A" , false , "E" , true));
        System.out.println(set7.tailSet("C" , false));


    }
}
