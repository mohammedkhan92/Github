package HelloNameProject.HelloNameProject;

public class Bird {
    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", canfly=" + canfly +
                '}';
    }

    public String name;
    public String color;
    public boolean canfly;

}
