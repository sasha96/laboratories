package com.brainacad.oop.testwrapper2;

public class Main {
    public static void main(String[] args) {
        System.out.println(compute(32, (short) 44));
    }

    public static Byte compute(Integer integerNumber, Short shortNumber) {
        Byte byteNumber = (byte) (integerNumber + shortNumber);
        return byteNumber;
    }
}
