public class Array {

    public static void main(String[] args) {
        Oddnumber();
    }

    public static void Oddnumber() {
        int a[] = {2, 4, 3, 7, 19, 17};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}