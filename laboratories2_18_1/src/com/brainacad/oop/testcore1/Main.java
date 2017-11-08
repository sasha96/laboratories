package com.brainacad.oop.testcore1;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        factorail(random());
    }

    private static int random() {
        int n = (int) (Math.random() * 50 + 1);
        if (n <= 50 && n >= 10)
            return n;
        else
            return random();
    }

    private static void factorail(int n) {
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigInteger);
    }
}
