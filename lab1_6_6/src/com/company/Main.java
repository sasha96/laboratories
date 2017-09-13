package com.company;


public class Main {

    public static void main(String[] args) {
        double[] array = {-0.8, -0.7, 5.1, 9.7, 16.0, 20.4, 21.9, 22.6, 17.8, 7.3, 4.7, 1.9};//середньомісячна
        // температура в м. Києві 2015р
        double var = 0.;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    var = array[i];
                    array[i] = array[j];
                    array[j] = var;
                }
            }
        }
        for (double result : array) {
            System.out.println(result);
        }
    }
}
