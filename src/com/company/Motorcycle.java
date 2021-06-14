package com.company;

public class Motorcycle extends Vehicle {

    private String nameMotorcyle;
    private String color;

    public Motorcycle(String nameMotorcyle, String color) {
        this.nameMotorcyle = nameMotorcyle;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Motorcycle{" +
                "nameMotorcyle='" + nameMotorcyle + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
