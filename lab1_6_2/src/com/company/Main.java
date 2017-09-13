package com.company;

public class Main {

    public static void main(String[] args) {
        int min = 100;
        int max = 0;
        int avr = 0;
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        for (int i = 0; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
            if (m[i] < min) {
                min = m[i];
            }
            avr += m[i];
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(avr / m.length);
    }
}
