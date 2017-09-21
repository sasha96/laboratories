package com.company;

// create Class Matrix,which have add and multiple method
public class Matrix {
    public int[] addOperation(int[] array1, int[] array2) {
        int[] suma = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            suma[i] = array1[i] + array2[i];
        }
        return suma;
    }

    public int[] multipleOperation(int[] array1, int[] array2) {
        int[] multiple = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            multiple[i] = array1[i] * array2[i];
        }
        return multiple;
    }
}
