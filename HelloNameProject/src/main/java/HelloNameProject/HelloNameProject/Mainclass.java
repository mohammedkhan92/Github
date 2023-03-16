package HelloNameProject.HelloNameProject;

public class Mainclass {

    public static void main (String[] args){

        Bird bird1 = new Bird();
        bird1. name = "Eagle";
        bird1.color = "Brown";
        bird1.canfly = true;

        Bird bird2 = new Bird();
        bird2.name = "Penguin";
        bird2.color = "Black and White";
        bird2.canfly = false;

        System.out.println(bird1);
        System.out.println(bird2);


        Department dept1 = new Department();
        dept1.name = "Physics";
        dept1.address = "Hyderabad";

        Department dept2 = new Department();
        dept2.name = "Socail";
        dept2.address = "Fremont";

        System.out.println(dept1);
        System.out.println(dept2);
    }

}
