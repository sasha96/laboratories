package com.braincad.oop.testing3;

public class Main {

    public static void main(String[] args) {
        String str = "Using methods of class string";
        unique(str);
    }

    public static String unique(String str) {
        for (int i = 0; i < str.length(); i++) {
            String string = str.substring(0, i) + str.substring(i + 1, str.length());
            if (string.indexOf(str.charAt(i)) == -1) {
                System.out.print(str.charAt(i));
            }
        }
        return str;
    }
}