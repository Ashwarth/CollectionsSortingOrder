package com.suseela.treesetwithStrings;

import java.util.Comparator;
import java.util.TreeSet;

public class Test implements Comparator<String> {
    public static  void main(String[] args)
    {

    }


    @Override
    public int compare(String o1, String o2) {
        String s1=o1.toString();
        String s2=o2.toString();
        return s1.compareTo(s2);
    }


}
