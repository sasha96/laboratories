package com.brainacad.testmygen;

public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 64);
        System.out.println(myNumGenerator.generate());

    }
}
