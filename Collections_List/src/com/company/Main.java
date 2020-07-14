package com.company;

import java.io.Flushable;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(35);
        list.add(85);
        list.add(42);
        list.add(20);
        list.add(17);
        System.out.println(list);
        int index = list.indexOf(20);
        System.out.println("before find 20 at: " + index);
        System.out.println(list);
        list.remove(index - 1);
        System.out.println(list);
        index = list.lastIndexOf(20);
        System.out.println("After find 20 at: " + index);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
        System.out.println(cars);
        System.out.println(cars.set(0 , "Opel"));
        System.out.println(cars);
        System.out.println(cars.remove(0));
        cars.clear();
        System.out.println(cars.size());

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Graps");

        for(String fruit: list1)
            System.out.println(fruit);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        //convert array to list
        String[] arr ={"PHP" , "Python" , "C++" , "C#"};
        System.out.println(Arrays.toString(arr));
        ArrayList<String> li = new ArrayList<String>();
        for (String a : arr)
        {
            li.add(a);
        }
        System.out.println(li);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        //convert list to array
        ArrayList<String> l1 = new ArrayList<String>();
        l1.add("Something");
        l1.add("Anything");
        l1.add("Nothing");
        System.out.println(l1);
        String[] arr1 = l1.toArray(new String[l1.size()]);
        System.out.println(Arrays.toString(arr1));

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        ArrayList<String> l2 = new ArrayList<String>();
        l2.add("Something");
        l2.add("Anything");
        l2.add("Nothing");
        System.out.println(l2.get(1));
        l2.set(0, "Everything");
        System.out.println(l2);
        for(String ll: l2)
            System.out.println(ll);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        //Sorting the String list
        List<String>lll = new ArrayList<String>();
        lll.add("C");
        lll.add("A");
        lll.add("B");
        Collections.sort(lll);
        for(String llll : lll)
            System.out.println(llll);

        //Sorting number list
        List<Integer>l4 = new ArrayList<Integer>();
        l4.add(3);
        l4.add(4);
        l4.add(1);
        l4.add(2);
        Collections.sort(l4);
        for(Integer num : l4)
            System.out.println(num);

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        List<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        ListIterator<String> itr=al.listIterator();
        System.out.println("Traversing elements in forward direction");
        while(itr.hasNext()){

            System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());
        }
        System.out.println("Traversing elements in backward direction");
        while(itr.hasPrevious()){

            System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());
        }

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        //Class list
        List<Book> book = new ArrayList<Book>();
        Book b1 =new Book(101,8,"Yashwant Kanetkar","BPB","Let us C");
        Book b2=new Book(102,4,"Forouzan","Mc Graw Hill","Data Communications and Networking");
        Book b3=new Book(103,6,"Galvin","Wiley","Operating System");
        book.add(b1);
        book.add(b2);
        book.add(b3);
        for(Book b:book)
            System.out.println(b.id + " " + b.quantity + " " + b.name + " " + b.author + " " + b.publishe );

        System.out.println();
        System.out.println("☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻☺☻");
        System.out.println();

        //Hash Set

    }
}
