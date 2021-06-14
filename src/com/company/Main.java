package com.company;

public class Main {


    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Minsk c4250", "red");
        System.out.println(motorcycle);
        Car car = new Car("Audi", Fuel.GASOLINE95, 2.0);
        System.out.println(car);
        Vehicle<String> vehicle = new Vehicle("Bike 'Aist");
        Vehicle<String> vehicle1 = new Vehicle("Scooter 'BMW");

        String[] garages = new String[2];
        garages[0] = new String("Bike");
        garages[1] = new String("Scooter");

        for (int i = 0; i < garages.length; i++) {
            System.out.println("There is a " + garages[i] + " in the garage ");
        }


        for (Fuel m : Fuel.values()) {
            System.out.println(m + " " + m.getCostFuelLitr());
        }

    }
}
