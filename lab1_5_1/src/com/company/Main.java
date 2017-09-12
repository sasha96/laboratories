package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 9; i > 0; i--) {
            for (int j = 9; j > i; j--) {
                System.out.print(j - i);
            }
            System.out.println();
        }
    }
}
