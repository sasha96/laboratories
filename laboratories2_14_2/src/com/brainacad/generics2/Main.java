package com.brainacad.generics2;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1,10, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer res = MyTestMethods.calcNum(integers, 7);
        System.out.println(res);
    }
}
