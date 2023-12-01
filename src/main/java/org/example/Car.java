package org.example;

public class Car extends Vehicle{
    private String bodyStyle;

    int fuelCap = 50;

    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }

    public Car() {
        super();
        this.bodyStyle = "none";
    }

    public void carDetails() {
        printDetails();
        System.out.println("Body Style: " + bodyStyle);
    }

    public void display() {
        System.out.println("Fuel Capacity on Vehicle Class: " + super.fuelCap);
        System.out.println("Fuel Capacity on Car Class: " + fuelCap);
    }

    public void printOut() {
        System.out.println("The display() call with super");
        super.display();
        System.out.println("The display() call without super");
        display();
    }
}
