package com.company;

public class Computer {
    private double price;

    public double getPrice() {
        return price;
    }

    public void incrementPrice(double price) {
        this.price = price + price * 0.1;
    }
}
