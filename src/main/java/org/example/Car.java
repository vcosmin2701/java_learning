package org.example;

public class Car extends Vehicle{
    private String bodyStyle;

    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }

    public void carDetails() {
        printDetails();
        System.out.println("Body Style: " + bodyStyle);
    }
}
