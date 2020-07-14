package com.company;

import java.util.Comparator;

public class SortNodeByValue implements Comparator<EachNode> {

    @Override
    public int compare(EachNode o1, EachNode o2) {
        return o1.value - o2.value;
    }
}
