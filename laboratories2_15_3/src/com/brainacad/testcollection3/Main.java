package com.brainacad.testcollection3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            arrayList.add("num_" + i);
            linkedList.add("num_" + i);
        }
        Iterator<String> iterator1 = arrayList.iterator();
        Iterator<String> iterator2 = linkedList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                arrayList.set(i, linkedList.get(i));
            }
        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}
