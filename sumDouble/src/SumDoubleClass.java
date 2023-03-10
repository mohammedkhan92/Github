public class SumDoubleClass {
    public static void main(String[] args) {
        System.out.println(sumDouble(10, 12));
        System.out.println(sumDouble(13, 13));
        System.out.println(sumDouble(10, 10));
        System.out.println(sumDouble(7, 7));
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        } else {
            return (a + b);
        }
    }
}
