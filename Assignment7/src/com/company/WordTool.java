package com.company;

public class WordTool {

    public int totalWord(String sentence)
    {
        String [] strArr = new String[0];
        if (!(sentence.isEmpty() || sentence == null)) {
            strArr = sentence.split(" ");
        }
        return strArr.length;
    }

    public int totalWSpace(String sentence)
    {
        int count = 0;
        if (!(sentence.isEmpty() || sentence == null)) {
            count = sentence.length();
        }
        return count;
     }

     public int totalWoSpace(String sentence) {

         String str = null;
         if (!(sentence.isEmpty() || sentence == null)) {
             str = sentence.replace(" ", "");
         }
         return str.length();
     }

    public int countSymbolE(String sentence, String chr) {
        String [] strArray;
        int count = 0;

        if (!(chr.isEmpty() || chr == null))
        {
            if (!(sentence.isEmpty() || sentence == null))
            {
                strArray = sentence.split("");
                for (String str : strArray) {
                    count += str.equals(chr) ? 1 : 0;
                }
            }
        }
        return count;
    }




}
