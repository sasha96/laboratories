package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int array1[] = new int[5];
        int array2[] = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10);
            array2[i] = (int) (Math.random() * 10);
        }
        for (int w :
                array1) {
            System.out.print(w + " ");
        }
        System.out.println("");
        for (int w :
                array2) {
            System.out.print(w + " ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(matrix.addOperation(array1, array2)));
        System.out.println(Arrays.toString(matrix.multipleOperation(array1, array2)));

    }
}
