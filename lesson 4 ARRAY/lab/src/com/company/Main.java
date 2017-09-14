package com.company;


public class Main {

    public static void main(String[] args) {


        int[] array = new int[]{5, 5, 1, 9, 9, 9, 2, 1, 0};
        int[] array_2 = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array_2[i]++;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < array_2.length; i++) {
            if (array_2[i] > res) {
                res = array_2[i];
            }
        }
        System.out.println("Найчастіше повторюється число " + array[res]);
    }
}
