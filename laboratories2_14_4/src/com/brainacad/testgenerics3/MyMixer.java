package com.brainacad.testgenerics3;

import java.util.Random;

public class MyMixer<T> {
    T arrName[];

    public MyMixer(T array[]) {
        this.arrName = array;
    }

    public T[] shuffle() {
            int index;
            T temp;
            Random random = new Random();
            for (int i = arrName.length - 1; i > 0; i--) {
                index = random.nextInt(i + 1);
                temp = arrName[index];
                arrName[index] = arrName[i];
                arrName[i] = temp;
            }
        return arrName;
    }
}
