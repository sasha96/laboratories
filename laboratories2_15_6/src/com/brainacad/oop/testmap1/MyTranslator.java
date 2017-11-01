package com.brainacad.oop.testmap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyTranslator {
    private static HashMap<String, String> dictionary = new HashMap<>();

    public MyTranslator(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    void addNewWord(String en, String ru) {
        dictionary.put(en, ru);
    }

    public static void translate(String name) {
        Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry test = iterator.next();
            if (test.getKey().equals(name)) {
                System.out.println(test.getKey() + " " + test.getValue());
            }
        }
    }
}
