package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sedan mySedan = new Sedan(160, 20000, Color.blue, 10);
        Ford myFord1 = new Ford (156,4452.0,Color.black,2005, 10 , 11);
        Ford myFord2 = new Ford (155,5000.0,Color.gray,1998, 5, 11);
        FordPermium myPremiumFord = new FordPermium(180,5000,Color.cyan,3,20,100);
        Car myCar = new Car (555, 56856.0, Color.green);
        System.out.printf("MySedan Price %.2f", mySedan.getSalePrice());
        System.out.printf("MyFord1 Price %.2f", myFord1.getSalePrice());
        System.out.printf("MyFord2 Price %.2f", myFord2.getSalePrice());
        System.out.printf("MyCar Price %.2f", myCar.getSalePrice());

        System.out.println("-------------------------------------------------------------------------------------------------");

        House house = new House("yonge" , "999");
        Map map = new HashMap();

        map.put("home" , house);
        map.put("car" , myFord1);

        Set mySet = new HashSet();
        mySet.add(house);
        mySet.add(myFord1);

        List mylist = new ArrayList();
        mylist.add(35);
        Collections.shuffle(mylist);



    }
}
