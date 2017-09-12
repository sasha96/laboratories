package com.company;

public class Main {

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i < 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                if (suma < 10) {
                    System.out.println(i);
                    suma += 1;
                }

            }
        }
    }
}
