package com.khan.MyFirstHelloworldProject;

public class Mainclass {
    public static void main (String[] args){
      Bird eagle = new Bird();
      eagle.Color = "Brown";
      eagle.canFly = true;

      Vehicle car = new Vehicle();
      car.noOfDoors = 4;
      car.noOfTyres = 4;
      car.mileage = 20;
      car.maxSpeed = 200;

      System.out.println(new Vehicle());


    }

}
