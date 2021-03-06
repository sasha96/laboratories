package com.brainacad.oop.testshapes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double s;

    public double getS() {
        return s = (a + b + c) / 2;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calcArea() {
        return Math.sqrt(getS() * (getS() - a) * (getS() - b) * (getS() - c));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", color : " + getShapeColor() + " a = " + getA() + " b = " + getB() + " c = " + getC();
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
