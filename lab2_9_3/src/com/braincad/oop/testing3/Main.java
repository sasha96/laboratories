package com.braincad.oop.testing3;

public class Main {

    public static String str1;
    public static String str2;

    public static void main(String[] args) {
        String str = "Using methods of class string";
        String str4 = "Using methods of class string";
        System.out.println(unique(str,str4));

    }

    public static String unique(String str,String str4) {
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str4.charAt(i))!=-1){
            str2 = str.substring(0, i);
            str1 = str.substring(i + 1);
            str = str2 + str1;
            }
        }
        System.out.println(str);
        return str;
    }
}