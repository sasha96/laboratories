package com.brainacad.oop.testgenerics1;

public class MyTuple<A, B, C> {
    private A name;
    private B age;
    private C height;

    MyTuple(A name, B age, C height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public C getHeight() {
        return height;
    }

    public B getAge() {

        return age;
    }

    public A getName() {
        return name;

    }
}
