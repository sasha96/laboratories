package com.brainacad.oop.testmap1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        MyTranslator myTranslator = new MyTranslator(hashMap);
        myTranslator.addNewWord("кот", "cat");
        myTranslator.addNewWord("собока", "dog");
        Scanner scanner = new Scanner(System.in);
        String stringKey = scanner.nextLine();
        String stringValue = scanner.nextLine();
        myTranslator.addNewWord(stringKey, stringValue);
        MyTranslator.translate(stringKey);
    }
}
