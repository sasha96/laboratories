package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть будь яке натуральне число");
        int w = sc.nextInt();
        int sum = 0;
        int avg = 0;
        for (int i = 0; i <= w; i++) {
            sum += i;
        }
        avg = sum / w;
        System.out.println("сума всых натуральних чисел равна " + sum);
        System.out.println("середне число равно " + avg);
    }
}
