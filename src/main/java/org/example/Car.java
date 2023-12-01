package org.example;

public class Car extends Vehicle{
    private String bodyStyle;

    public Car(String make, String color, int year, String model, String bodyStyle) {
        super(make, color, year, model);
        this.bodyStyle = bodyStyle;
    }

    public Car(){
        super();
        this.bodyStyle = "none";
    }

    public void carDetails() {
        printDetails();
        System.out.println("Body Style: " + bodyStyle);
    }

    public void openTrunk() {
        System.out.println("The Car trunk is Open Now");
    }
}
