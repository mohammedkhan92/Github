package com.khan.MyFirstHelloworldProject;

public class Vehicle {
    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfTyres=" + noOfTyres +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", mileage=" + mileage +
                '}';
    }

    public int noOfTyres;
    public int noOfDoors;
    public int maxSpeed;
    public int mileage;
}
