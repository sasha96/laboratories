package com.brainacad.oop.testexcp1;

public class Main {

    public static void main(String[] args) throws Exception {
        String a = "Throws Exception";
        try {
            throw new Exception(a);
        } catch (Exception e) {
            System.out.println(a);
        } finally {
            System.out.println("finally");
        }
    }
}
