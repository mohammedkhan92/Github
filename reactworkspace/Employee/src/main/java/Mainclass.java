public class Mainclass {
    public static void main(String[] args){
        Employee emp1 =new Employee(1234,"sunil");
        Employee emp2 =new Employee(1234,"sunil");

        System.out.println(emp1.hashCode());
        System.out.println(emp1.hashCode());
        System.out.println(emp1.equals(emp2));
    }
}
