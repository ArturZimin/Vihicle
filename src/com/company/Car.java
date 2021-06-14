package com.company;

public class Car extends Vehicle {

    private String car;
    private double engineVolume;

    public Car(String car, Fuel fuel, double engineVolume) {
        super(car);
        this.car = car;
        this.engineVolume = engineVolume;

    }

    @Override
    public String toString() {
        return "Car{" +
                "car='" + car + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
