package com.company;

import java.util.Arrays;
import java.util.Objects;


public class Vehicle<T> {
    private T[] vehicleArray;
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle() {
    }

    public void load(T vehicleArray[]) {
        this.vehicleArray = vehicleArray;
        }


    public T[] unload() {
        T[] vehicleArray = this.vehicleArray;
        this.vehicleArray = null;
        return vehicleArray;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleArray=" + Arrays.toString(vehicleArray) +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle<?> vehicle = (Vehicle<?>) o;
        return Arrays.equals(vehicleArray, vehicle.vehicleArray) && Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(vehicleArray);
        return result;
    }
}
