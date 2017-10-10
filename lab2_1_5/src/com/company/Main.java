package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("write length of array");
        int result = scanner.nextInt();
        Computer computer[] = new Computer[result];
        System.out.println("your array has length = " + result);
        System.out.println("write " + result + " numbers and I multiply your numbers on 10%");

        for (int i = 0; i <= computer.length - 1; i++) {
            computer[i] = new Computer();
            int var = scanner.nextInt();
            computer[i].setPrice(var);
            computer[i].view() ;
        }
    }
}
