package org.example;

public class Vehicle {
    private String make;
    private String color;
    private int year;
    private String model;

    int fuelCap = 90;

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public Vehicle() {
        this.make = "none";
        this.color = "none";
        this.year = 0;
        this.model = "none";
    }

    public void printDetails() {
        System.out.println("Manufacturer: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Model: " + model);
    }
}
