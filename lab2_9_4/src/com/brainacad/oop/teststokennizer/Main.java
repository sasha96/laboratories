package com.brainacad.oop.teststokennizer;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String space = " ";
        String comma = ",";
        String dot = ".";
        String myStr  = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer stringTokenizer1 = new StringTokenizer(myStr,space);
        StringTokenizer stringTokenizer2 = new StringTokenizer(myStr,comma);
        StringTokenizer stringTokenizer3 = new StringTokenizer(myStr,dot);
        while (stringTokenizer1.hasMoreElements()){
            System.out.println(stringTokenizer1.nextElement());
        }
        System.out.println();
        while (stringTokenizer2.hasMoreElements()){
            System.out.println(stringTokenizer2.nextElement());
        }
        System.out.println();
        while (stringTokenizer3.hasMoreElements()){
            System.out.println(stringTokenizer3.nextElement());
        }
    }
}
