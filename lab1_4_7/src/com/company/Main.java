package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("write two variables please");
        System.out.println("write first please");
        int i = Integer.parseInt(sc.next());
        System.out.println("write second please");
        int q = Integer.parseInt(sc.next());
        boolean b = true;
        System.out.println("if boolean statments is true will be first variables else second");
        System.out.println(b ? i : q);
    }
}
