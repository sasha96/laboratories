package com.brainacad.oop.testgenerics1;

public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("Ivan", 22, 180L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(200.0, "15", "177");
    }
}
