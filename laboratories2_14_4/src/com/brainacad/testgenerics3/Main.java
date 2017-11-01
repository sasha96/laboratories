package com.brainacad.testgenerics3;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        MyMixer myMixer = new MyMixer(integers);
        myMixer.shuffle();
        String[] strings = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        MyMixer myMixer2 = new MyMixer(strings);
        myMixer2.shuffle();
        for (Integer w :
                integers) {
            System.out.print(w + " ");
        }
        System.out.println();
        for (String s :
                strings) {
            System.out.print(s + " ");
        }
    }
}
