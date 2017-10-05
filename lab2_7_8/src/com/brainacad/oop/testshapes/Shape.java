package com.brainacad.oop.testshapes;

public class Shape {
    public double calcArea() {
        System.out.print(getClass().getSimpleName() + " area is : " );
        return 0.0;
    }

    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        return "This is : " + getClass().getSimpleName() + " , color is : " + getShapeColor();
    }
}
