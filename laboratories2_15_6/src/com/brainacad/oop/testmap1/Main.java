package com.brainacad.oop.testmap1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        MyTranslator myTranslator = new MyTranslator(hashMap);
        myTranslator.addNewWord("кот", "cat");
        myTranslator.addNewWord("собока", "dog");

    }
}
