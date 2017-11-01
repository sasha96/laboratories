package com.brainacad.oop.testmap1;

import java.util.HashMap;

public class MyTranslator {
    private HashMap<String, String> dictionary;

    public MyTranslator(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

}
