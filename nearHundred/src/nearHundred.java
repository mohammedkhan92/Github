public class nearHundred {

    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
        System.out.println(true);
    }

    public boolean nearHundred(int n) {
        if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
            return true;
        } else {
            return false;
        }
    }
}


