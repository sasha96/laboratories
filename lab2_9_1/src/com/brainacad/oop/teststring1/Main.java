package com.brainacad.oop.teststring1;

public class Main {
    static String myStr = "abracadabra";

    public static void main(String[] args) {
        System.out.println(myStr.indexOf("ra"));
        System.out.println(myStr.lastIndexOf("ra"));
        System.out.println(myStr.substring(3, 7));
        reservingString(myStr);
    }

    public static StringBuilder reservingString(String myStr) {
        StringBuilder stringBuilder = new StringBuilder(myStr);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        return stringBuilder;
    }
}
