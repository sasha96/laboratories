package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть int x входить в діапазон [0-9]");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("один");
        }
        if (x == 2) {
            System.out.println("два");
        }
        if (x == 3) {
            System.out.println("три");
        }
        if (x == 4) {
            System.out.println("чотири");
        }
        if (x == 5) {
            System.out.println("пять");
        }
        if (x == 6) {
            System.out.println("шість");
        }
        if (x == 7) {
            System.out.println("сім");
        }
        if (x == 8) {
            System.out.println("вісім");
        }
        if (x == 9) {
            System.out.println("деветь");
        }
        if (x > 9 || x < 1) {
            System.out.println("ви ввели число яке невходить в діапазон [0-9]");
        }
    }
}
