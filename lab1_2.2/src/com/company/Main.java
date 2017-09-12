package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = sc.nextLine();
        System.out.println("Ваше имя " + name);
    }
}
