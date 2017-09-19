package com.company;

public class Computer {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price + price*0.1;
    }
}
