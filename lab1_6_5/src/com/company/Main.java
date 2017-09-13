package com.company;

public class Main {

    public static void main(String[] args) {
	int matrix [][] = {
	        {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };
        System.out.println("Первоначальна матриця");
        for (int [] t:
                matrix) {
            for (int w:
                    t) {
                System.out.print(w + " ");
            }
            System.out.println();
        }

        int temp = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < i ; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("Матриця перевернута ");
        for (int [] t:
             matrix) {
            for (int w:
                 t) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }
}
