package com.company;

public class Main {

    public static void main(String[] args) {
	int[][] array = new int[4][4];
	int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                    array[j][i] = k ;
                    k++;
                }
            }
            for (int[] w: array) {
                for (int t : w) {
                    System.out.print(" | " + t + " | ");
                }
                System.out.println();
            }
        }

    }

