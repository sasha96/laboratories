package com.brainacad.oop.testwrapper;

public class Main {
    public static void main(String[] args) {
        Integer x1 = 33;
        Integer x2 = new Integer(33);
        Integer x3 = Integer.valueOf(33);
        Integer x4 = Integer.parseInt("33");

        System.out.println(x1==x2);
        System.out.println(x1==x3);
        System.out.println(x1==x4);
        System.out.println(x2==x3);
        System.out.println(x2==x4);
        System.out.println(x3==x4);

        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println(x2.equals(x3));
        System.out.println(x2.equals(x4));
        System.out.println(x3.equals(x4));
    }
}
