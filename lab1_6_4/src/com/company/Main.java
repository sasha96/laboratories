package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть якою довжиною буде масив чисел");
        int lon = sc.nextInt();
        int[] array = new int[lon];
        System.out.println("довжина масіва становить " + lon);
        System.out.println("введыть числа якими ви заповните масив");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("масив успішно заповнений " + Arrays.toString(array));
        System.out.println("отсортыруэм масів ");
        Arrays.sort(array);
        System.out.println("отсортірований масів " + Arrays.toString(array));
        System.out.println("зробимо бінарний пошук");
        System.out.println("введіть число з масиву для пошуку");
        int binary = sc.nextInt();
        int result = Arrays.binarySearch(array, binary);
        System.out.println("ваше число маэ індекс " + result);
        System.out.println("Дякую");
    }
}
