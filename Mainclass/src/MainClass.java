public class MainClass {

    public static void main(String[] args){
        Bird Bird1 = new Bird();
        Bird1.name = "eagle";
        Bird1.color = "Brown";
        Bird1.canFly = true;

        Vehicle car = new Vehicle();
        car.noOfDoors = 4;
        car.noOfMileage = 200;
        car.noOfMirrors = 6;
        car.noOfTyres = 4;

        System.out.println(car);
    }
}
