package com.brainacad.oop.testregaxp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String array[] = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
        for (int i = 0; i < array.length; i++) {
            checkPersonWithRegExp(array[i]);
        }
    }

    public static boolean checkPersonWithRegExp(String userNameString) {

        String first = userNameString.substring(0, 1);
        String last = userNameString.substring(1, userNameString.length());
        Pattern pattern = Pattern.compile(first);
        Matcher matcher = pattern.matcher(first.toUpperCase());
        Pattern pattern2 = Pattern.compile(last);
        Matcher matcher2 = pattern2.matcher(last.toLowerCase());

        if (userNameString.matches("^\\D*$") && matcher2.matches() && matcher.matches() && userNameString.trim().length() != 0) {
            System.out.println("This string  " + userNameString + "  begin from Uppercase, then other chars in Lowercase and contains only letters ");
            return true;
        } else {
            return false;
        }
    }
}
