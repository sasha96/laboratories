package example.testpack;

import com.braincad.Car;
import example.applepack.Apple;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.setWeight(10.);
        apple.getWeight();
        Car car = new Car();
        car.setWeight(15.);
        car.getWeight();
    }
}
