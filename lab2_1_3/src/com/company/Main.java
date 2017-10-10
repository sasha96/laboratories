package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Computer arr[] = new Computer[5];
        for (int i = 0; i < arr.length; i++) {
            Computer computer = new Computer();
            arr[i] = computer;
        }
        System.out.println(Arrays.toString(arr));
    }
}
