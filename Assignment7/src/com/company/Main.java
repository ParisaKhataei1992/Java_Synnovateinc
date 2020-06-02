package com.company;

public class Main {

    public static void main(String[] args) {
        WordTool wt = new WordTool();
        System.out.println("TEXT: The river carried the memories from her childhood.");
        System.out.println("Total words:" + wt.totalWord("The river carried the memories from her childhood."));
        System.out.println("Total symbols (w. spaces): " + wt.totalWSpace("The river carried the memories from her childhood."));
        System.out.println("Total symbols (wo. spaces): " + wt.totalWoSpace("The river carried the memories from her childhood."));
        System.out.println("Total amount of e: " + wt.countSymbolE("The river carried the memories from her childhood." , "e"));


    }
}
