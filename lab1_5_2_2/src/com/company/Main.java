package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введыть число в дыапазоны выд 1 до 9");
        int x = sc.nextInt();
        String answer = "";
        switch (x) {
            case 1:
                answer = "один";
                break;
            case 2:
                answer = "два";
                break;
            case 3:
                answer = "три";
                break;
            case 4:
                answer = "чотири";
                break;
            case 5:
                answer = "пять";
                break;
            case 6:
                answer = "шесть";
                break;
            case 7:
                answer = "сем";
                break;
            case 8:
                answer = "восим";
                break;
            case 9:
                answer = "девять";
                break;
            default:
                System.out.println("ви ввели число яке не входить в дыапазон выд 0 до 9");

        }
        System.out.println(answer);
    }
}
