package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i]==1){
                    System.out.println("van");
                }

            }
        }


        // Find the maximal sum platform of size 2 x 2



//        for (int[] t : matrix) {
//            for (int y : t) {
//                System.out.print(y);
//            }
//            System.out.println();
        //}

    }
}
