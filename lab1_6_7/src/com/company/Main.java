package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Перед вами матриця [4][5]");
        int matrix[][] = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}
        };
        for (int arr[] : matrix) {
            for (int arr2 : arr) {
                System.out.print(arr2 + " ");
            }
            System.out.println();
        }
        System.out.println(" Введіть якеcь число від 1 до 4 і я скажу вам його індекс в рядку ");
        int var = scanner.nextInt();
        System.out.println("ви ввели чило " + var);
        String res = null;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    if (matrix[i][j] == var) {
                        System.out.println("Line 1 : " + "[" + j + "]");
                    }
                }
                if (i == 1) {
                    if (matrix[i][j] == var) {
                        System.out.println("Line 2 : " + "[" + j + "]");
                    }
                }
                if (i == 2) {
                    if (matrix[i][j] == var) {
                        System.out.println("Line 3 : " + "[" + j + "]");
                    }
                }
                if (i == 3) {
                    if (matrix[i][j] == var) {
                        System.out.println("Line 4 : " + "[" + j + "]");
                    }
                }
            }
        }
    }
}


