package com.brainacad.testcollection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listLinked = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            int random = (int) (10 * Math.random() + 1);
            listLinked.add("num_" + random);
        }
        Iterator iterator = listLinked.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
