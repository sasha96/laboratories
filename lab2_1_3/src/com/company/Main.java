package com.company;

import java.util.Arrays;

public  class Main {


    public static void main(String[] args) {
       Class arr[] = new Class[5];
        for (int i = 0; i <arr.length ; i++) {
            Class Class = new Class();
            arr[i]=Class;
        }
        System.out.println(Arrays.toString(arr));
    }
}
