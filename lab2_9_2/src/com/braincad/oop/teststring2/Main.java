package com.braincad.oop.teststring2;

public class Main {
    public static void main(String[] args) {
        String myString1 = "cartoon";
        String myString2 = "tomcat";

        for (int i = 0; i < myString1.length(); i++) {
            if (myString2.indexOf(myString1.charAt(i))==-1){
                System.out.println(myString1.charAt(i));
            }
        }
    }
}
