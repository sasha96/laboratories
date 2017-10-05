package com.brainacad.oop.testshapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red");
        System.out.println(shape.toString());
        System.out.println(shape.calcArea());
    }
}
