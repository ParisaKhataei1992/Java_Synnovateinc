package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Set operations
        int [] myArray = new int[] {3,25,2,79,2};
        Set mySet = new HashSet();
        Collections.addAll(mySet , myArray);
        System.out.println(mySet);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        Set<String> hash_set = new HashSet<String>();
        hash_set.add("To");
        hash_set.add("Man");
        hash_set.add("To");
        hash_set.add("Oo");
        hash_set.add("Ma");
        hash_set.add("Shoma");
        hash_set.add("Ma");
        hash_set.add("Ishan");
        System.out.println("The List without duplicate in HASH SET is --> " + hash_set);


        Set<String> tree_set = new TreeSet<String>(hash_set);
        System.out.println("The list in ordered in TREE SET is --> " + tree_set);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        Set <Integer> a =new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,4,8,9,0}));

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));

        //Union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("Union of the two Set: " + union);

        //Intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("Union of the two Set: " + intersection);

        //Difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("Union of the two Set: " + difference);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        int myList [] = {32,56,90,12,65,98,82,39};
        TreeSet setTree = new TreeSet<Integer>();
        try {
            for(int i = 0 ; i < myList.length ; i++)
                setTree.add(myList[i]);

            System.out.println(setTree);
            System.out.println("first elment " + setTree.first());
            System.out.println("last elment " + setTree.last());
        }
        catch (Exception e) {}

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        Iterator<String> iter = set.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        Set<String> set2 = new HashSet<String>();

        set2.add("We");
        set2.add("Are");
        set2.add("In");
        set2.add("Other");
        set2.add("City");

        System.out.println("The list is: " + set2);

        Iterator<String> iter1 = set2.iterator();
        System.out.println("The iterator values are: ");
        while(iter1.hasNext())
        {
            System.out.print(" " +iter1.next());
        }

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        Set<String> set3 = new HashSet<String>();

        set3.add("We");
        set3.add("Are");
        set3.add("In");
        set3.add("Other");
        set3.add("City");

        System.out.println("The list is: " + set3);
        System.out.println("The iterator values are: ");
        for(String i : set3)
        {
            System.out.print(" " + i);
        }

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        //Tree Set
        TreeSet<String> t1 = new TreeSet<String>();
        t1.add("A");
        t1.add("B");
        t1.add("C");
        t1.add("D");
        //Duplicate wont print out
        t1.add("A");

        System.out.println(t1);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        TreeSet<StringBuffer> t2 = new TreeSet<StringBuffer>();

        t2.add(new StringBuffer("A"));
        t2.add(new StringBuffer("B"));
        t2.add(new StringBuffer("C"));
        t2.add(new StringBuffer("D"));
        t2.add(new StringBuffer("C"));

        System.out.println(t2);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        TreeSet t3 = new TreeSet<String>();
        t3.add("Man");
        t3.add("Mohammad");
        t3.add("Ro");
        t3.add("Khili");
        t3.add("Dost");

        Iterator<String> iter2 = t3.iterator();
        while(iter2.hasNext())
        {
            System.out.println(iter2.next());
        }
        System.out.println("------");
        Iterator i = t3.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        TreeSet<Integer> t4 = new TreeSet<Integer>();
        t4.add(24);
        t4.add(45);
        t4.add(82);
        t4.add(91);
        t4.add(25);
        System.out.println(t4);
        System.out.println("Highest Value " + t4.pollFirst());
        System.out.println("Lowest Value " + t4.pollLast());

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        LinkedHashSet hs = new LinkedHashSet();

        hs.add("Man");
        hs.add("Mohammad");
        hs.add("Ro");
        hs.add("Khili");
        hs.add("Dost");
        hs.add("Daram");

        System.out.println(hs);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        LinkedHashSet<String> linkedList = new LinkedHashSet<String>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        linkedList.add("A");
        linkedList.add("E");

        System.out.println(linkedList.size());
        System.out.println(linkedList.remove("D"));
        System.out.println(linkedList.remove("Z"));
        System.out.println(linkedList);
        System.out.println(linkedList.contains("F"));
        System.out.println(linkedList);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        LinkedHashSet<String> s3 = new LinkedHashSet<String>();

        s3.add("One");
        s3.add("Two");
        s3.add("Three");
        s3.add("Four");
        s3.add("Five");

        Iterator<String> iterator = s3.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        LinkedHashSet<String> st = new LinkedHashSet<String>();
        st.add("Mohammad");
        st.add("Parisa");
        st.add("Dokhtaram");
        st.add("Pesaram");

        Iterator<String> iterr = st.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }

        
    }

}
