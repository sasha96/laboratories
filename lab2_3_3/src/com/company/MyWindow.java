package com.company;

public class MyWindow {

    public static void main(String[] args) {

    }

    private int width;
    private int height;
    private String numberOfGlass;

    public MyWindow() {
        width = 10;
        height = 20;
        numberOfGlass = "first constructor";
    }

    public MyWindow(int width) {
        this.width = width;
    }

    public MyWindow(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public MyWindow(int height, int weight, String numberOfGlass) {
        this.height = height;
        this.width = width;
        this.numberOfGlass = numberOfGlass;
    }
}
