package com.brainacad.testmygen;

import java.util.ArrayList;
import java.util.List;

public class MyNumGenerator {
    private int numOfElem;
    private int maxNumb;

    public MyNumGenerator(int numOfElem, int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
    }

    public List generate() {
        List list = new ArrayList();
        for (int i = 0; i <= numOfElem; i++) {
            int res = (int) (Math.random() * maxNumb + 1);
            list.add(res);
        }
        return list;
    }
}
