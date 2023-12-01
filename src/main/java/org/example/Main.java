package org.example;

public class Main {
    public static void main(String[] args) {
        Car corolla = new Car();
        corolla.setTopSpeed(220);
        System.out.println(corolla.getTopSpeed());
        corolla.openTrunk();

    }
}