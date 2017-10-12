package com.braincad.oop.testing3;

public class Main {
    public static String str = "Using methods of class String";

    public static void main(String[] args) {
        uniqueChars(str);
    }
    public static int uniqueChars(String string) {
char ch [] = new char[100];
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) != string.charAt(j)) {
                   // System.out.println(string.charAt(i));
                    ch[i]=string.charAt(i);
                }
            }
        }
        for (char c:
             ch) {
            System.out.println(c);

        }
        return 0;
    }
}
