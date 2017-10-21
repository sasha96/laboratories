package com.brainacad.oop.testnet1;

public class Main {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook1 = new MyPhoneBook();
        MyPhoneBook myPhoneBook2 = new MyPhoneBook();
        MyPhoneBook myPhoneBook3 = new MyPhoneBook();
        MyPhoneBook myPhoneBook4 = new MyPhoneBook();
        MyPhoneBook myPhoneBook5 = new MyPhoneBook();
        myPhoneBook1.addPhoneNumber("pasha","234");
        myPhoneBook2.addPhoneNumber("sasha","4234");
        myPhoneBook3.addPhoneNumber("vlad","234");
        myPhoneBook4.addPhoneNumber("vadim","567");
        myPhoneBook5.addPhoneNumber("leha","564");
        myPhoneBook1.printPhoneBook(myPhoneBook1);
        myPhoneBook2.printPhoneBook(myPhoneBook2);
        myPhoneBook3.printPhoneBook(myPhoneBook3);
        myPhoneBook4.printPhoneBook(myPhoneBook4);
        myPhoneBook5.printPhoneBook(myPhoneBook5);


    }
}
