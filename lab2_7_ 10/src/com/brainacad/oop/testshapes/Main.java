package com.brainacad.oop.testshapes;

import sun.security.provider.SHA;

public class Main {
    public static void main(String[] args) {
        double sumArea = 0.0;
        double sumTriangleArea = 0.0;
        double sumCircleArea = 0.0;
        double sumRectArea = 0.0;

        Shape array[] = {new Rectangle("red", 10, 20), new Rectangle("purple", 15, 24),
                new Rectangle("gray", 10, 20), new Rectangle("fiolet", 10, 20),
                new Rectangle("green", 20, 23), new Circle("yelolow", 10),
                new Circle("blue", 11), new Triangle("write", 5, 5, 5), new Triangle("black", 7, 5, 4)
        };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString() + " area is : ");
            System.out.print(array[i].calcArea());
            System.out.println();
            sumArea += array[i].calcArea();
            if (array[i] instanceof Circle) {
                sumCircleArea+=array[i].calcArea();
            }
            if (array[i] instanceof Triangle) {
                sumTriangleArea+=array[i].calcArea();
            }
            if (array[i] instanceof Rectangle) {
                sumRectArea+=array[i].calcArea();
            }
        }
        System.out.println("sumArea all Shape " + sumArea);
        System.out.println("Rectangles total area : " + sumRectArea);
        System.out.println("Circle total area : " + sumCircleArea);
        System.out.println("Triangle total area : " + sumTriangleArea);

    }
}