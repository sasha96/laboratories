package com.brainacad.oop.testnet1;

public class MyPhoneBook {

    private static PhoneNumber phoneNumber[] = new PhoneNumber[10];

    public void addPhoneNumber(String name, String phone) {
        int i = 0;
        phoneNumber[i] = new PhoneNumber(name, phone);
        i++;
    }

    public static void printPhoneBook(MyPhoneBook ph) {
        System.out.println(ph.toString());
    }


    static class PhoneNumber {
        private String name;
        private String phone;

        PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return getName() + getPhone();
        }
    }

}
