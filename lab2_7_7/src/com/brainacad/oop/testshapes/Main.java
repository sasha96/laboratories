package com.brainacad.oop.testshapes;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape("red");
//        System.out.println(shape.toString());
//        System.out.println(shape.calcArea());
        Circle circle = new Circle("blue",10);
        System.out.println(circle.toString());
        System.out.println(circle.calcArea());
    }
}
