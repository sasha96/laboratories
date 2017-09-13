package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть будь-яке двох-значне натуральне число і я порахую суму чисел квадратів даного числа");
        String s = sc.nextLine();
        int i = Integer.parseInt(s.substring(1));
        int j = Integer.parseInt(s.substring(0, 1));
        i = i * i;
        j = j * j;
        int suma = i + j;
        System.out.println("квадрат першого числа " + j);
        System.out.println("квадрат другого числа " + i);
        System.out.println("його сума стоновить " + suma);
    }
}
