package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        System.out.println("введіть довільне число ,програма покаже всі perfect number від 0 і до вашого числа");
        int max = sc.nextInt();
        for (min = 1; min < max; min++) {
            int suma = 0;
            for (int j = 1; j < min; j++) {
                if ((min % j) == 0) {
                    suma += j;
                }

            }
            if (suma == min) {
                System.out.println(suma);
            }
        }
    }
}
