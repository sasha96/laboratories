package com.braincad.shapes;

import static java.lang.Math.sqrt;

public class Triangle {
    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;
    private double s = 0.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = (a + b + c) / 2;
    }

    public double getArea() {
        a = sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(a);
        return a;
    }
}
