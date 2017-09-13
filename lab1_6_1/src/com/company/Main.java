package com.company;

public class Main {

    public static void main(String[] args) {
        int amount = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                amount++;
            }
        }
        int[] array = new int[amount];
        for (int j = 1; j < 30; j++) {
            if (j % 2 == 0) {
                array[j / 2] = j;
            }
        }
        for (int s : array) {
            System.out.println(s);
        }
    }

}
