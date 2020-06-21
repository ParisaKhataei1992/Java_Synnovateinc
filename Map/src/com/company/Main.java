package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map map = new HashMap();
        map.put("number" , 1);
        map.put("text" , "hola");
        map.put("decimal" , 5.7);

        System.out.println(map.get("text"));

        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        if(!map.containsKey("decimal"))
        {
            System.out.println("there are no bytes here!");
        }
    }
}
