package com.brainacad.generics2;

public class MyTestMethods<T extends Number > {

    public static <T extends Number> int calcNum(Integer[] array, int maxElem) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
          if (array[i]>maxElem){
                ++count;}
        }
        return count;
    }
}