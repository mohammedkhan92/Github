package com.khan.MyFirstHelloworldProject;

public class Bird {
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                ", canFly=" + canFly +
                '}';
    }

    public String name;
    public String Color;
    public boolean canFly;

}
