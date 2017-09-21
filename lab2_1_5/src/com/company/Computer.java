package com.company;

public class Computer {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price + price * 0.1;
    }

    public void view(int i) {
        System.out.println(price);
    }
}
